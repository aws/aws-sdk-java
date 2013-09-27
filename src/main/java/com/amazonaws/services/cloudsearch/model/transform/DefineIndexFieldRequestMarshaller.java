/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearch.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.cloudsearch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Define Index Field Request Marshaller
 */
public class DefineIndexFieldRequestMarshaller implements Marshaller<Request<DefineIndexFieldRequest>, DefineIndexFieldRequest> {

    public Request<DefineIndexFieldRequest> marshall(DefineIndexFieldRequest defineIndexFieldRequest) {

        if (defineIndexFieldRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DefineIndexFieldRequest> request = new DefaultRequest<DefineIndexFieldRequest>(defineIndexFieldRequest, "AmazonCloudSearch");
        request.addParameter("Action", "DefineIndexField");
        request.addParameter("Version", "2011-02-01");

        if (defineIndexFieldRequest.getDomainName() != null) {
            request.addParameter("DomainName", StringUtils.fromString(defineIndexFieldRequest.getDomainName()));
        }
        IndexField indexFieldIndexField = defineIndexFieldRequest.getIndexField();
        if (indexFieldIndexField != null) {
            if (indexFieldIndexField.getIndexFieldName() != null) {
                request.addParameter("IndexField.IndexFieldName", StringUtils.fromString(indexFieldIndexField.getIndexFieldName()));
            }
            if (indexFieldIndexField.getIndexFieldType() != null) {
                request.addParameter("IndexField.IndexFieldType", StringUtils.fromString(indexFieldIndexField.getIndexFieldType()));
            }
            UIntOptions uIntOptionsUIntOptions = indexFieldIndexField.getUIntOptions();
            if (uIntOptionsUIntOptions != null) {
                if (uIntOptionsUIntOptions.getDefaultValue() != null) {
                    request.addParameter("IndexField.UIntOptions.DefaultValue", StringUtils.fromInteger(uIntOptionsUIntOptions.getDefaultValue()));
                }
            }
            LiteralOptions literalOptionsLiteralOptions = indexFieldIndexField.getLiteralOptions();
            if (literalOptionsLiteralOptions != null) {
                if (literalOptionsLiteralOptions.getDefaultValue() != null) {
                    request.addParameter("IndexField.LiteralOptions.DefaultValue", StringUtils.fromString(literalOptionsLiteralOptions.getDefaultValue()));
                }
                if (literalOptionsLiteralOptions.isSearchEnabled() != null) {
                    request.addParameter("IndexField.LiteralOptions.SearchEnabled", StringUtils.fromBoolean(literalOptionsLiteralOptions.isSearchEnabled()));
                }
                if (literalOptionsLiteralOptions.isFacetEnabled() != null) {
                    request.addParameter("IndexField.LiteralOptions.FacetEnabled", StringUtils.fromBoolean(literalOptionsLiteralOptions.isFacetEnabled()));
                }
                if (literalOptionsLiteralOptions.isResultEnabled() != null) {
                    request.addParameter("IndexField.LiteralOptions.ResultEnabled", StringUtils.fromBoolean(literalOptionsLiteralOptions.isResultEnabled()));
                }
            }
            TextOptions textOptionsTextOptions = indexFieldIndexField.getTextOptions();
            if (textOptionsTextOptions != null) {
                if (textOptionsTextOptions.getDefaultValue() != null) {
                    request.addParameter("IndexField.TextOptions.DefaultValue", StringUtils.fromString(textOptionsTextOptions.getDefaultValue()));
                }
                if (textOptionsTextOptions.isFacetEnabled() != null) {
                    request.addParameter("IndexField.TextOptions.FacetEnabled", StringUtils.fromBoolean(textOptionsTextOptions.isFacetEnabled()));
                }
                if (textOptionsTextOptions.isResultEnabled() != null) {
                    request.addParameter("IndexField.TextOptions.ResultEnabled", StringUtils.fromBoolean(textOptionsTextOptions.isResultEnabled()));
                }
                if (textOptionsTextOptions.getTextProcessor() != null) {
                    request.addParameter("IndexField.TextOptions.TextProcessor", StringUtils.fromString(textOptionsTextOptions.getTextProcessor()));
                }
            }

            java.util.List<SourceAttribute> sourceAttributesList = indexFieldIndexField.getSourceAttributes();
            int sourceAttributesListIndex = 1;

            for (SourceAttribute sourceAttributesListValue : sourceAttributesList) {
                SourceAttribute sourceAttributeMember = sourceAttributesListValue;
                if (sourceAttributeMember != null) {
                    if (sourceAttributeMember.getSourceDataFunction() != null) {
                        request.addParameter("IndexField.SourceAttributes.member." + sourceAttributesListIndex + ".SourceDataFunction", StringUtils.fromString(sourceAttributeMember.getSourceDataFunction()));
                    }
                    SourceData sourceDataSourceDataCopy = sourceAttributeMember.getSourceDataCopy();
                    if (sourceDataSourceDataCopy != null) {
                        if (sourceDataSourceDataCopy.getSourceName() != null) {
                            request.addParameter("IndexField.SourceAttributes.member." + sourceAttributesListIndex + ".SourceDataCopy.SourceName", StringUtils.fromString(sourceDataSourceDataCopy.getSourceName()));
                        }
                        if (sourceDataSourceDataCopy.getDefaultValue() != null) {
                            request.addParameter("IndexField.SourceAttributes.member." + sourceAttributesListIndex + ".SourceDataCopy.DefaultValue", StringUtils.fromString(sourceDataSourceDataCopy.getDefaultValue()));
                        }
                    }
                    SourceDataTrimTitle sourceDataTrimTitleSourceDataTrimTitle = sourceAttributeMember.getSourceDataTrimTitle();
                    if (sourceDataTrimTitleSourceDataTrimTitle != null) {
                        if (sourceDataTrimTitleSourceDataTrimTitle.getSourceName() != null) {
                            request.addParameter("IndexField.SourceAttributes.member." + sourceAttributesListIndex + ".SourceDataTrimTitle.SourceName", StringUtils.fromString(sourceDataTrimTitleSourceDataTrimTitle.getSourceName()));
                        }
                        if (sourceDataTrimTitleSourceDataTrimTitle.getDefaultValue() != null) {
                            request.addParameter("IndexField.SourceAttributes.member." + sourceAttributesListIndex + ".SourceDataTrimTitle.DefaultValue", StringUtils.fromString(sourceDataTrimTitleSourceDataTrimTitle.getDefaultValue()));
                        }
                        if (sourceDataTrimTitleSourceDataTrimTitle.getSeparator() != null) {
                            request.addParameter("IndexField.SourceAttributes.member." + sourceAttributesListIndex + ".SourceDataTrimTitle.Separator", StringUtils.fromString(sourceDataTrimTitleSourceDataTrimTitle.getSeparator()));
                        }
                        if (sourceDataTrimTitleSourceDataTrimTitle.getLanguage() != null) {
                            request.addParameter("IndexField.SourceAttributes.member." + sourceAttributesListIndex + ".SourceDataTrimTitle.Language", StringUtils.fromString(sourceDataTrimTitleSourceDataTrimTitle.getLanguage()));
                        }
                    }
                    SourceDataMap sourceDataMapSourceDataMap = sourceAttributeMember.getSourceDataMap();
                    if (sourceDataMapSourceDataMap != null) {
                        if (sourceDataMapSourceDataMap.getSourceName() != null) {
                            request.addParameter("IndexField.SourceAttributes.member." + sourceAttributesListIndex + ".SourceDataMap.SourceName", StringUtils.fromString(sourceDataMapSourceDataMap.getSourceName()));
                        }
                        if (sourceDataMapSourceDataMap.getDefaultValue() != null) {
                            request.addParameter("IndexField.SourceAttributes.member." + sourceAttributesListIndex + ".SourceDataMap.DefaultValue", StringUtils.fromString(sourceDataMapSourceDataMap.getDefaultValue()));
                        }
                        if (sourceDataMapSourceDataMap != null) {
                            if (sourceDataMapSourceDataMap.getCases() != null) {
                                int casesListIndex = 1;
                                for (Map.Entry<String, String> casesListValue : sourceDataMapSourceDataMap.getCases().entrySet()) {

                                    if (casesListValue.getKey() != null) {
                                        request.addParameter("IndexField.SourceAttributes.member." + sourceAttributesListIndex + ".SourceDataMap.Cases.entry." + casesListIndex + ".key", StringUtils.fromString(casesListValue.getKey()));
                                    }
                                    if (casesListValue.getValue() != null) {
                                        request.addParameter("IndexField.SourceAttributes.member." + sourceAttributesListIndex + ".SourceDataMap.Cases.entry." + casesListIndex + ".value", StringUtils.fromString(casesListValue.getValue()));
                                    }
                                    ++casesListIndex;
                                }
                            }
                        }
                    }
                }

                sourceAttributesListIndex++;
            }
        }


        return request;
    }
}
