/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Create Or Update Scaling Trigger Request Marshaller
 */
public class CreateOrUpdateScalingTriggerRequestMarshaller implements Marshaller<Request<CreateOrUpdateScalingTriggerRequest>, CreateOrUpdateScalingTriggerRequest> {

    public Request<CreateOrUpdateScalingTriggerRequest> marshall(CreateOrUpdateScalingTriggerRequest createOrUpdateScalingTriggerRequest) {
        Request<CreateOrUpdateScalingTriggerRequest> request = new DefaultRequest<CreateOrUpdateScalingTriggerRequest>(createOrUpdateScalingTriggerRequest, "AmazonAutoScaling");
        request.addParameter("Action", "CreateOrUpdateScalingTrigger");
        request.addParameter("Version", "2009-05-15");
        if (createOrUpdateScalingTriggerRequest != null) {
            if (createOrUpdateScalingTriggerRequest.getTriggerName() != null) {
                request.addParameter("TriggerName", StringUtils.fromString(createOrUpdateScalingTriggerRequest.getTriggerName()));
            }
        }
        if (createOrUpdateScalingTriggerRequest != null) {
            if (createOrUpdateScalingTriggerRequest.getAutoScalingGroupName() != null) {
                request.addParameter("AutoScalingGroupName", StringUtils.fromString(createOrUpdateScalingTriggerRequest.getAutoScalingGroupName()));
            }
        }
        if (createOrUpdateScalingTriggerRequest != null) {
            if (createOrUpdateScalingTriggerRequest.getMeasureName() != null) {
                request.addParameter("MeasureName", StringUtils.fromString(createOrUpdateScalingTriggerRequest.getMeasureName()));
            }
        }
        if (createOrUpdateScalingTriggerRequest != null) {
            if (createOrUpdateScalingTriggerRequest.getStatistic() != null) {
                request.addParameter("Statistic", StringUtils.fromString(createOrUpdateScalingTriggerRequest.getStatistic()));
            }
        }

        if (createOrUpdateScalingTriggerRequest != null) {
            java.util.List<Dimension> dimensionsList = createOrUpdateScalingTriggerRequest.getDimensions();
            int dimensionsListIndex = 1;
            for (Dimension dimensionsListValue : dimensionsList) {
                if (dimensionsListValue != null) {
                    if (dimensionsListValue.getName() != null) {
                        request.addParameter("Dimensions.member." + dimensionsListIndex + ".Name", StringUtils.fromString(dimensionsListValue.getName()));
                    }
                }
                if (dimensionsListValue != null) {
                    if (dimensionsListValue.getValue() != null) {
                        request.addParameter("Dimensions.member." + dimensionsListIndex + ".Value", StringUtils.fromString(dimensionsListValue.getValue()));
                    }
                }

                dimensionsListIndex++;
            }
        }
        if (createOrUpdateScalingTriggerRequest != null) {
            if (createOrUpdateScalingTriggerRequest.getPeriod() != null) {
                request.addParameter("Period", StringUtils.fromInteger(createOrUpdateScalingTriggerRequest.getPeriod()));
            }
        }
        if (createOrUpdateScalingTriggerRequest != null) {
            if (createOrUpdateScalingTriggerRequest.getUnit() != null) {
                request.addParameter("Unit", StringUtils.fromString(createOrUpdateScalingTriggerRequest.getUnit()));
            }
        }
        if (createOrUpdateScalingTriggerRequest != null) {
            if (createOrUpdateScalingTriggerRequest.getCustomUnit() != null) {
                request.addParameter("CustomUnit", StringUtils.fromString(createOrUpdateScalingTriggerRequest.getCustomUnit()));
            }
        }
        if (createOrUpdateScalingTriggerRequest != null) {
            if (createOrUpdateScalingTriggerRequest.getNamespace() != null) {
                request.addParameter("Namespace", StringUtils.fromString(createOrUpdateScalingTriggerRequest.getNamespace()));
            }
        }
        if (createOrUpdateScalingTriggerRequest != null) {
            if (createOrUpdateScalingTriggerRequest.getLowerThreshold() != null) {
                request.addParameter("LowerThreshold", StringUtils.fromDouble(createOrUpdateScalingTriggerRequest.getLowerThreshold()));
            }
        }
        if (createOrUpdateScalingTriggerRequest != null) {
            if (createOrUpdateScalingTriggerRequest.getLowerBreachScaleIncrement() != null) {
                request.addParameter("LowerBreachScaleIncrement", StringUtils.fromString(createOrUpdateScalingTriggerRequest.getLowerBreachScaleIncrement()));
            }
        }
        if (createOrUpdateScalingTriggerRequest != null) {
            if (createOrUpdateScalingTriggerRequest.getUpperThreshold() != null) {
                request.addParameter("UpperThreshold", StringUtils.fromDouble(createOrUpdateScalingTriggerRequest.getUpperThreshold()));
            }
        }
        if (createOrUpdateScalingTriggerRequest != null) {
            if (createOrUpdateScalingTriggerRequest.getUpperBreachScaleIncrement() != null) {
                request.addParameter("UpperBreachScaleIncrement", StringUtils.fromString(createOrUpdateScalingTriggerRequest.getUpperBreachScaleIncrement()));
            }
        }
        if (createOrUpdateScalingTriggerRequest != null) {
            if (createOrUpdateScalingTriggerRequest.getBreachDuration() != null) {
                request.addParameter("BreachDuration", StringUtils.fromInteger(createOrUpdateScalingTriggerRequest.getBreachDuration()));
            }
        }


        return request;
    }
}
