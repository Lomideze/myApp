package com.example.myapplication

import com.squareup.moshi.Json

data class DataClass(
    val id: String,
    val projectId: String,
    val equipmentId: String,
    val status: String,
    val requestedBy: String,
    val acceptedBy: Any?,
    val author: String,
    val category: String,
    val locations: Locations,
    val filters: List<Filters>,
    val type: String,
    val organization: String,
    val address: String,
    val startDate: String,
    val endDate: String,
    val description: Any?,
    val prolongDates: List<Any?>,
    val releaseDates: List<Any?>,
    val isDummy: Boolean,
    val hasDriver: Boolean,
    val overwriteDate: Any?,
    val metaInfo: Any?,
    val warehouseId: Any?,
    val rentalDescription: Any?,
    val internalTransportations: InternalTransportations,
    val startDateMilliseconds: Long,
    val endDateMilliseconds: Long,
    val equipment: Equipment,

    ) {

    data class Locations(
        val type: String,
        val coordinates: List<Float>,
    )

    data class Filters(
        val name: String,
        val value: Value,
    ) {

        data class Value(
            val max: Int,
            val min: Int,
        )
    }

    data class InternalTransportations(
        val id: String,
        val projectRequestId: String,
        val pickUpDate: String,
        val deliveryDate: String,
        val description: Any?,
        val status: String,
        val startDateOption: Any?,
        val endDateOption: Any?,
        val pickUpLocation: PickUpLocation,
        val deliveryLocation: DeliveryLocation,
    ) {

        data class DeliveryLocation(
            val coordinates: List<Double>,
            val type: String,
        )

        data class PickUpLocation(
            val type: String,
            val coordinates: List<Double>,
        )
    }

    data class Equipment(
        val id: String,
        val title: String,
        val invNumber: String,
        val categoryId: String,
        val modelId: String,
        val brandId: String,
        val year: Int,
        val specifications: List<Specifications>,
        val weight: Int,
        @Json(name = "additional_specifications")
        val additionalSpecifications: Any?,
        val structureId: String,
        val organizationId: String,
        val beaconType: Any?,
        val beaconId: String,
        val beaconVendor: String,
        val RFID: String,
        val dailyPrice: Any?,
        val inactive: Any?,
        val tag: Tag,
        val telematicBox: Any?,
        val createdAt: String,
        @Json(name = "special_number")
        val specialNumber: Any?,
        @Json(name = "last_check")
        val lastCheck: String,
        @Json(name = "next_check")
        val nextCheck: String,
        @Json(name = "responsible_person")
        val responsiblePerson: Any?,
        @Json(name = "test_type")
        val testType: Any?,
        @Json(name = "unique_equipment_id")
        val uniqueEquipmentId: String,
        @Json(name = "bgl_number")
        val bglNumber: String,
        @Json(name = "serial_number")
        val serialNumber: Any?,
        val inventory: Any?,
        val warehouseId: String,
        val trackingTag: Any?,
        val workingHours: Any?,
        @Json(name = "navaris_criteria")
        val navarisCriteria: Any?,
        @Json(name = "dont_send_to_as400")
        val dontSendToAs400: Boolean,
        val model: Model,
        val brand: Brand,
        val category: Category,
        val structure: Structure,
        val wareHouse: Any?,
        val equipmentMedia: List<EquipmentMedia>,
        val telematics: List<Telematics>,
        val isMoving: Boolean,
    ) {

        data class Specifications(
            val key: String,
            val value: String,
        )

        data class Tag(
            val date: String,
            val authorName: String,
            val media: List<Any?>,
        )

        data class Model(
            val id: String,
            val name: String,
            val createdAt: String,
            val brand: Brand,
        ) {

            data class Brand(
                val id: String,
                val name: String,
                val createdAt: String,
            )
        }

        data class Brand(
            val id: String,
            val name: String,
            val createdAt: String,
        )

        data class Category(
            val id: String,
            val name: String,
            @Json(name = "name_de")
            val nameDe: String,
            val createdAt: String,
            val media: List<Any?>,
        )

        data class Structure(
            val id: String,
            val name: String,
            val type: String,
            val color: String,
        )

        data class EquipmentMedia(
            val id: String,
            val name: String,
            val files: List<Files>,
            val modelId: String,
            val modelType: String,
            val createdAt: String,
            val main : Boolean,
            val type: String
        ) {

            data class Files(
                val size: String,
                val path: String,
            )
        }

        data class Telematics(
            val timestamp: Long,
            val eventType: String,
            val projectId: String,
            val equipmentId: String,
            val locationName: String,
            val location: Location,
            val costCenter: String,
            val lastLatitude: Double,
            val lastLongitude: Double,
            val lastLatLonPrecise: Boolean,
            val lastAddressByLatLon: String,
        ) {

            data class Location(
                val type: String,
                val coordinates: List<List<List<List<Double>>>>,
            )
        }
    }
}



