${fileHeader}
<#assign serviceAbbreviation = (metadata.serviceAbbreviation)!metadata.serviceFullName/>
package ${metadata.packageName};

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import ${metadata.packageName}.model.*;
<#if hasWaiters>
import ${metadata.packageName}.waiters.${metadata.syncInterface}Waiters;
</#if>

/**
 * Interface for accessing ${serviceAbbreviation}.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link ${metadata.packageName}.Abstract${metadata.syncInterface}} instead.
 * </p>
<#if metadata.documentation??>
 * <p>
 * ${metadata.documentation}
</#if>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface ${metadata.syncInterface} {

    /**
     * The region metadata service name for computing region endpoints. You can use
     * this value to retrieve metadata (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "${metadata.endpointPrefix}";

<#if customizationConfig.emitClientMutationMethods() >
    /**
     * Overrides the default endpoint for this client<#if metadata.defaultEndpoint?has_content> ("${metadata.defaultEndpoint}")</#if>.
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint <#if metadata.defaultEndpointWithoutHttpProtocol?has_content>(ex: "${metadata.defaultEndpointWithoutHttpProtocol}")</#if> or a full
     * URL, including the protocol<#if metadata.defaultEndpoint?has_content> (ex: "${metadata.defaultEndpoint}")</#if>. If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint">
     * https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint<#if metadata.defaultEndpointWithoutHttpProtocol?has_content> (ex: "${metadata.defaultEndpointWithoutHttpProtocol}")</#if> or a full URL,
     *            including the protocol<#if metadata.defaultEndpoint?has_content> (ex: "${metadata.defaultEndpoint}")</#if> of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for example:
     * {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);
</#if>
  <#if shapes.Region?has_content>
    <#assign regionClassType="com.amazonaws.regions.Region" />
  <#else>
    <#assign regionClassType="Region" />
  </#if>

<#if customizationConfig.emitClientMutationMethods() >
    /**
     * An alternative to {@link ${metadata.syncInterface}#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link ${regionClassType}#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.  Must not be null and must be a
     *            region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see ${regionClassType}#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(${regionClassType} region);
</#if>

  <#list operations?values as operationModel>
    <#if !customizationConfig.skipClientMethodForOperations?seq_contains("${operationModel.operationName}")>
    <@InterfaceMethodForOperationMacro.content metadata operationModel />
    </#if>
  </#list>

  <#if AdditionalInterfaceMethodsMacro??>
    <@AdditionalInterfaceMethodsMacro.content .data_model />
  </#if>

  <#if customizationConfig.skipInterfaceAdditions == false>
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    void shutdown();

    <#assign responseMetadataClassName=customizationConfig.customResponseMetadataClassName!"ResponseMetadata" />
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    ${responseMetadataClassName} getCachedResponseMetadata(AmazonWebServiceRequest request);
  </#if>

  <#if hasWaiters>
    ${metadata.syncInterface}Waiters waiters();
  </#if>

    <#if customizationConfig.presignersFqcn??>
    /**
     * {@link ${customizationConfig.presignersFqcn}} contains extension methods for presigning certain requests. The
     * presigner will use the endpoint and credentials currently configured in the client.
     *
     * @return Presigners utility object.
     */
    ${customizationConfig.presignersFqcn} presigners();
    </#if>
}
