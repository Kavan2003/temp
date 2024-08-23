package com.example.androidintern


data class JobResponse(
    val results: List<Job>
)

data class Job(
    val id: Int,
    val title: String,
    val type: Int,
    val primary_details: PrimaryDetails,
    val fee_details: FeeDetails,
    val job_tags: List<JobTag>,
    val job_type: Int,
    val job_category_id: Int,
    val qualification: Int,
    val experience: Int,
    val shift_timing: Int,
    val job_role_id: Int,
    val salary_max: Int,
    val salary_min: Int,
    val city_location: Int,
    val locality: Int,
    val premium_till: String,
    val company_name: String,
    val advertiser: Int,
    val button_text: String,
    val custom_link: String,
    val amount: String,
    val views: Int,
    val shares: Int,
    val fb_shares: Int,
    val is_bookmarked: Boolean,
    val is_applied: Boolean,
    val is_owner: Boolean,
    val updated_on: String,
    val whatsapp_no: String,
    val contact_preference: ContactPreference,
    val created_on: String,
    val is_premium: Boolean,
    val creatives: List<Creative>,
    val videos: List<Any>, // This field can potentially hold different data types, so we marked it as Any
    val locations: List<Location>,
    val tags: List<String>,
    val contentV3: ContentV3,
    val status: Int,
    val expire_on: String,
    val job_hours: String,
    val openings_count: Int,
    val job_role: String,
    val other_details: String,
    val job_category: String,
    val num_applications: Int,
    val enable_lead_collection: Boolean,
    val is_job_seeker_profile_mandatory: Boolean,
    val translated_content: Map<String, String>, // This field can hold a key-value pair of translated content
    val job_location_slug: String,
    val fees_text: String,
    val question_bank_id: Any?, // This field can be null, so marked as nullable
    val screening_retry: Any?, // This field can be null, so marked as nullable
    val should_show_last_contacted: Boolean,
    val fees_charged: Int
)

data class PrimaryDetails(
    val Place: String,
    val Salary: String,
    val Job_Type: String,
    val Experience: String,
    val Fees_Charged: String,
    val Qualification: String
)

data class FeeDetails(
    val V3: List<Any> // This field can potentially be empty, so marked as List<Any>
)

data class JobTag(
    val value: String,
    val bg_color: String,
    val text_color: String
)

data class ContactPreference(
    val preference: Int,
    val whatsapp_link: String,
    val preferred_call_start_time: String,
    val preferred_call_end_time: String
)

data class Creative(
    val file: String,
    val thumb_url: String,
    val creative_type: Int
)

data class Location(
    val id: Int,
    val locale: String,
    val state: Int
)

data class ContentV3(
    val V3: List<ContentField>
)

data class ContentField(
    val field_key: String,
    val field_name: String,
    val field_value: String
)