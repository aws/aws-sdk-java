${fileHeader}
package ${metadata.packageName}.endpointdiscovery;

import com.amazonaws.cache.CacheLoader;
import com.amazonaws.endpointdiscovery.Constants;
import ${metadata.packageName}.${metadata.syncInterface};
import ${metadata.packageName}.model.${endpointOperation.syncReturnType};
import ${metadata.packageName}.model.${endpointOperation.input.variableType};
import ${metadata.packageName}.model.Endpoint;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ${className} implements CacheLoader<String, Map<String,String>> {

    private final ${metadata.syncInterface} client;

    public ${className}(${metadata.syncInterface} client) {
        this.client = client;
    }

    @Override
    public Map<String, String> load(String key) {
        ${endpointOperation.syncReturnType} response = client.${endpointOperation.methodName}(new ${endpointOperation.input.variableType}());

        List<Endpoint> endpoints = response.getEndpoints();

        if (endpoints == null || endpoints.size() == 0) {
            return null;
        }

        Endpoint endpoint = endpoints.get(0);

        Map<String, String> endpointDetail = new HashMap<String, String>();
        endpointDetail.put(Constants.CACHE_PERIOD, String.valueOf(endpoint.getCachePeriodInMinutes()));
        endpointDetail.put(Constants.ENDPOINT, endpoint.getAddress());

        return endpointDetail;
    }
}