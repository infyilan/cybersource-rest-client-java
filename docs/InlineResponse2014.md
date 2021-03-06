
# InlineResponse2014

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**InlineResponse2013Links**](InlineResponse2013Links.md) |  |  [optional]
**id** | **String** | An unique identification number assigned by CyberSource to identify the submitted request. |  [optional]
**submitTimeUtc** | **String** | Time of request in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC.  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the submitted transaction. |  [optional]
**reconciliationId** | **String** | The reconciliation id for the submitted transaction. This value is not returned for all processors.  |  [optional]
**clientReferenceInformation** | [**InlineResponse201ClientReferenceInformation**](InlineResponse201ClientReferenceInformation.md) |  |  [optional]
**creditAmountDetails** | [**InlineResponse2014CreditAmountDetails**](InlineResponse2014CreditAmountDetails.md) |  |  [optional]
**processorInformation** | [**InlineResponse2013ProcessorInformation**](InlineResponse2013ProcessorInformation.md) |  |  [optional]
**orderInformation** | [**InlineResponse2013OrderInformation**](InlineResponse2013OrderInformation.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;



