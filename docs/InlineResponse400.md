
# InlineResponse400

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**submitTimeUtc** | **String** | Time of request in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC.  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the submitted transaction. |  [optional]
**reason** | [**ReasonEnum**](#ReasonEnum) | The reason of the status.  |  [optional]
**message** | **String** | The detail message related to the status and reason listed above. |  [optional]
**details** | [**List&lt;InlineResponse201ErrorInformationDetails&gt;**](InlineResponse201ErrorInformationDetails.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
REQUEST | &quot;INVALID_REQUEST&quot;


<a name="ReasonEnum"></a>
## Enum: ReasonEnum
Name | Value
---- | -----
MISSING_FIELD | &quot;MISSING_FIELD&quot;
INVALID_DATA | &quot;INVALID_DATA&quot;
DUPLICATE_REQUEST | &quot;DUPLICATE_REQUEST&quot;
INVALID_CARD | &quot;INVALID_CARD&quot;
CARD_TYPE_NOT_ACCEPTED | &quot;CARD_TYPE_NOT_ACCEPTED&quot;
INVALID_MERCHANT_CONFIGURATION | &quot;INVALID_MERCHANT_CONFIGURATION&quot;
PROCESSOR_UNAVAILABLE | &quot;PROCESSOR_UNAVAILABLE&quot;
INVALID_AMOUNT | &quot;INVALID_AMOUNT&quot;
INVALID_CARD_TYPE | &quot;INVALID_CARD_TYPE&quot;
DEBIT_CARD_USEAGE_EXCEEDD_LIMIT | &quot;DEBIT_CARD_USEAGE_EXCEEDD_LIMIT&quot;



