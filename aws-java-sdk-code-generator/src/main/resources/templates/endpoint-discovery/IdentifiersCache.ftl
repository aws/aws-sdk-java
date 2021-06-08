${fileHeader}
package ${metadata.packageName}.endpointdiscovery;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.endpointdiscovery.EndpointDiscoveryIdentifiersRefreshCache;
import com.amazonaws.endpointdiscovery.Constants;
import ${metadata.packageName}.${metadata.syncInterface};
import ${metadata.packageName}.model.DescribeEndpointsRequest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ${className} extends EndpointDiscoveryIdentifiersRefreshCache<String> {

    private static final Log log = LogFactory.getLog(${className}.class);

    public ${className}(${metadata.syncInterface} client) {
        super(new ${className}Loader(client));
    }

    @Override
    public URI get(String key, AmazonWebServiceRequest discoveryRequest, boolean required, URI defaultEndpoint) {

        URI endpoint = cache.get(constructKey(key, discoveryRequest));

        if (endpoint != null) {
            return endpoint;
        } else {
            if (!required) {
                cache.put(key, defaultEndpoint);
            }
            return discoverEndpoint(key, discoveryRequest, required, defaultEndpoint);
        }
    }

    @Override
    public URI put(String key, AmazonWebServiceRequest discoveryRequest, Map<String, String> endpointDetails, URI defaultEndpoint) {
        URI discoveredEndpoint = URI.create(String.format("%s://%s", defaultEndpoint.getScheme(), endpointDetails.get(Constants.ENDPOINT)));

        cache.put(key, discoveredEndpoint);
        loadAndScheduleEvict(key, Long.valueOf(endpointDetails.get(Constants.CACHE_PERIOD)), TimeUnit.MINUTES);

        log.debug("Cached new endpoint from service: " + discoveredEndpoint.toASCIIString());
        log.debug("Cached endpoint TTL: " + endpointDetails.get(Constants.CACHE_PERIOD) + " minutes");

        return discoveredEndpoint;
    }

    <#if endpointOperation.inputShape.members?has_content>
    @Override
    public String constructKey(String key, AmazonWebServiceRequest discoveryRequest) {
        if (discoveryRequest == null) {
            return key;
        }

        DescribeEndpointsRequest request = (DescribeEndpointsRequest) discoveryRequest;

        StringBuilder cacheKey = new StringBuilder(key);

        if (request.getIdentifiers() != null) {
            for (String id : request.getIdentifiers().values()) {
                cacheKey.append("$");
                cacheKey.append("id");
            }
        }

        return cacheKey.append("$").append(request.getOperation()).toString();
    }
    <#else>
    @Override
    public String constructKey(String key, AmazonWebServiceRequest discoveryRequest) {
        return key;
    }
    </#if>
}
