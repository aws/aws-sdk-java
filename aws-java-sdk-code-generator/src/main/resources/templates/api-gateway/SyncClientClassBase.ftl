${fileHeader}
<#assign serviceAbbreviation = (metadata.serviceAbbreviation)!metadata.serviceFullName/>
package ${metadata.packageName};

<#if metadata.hasApiWithStreamInput>
import java.io.*;
</#if>
import java.net.*;
import java.util.*;
import java.util.Map.Entry;
import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.opensdk.protect.model.transform.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.ClientHandler;
import com.amazonaws.client.ClientHandler;
import com.amazonaws.client.ClientHandlerParams;
import com.amazonaws.client.ClientExecutionParams;
import com.amazonaws.opensdk.protect.client.SdkClientHandler;
<#if customizationConfig.serviceClientHoldInputStream>
import com.amazonaws.util.ServiceClientHolderInputStream;
</#if>
import ${serviceBaseExceptionFqcn};


import ${metadata.packageName}.model.*;
import ${metadata.packageName}.model.transform.*;

<#assign documentation = (metadata.documentation)!""/>

/**
 * Client for accessing ${serviceAbbreviation}.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * ${documentation}
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
class ${metadata.syncClient} implements ${metadata.syncInterface} {


    private final ClientHandler clientHandler;

    <@AdditionalSyncClientFieldsMacro.content .data_model />

    /**
     * Constructs a new client to invoke service methods on
     * ${serviceAbbreviation} using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientParams Object providing client parameters.
     */
    ${metadata.syncClient}(AwsSyncClientParams clientParams) {
        this.clientHandler = new SdkClientHandler(
            new ClientHandlerParams().withClientParams(clientParams));
    }

<#list operations?values as operationModel>
    <@ClientMethodForOperation.content metadata operationModel />
</#list>

    /**
     * Create the error response handler for the operation.
     * @param errorShapeMetadata Error metadata for the given operation
     * @return Configured error response handler to pass to HTTP layer
     */
    private HttpResponseHandler<SdkBaseException> createErrorResponseHandler(
            JsonErrorShapeMetadata... errorShapeMetadata) {
        return protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata()
                                                                  .withErrorShapes(Arrays.asList(
                                                                          errorShapeMetadata)));
    }

    @Override
    public void shutdown() {
        clientHandler.shutdown();
    }

}
