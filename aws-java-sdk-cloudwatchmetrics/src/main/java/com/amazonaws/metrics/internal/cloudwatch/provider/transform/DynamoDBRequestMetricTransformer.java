/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.metrics.internal.cloudwatch.provider.transform;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.logging.LogFactory;
import com.amazonaws.annotation.ThreadSafe;

import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.metrics.MetricType;
import com.amazonaws.metrics.internal.cloudwatch.spi.AWSMetricTransformerFactory;
import com.amazonaws.metrics.internal.cloudwatch.spi.Dimensions;
import com.amazonaws.metrics.internal.cloudwatch.spi.RequestMetricTransformer;
import com.amazonaws.services.cloudwatch.model.Dimension;
import com.amazonaws.services.cloudwatch.model.MetricDatum;
import com.amazonaws.services.cloudwatch.model.StandardUnit;
import com.amazonaws.services.dynamodbv2.metrics.DynamoDBRequestMetric;
import com.amazonaws.services.dynamodbv2.model.ConsumedCapacity;

/**
 * An internal service provider implementation for an DyanmoDB specific request
 * metric transformer.
 * 
 * This class is loaded only if there are Amazon DyanmoDB specific predefined
 * metrics to be processed.
 * 
 * @see AWSMetricTransformerFactory
 */
@ThreadSafe
public class DynamoDBRequestMetricTransformer implements RequestMetricTransformer {
    @Override
    public List<MetricDatum> toMetricData(MetricType metricType,
            Request<?> request, Response<?> response) {
        try {
            return toMetricData0(metricType, request, response);
        } catch (SecurityException e) {
        } catch (NoSuchMethodException e) {
        } catch (IllegalAccessException e) {
        } catch (InvocationTargetException e) {
            LogFactory.getLog(getClass()).debug("", e.getCause());
        } catch (Exception e) {
            LogFactory.getLog(getClass()).debug("", e);
        }
        return null;
    }

    private List<MetricDatum> toMetricData0(MetricType metricType,
            Request<?> req, Response<?> response) throws SecurityException,
            NoSuchMethodException, IllegalAccessException,
            InvocationTargetException {
        if (!(metricType instanceof DynamoDBRequestMetric))
            return null;
        // Predefined metrics across all aws http clients
        DynamoDBRequestMetric predefined = (DynamoDBRequestMetric) metricType;
        switch(predefined) {
            case DynamoDBConsumedCapacity:
                if (response == null)
                    return Collections.emptyList();
                Object awsResponse = response.getAwsResponse();
                Method method = awsResponse.getClass().getMethod("getConsumedCapacity");
                Object value = method.invoke(awsResponse);
                if (!(value instanceof ConsumedCapacity))
                    return Collections.emptyList();
                ConsumedCapacity consumedCapacity = (ConsumedCapacity) value;
                Double units = consumedCapacity.getCapacityUnits();
                if (units == null)
                    return Collections.emptyList();
                String tableName = consumedCapacity.getTableName();
                List<Dimension> dims = new ArrayList<Dimension>();
                dims.add(new Dimension()
                        .withName(Dimensions.MetricType.name())
                        .withValue(metricType.name()));
                // request type specific
                dims.add(new Dimension()
                        .withName(Dimensions.RequestType.name())
                        .withValue(requestType(req)));
                // table specific
                dims.add(new Dimension()
                        .withName(DynamoDBDimensions.TableName.name())
                        .withValue(tableName));
                MetricDatum datum = new MetricDatum()
                    .withMetricName(req.getServiceName())
                    .withDimensions(dims)
                    .withUnit(StandardUnit.Count)
                    .withValue(units);
                return Collections.singletonList(datum);
            default:
                return Collections.emptyList();
        }
    }

    /**
     * Returns the name of the type of request.
     */
    private String requestType(Request<?> req) {
        return req.getOriginalRequest().getClass().getSimpleName();
    }
}
