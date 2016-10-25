/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.budgets.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.budgets.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * BudgetMarshaller
 */
public class BudgetJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Budget budget, StructuredJsonGenerator jsonGenerator) {

        if (budget == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (budget.getBudgetName() != null) {
                jsonGenerator.writeFieldName("BudgetName").writeValue(budget.getBudgetName());
            }
            if (budget.getBudgetLimit() != null) {
                jsonGenerator.writeFieldName("BudgetLimit");
                SpendJsonMarshaller.getInstance().marshall(budget.getBudgetLimit(), jsonGenerator);
            }

            java.util.Map<String, java.util.List<String>> costFiltersMap = budget.getCostFilters();
            if (costFiltersMap != null) {
                jsonGenerator.writeFieldName("CostFilters");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, java.util.List<String>> costFiltersMapValue : costFiltersMap.entrySet()) {
                    if (costFiltersMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(costFiltersMapValue.getKey());

                        jsonGenerator.writeStartArray();
                        for (String costFiltersMapValueList : costFiltersMapValue.getValue()) {
                            if (costFiltersMapValueList != null) {
                                jsonGenerator.writeValue(costFiltersMapValueList);
                            }
                        }
                        jsonGenerator.writeEndArray();
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (budget.getCostTypes() != null) {
                jsonGenerator.writeFieldName("CostTypes");
                CostTypesJsonMarshaller.getInstance().marshall(budget.getCostTypes(), jsonGenerator);
            }
            if (budget.getTimeUnit() != null) {
                jsonGenerator.writeFieldName("TimeUnit").writeValue(budget.getTimeUnit());
            }
            if (budget.getTimePeriod() != null) {
                jsonGenerator.writeFieldName("TimePeriod");
                TimePeriodJsonMarshaller.getInstance().marshall(budget.getTimePeriod(), jsonGenerator);
            }
            if (budget.getCalculatedSpend() != null) {
                jsonGenerator.writeFieldName("CalculatedSpend");
                CalculatedSpendJsonMarshaller.getInstance().marshall(budget.getCalculatedSpend(), jsonGenerator);
            }
            if (budget.getBudgetType() != null) {
                jsonGenerator.writeFieldName("BudgetType").writeValue(budget.getBudgetType());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static BudgetJsonMarshaller instance;

    public static BudgetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BudgetJsonMarshaller();
        return instance;
    }

}
