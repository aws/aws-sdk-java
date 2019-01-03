/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudsearchv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DefineIndexFieldRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefineIndexFieldRequestMarshaller implements Marshaller<Request<DefineIndexFieldRequest>, DefineIndexFieldRequest> {

    public Request<DefineIndexFieldRequest> marshall(DefineIndexFieldRequest defineIndexFieldRequest) {

        if (defineIndexFieldRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DefineIndexFieldRequest> request = new DefaultRequest<DefineIndexFieldRequest>(defineIndexFieldRequest, "AmazonCloudSearchv2");
        request.addParameter("Action", "DefineIndexField");
        request.addParameter("Version", "2013-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (defineIndexFieldRequest.getDomainName() != null) {
            request.addParameter("DomainName", StringUtils.fromString(defineIndexFieldRequest.getDomainName()));
        }

        {
            IndexField indexField = defineIndexFieldRequest.getIndexField();
            if (indexField != null) {

                if (indexField.getIndexFieldName() != null) {
                    request.addParameter("IndexField.IndexFieldName", StringUtils.fromString(indexField.getIndexFieldName()));
                }

                if (indexField.getIndexFieldType() != null) {
                    request.addParameter("IndexField.IndexFieldType", StringUtils.fromString(indexField.getIndexFieldType()));
                }

                {
                    IntOptions intOptions = indexField.getIntOptions();
                    if (intOptions != null) {

                        if (intOptions.getDefaultValue() != null) {
                            request.addParameter("IndexField.IntOptions.DefaultValue", StringUtils.fromLong(intOptions.getDefaultValue()));
                        }

                        if (intOptions.getSourceField() != null) {
                            request.addParameter("IndexField.IntOptions.SourceField", StringUtils.fromString(intOptions.getSourceField()));
                        }

                        if (intOptions.getFacetEnabled() != null) {
                            request.addParameter("IndexField.IntOptions.FacetEnabled", StringUtils.fromBoolean(intOptions.getFacetEnabled()));
                        }

                        if (intOptions.getSearchEnabled() != null) {
                            request.addParameter("IndexField.IntOptions.SearchEnabled", StringUtils.fromBoolean(intOptions.getSearchEnabled()));
                        }

                        if (intOptions.getReturnEnabled() != null) {
                            request.addParameter("IndexField.IntOptions.ReturnEnabled", StringUtils.fromBoolean(intOptions.getReturnEnabled()));
                        }

                        if (intOptions.getSortEnabled() != null) {
                            request.addParameter("IndexField.IntOptions.SortEnabled", StringUtils.fromBoolean(intOptions.getSortEnabled()));
                        }
                    }
                }

                {
                    DoubleOptions doubleOptions = indexField.getDoubleOptions();
                    if (doubleOptions != null) {

                        if (doubleOptions.getDefaultValue() != null) {
                            request.addParameter("IndexField.DoubleOptions.DefaultValue", StringUtils.fromDouble(doubleOptions.getDefaultValue()));
                        }

                        if (doubleOptions.getSourceField() != null) {
                            request.addParameter("IndexField.DoubleOptions.SourceField", StringUtils.fromString(doubleOptions.getSourceField()));
                        }

                        if (doubleOptions.getFacetEnabled() != null) {
                            request.addParameter("IndexField.DoubleOptions.FacetEnabled", StringUtils.fromBoolean(doubleOptions.getFacetEnabled()));
                        }

                        if (doubleOptions.getSearchEnabled() != null) {
                            request.addParameter("IndexField.DoubleOptions.SearchEnabled", StringUtils.fromBoolean(doubleOptions.getSearchEnabled()));
                        }

                        if (doubleOptions.getReturnEnabled() != null) {
                            request.addParameter("IndexField.DoubleOptions.ReturnEnabled", StringUtils.fromBoolean(doubleOptions.getReturnEnabled()));
                        }

                        if (doubleOptions.getSortEnabled() != null) {
                            request.addParameter("IndexField.DoubleOptions.SortEnabled", StringUtils.fromBoolean(doubleOptions.getSortEnabled()));
                        }
                    }
                }

                {
                    LiteralOptions literalOptions = indexField.getLiteralOptions();
                    if (literalOptions != null) {

                        if (literalOptions.getDefaultValue() != null) {
                            request.addParameter("IndexField.LiteralOptions.DefaultValue", StringUtils.fromString(literalOptions.getDefaultValue()));
                        }

                        if (literalOptions.getSourceField() != null) {
                            request.addParameter("IndexField.LiteralOptions.SourceField", StringUtils.fromString(literalOptions.getSourceField()));
                        }

                        if (literalOptions.getFacetEnabled() != null) {
                            request.addParameter("IndexField.LiteralOptions.FacetEnabled", StringUtils.fromBoolean(literalOptions.getFacetEnabled()));
                        }

                        if (literalOptions.getSearchEnabled() != null) {
                            request.addParameter("IndexField.LiteralOptions.SearchEnabled", StringUtils.fromBoolean(literalOptions.getSearchEnabled()));
                        }

                        if (literalOptions.getReturnEnabled() != null) {
                            request.addParameter("IndexField.LiteralOptions.ReturnEnabled", StringUtils.fromBoolean(literalOptions.getReturnEnabled()));
                        }

                        if (literalOptions.getSortEnabled() != null) {
                            request.addParameter("IndexField.LiteralOptions.SortEnabled", StringUtils.fromBoolean(literalOptions.getSortEnabled()));
                        }
                    }
                }

                {
                    TextOptions textOptions = indexField.getTextOptions();
                    if (textOptions != null) {

                        if (textOptions.getDefaultValue() != null) {
                            request.addParameter("IndexField.TextOptions.DefaultValue", StringUtils.fromString(textOptions.getDefaultValue()));
                        }

                        if (textOptions.getSourceField() != null) {
                            request.addParameter("IndexField.TextOptions.SourceField", StringUtils.fromString(textOptions.getSourceField()));
                        }

                        if (textOptions.getReturnEnabled() != null) {
                            request.addParameter("IndexField.TextOptions.ReturnEnabled", StringUtils.fromBoolean(textOptions.getReturnEnabled()));
                        }

                        if (textOptions.getSortEnabled() != null) {
                            request.addParameter("IndexField.TextOptions.SortEnabled", StringUtils.fromBoolean(textOptions.getSortEnabled()));
                        }

                        if (textOptions.getHighlightEnabled() != null) {
                            request.addParameter("IndexField.TextOptions.HighlightEnabled", StringUtils.fromBoolean(textOptions.getHighlightEnabled()));
                        }

                        if (textOptions.getAnalysisScheme() != null) {
                            request.addParameter("IndexField.TextOptions.AnalysisScheme", StringUtils.fromString(textOptions.getAnalysisScheme()));
                        }
                    }
                }

                {
                    DateOptions dateOptions = indexField.getDateOptions();
                    if (dateOptions != null) {

                        if (dateOptions.getDefaultValue() != null) {
                            request.addParameter("IndexField.DateOptions.DefaultValue", StringUtils.fromString(dateOptions.getDefaultValue()));
                        }

                        if (dateOptions.getSourceField() != null) {
                            request.addParameter("IndexField.DateOptions.SourceField", StringUtils.fromString(dateOptions.getSourceField()));
                        }

                        if (dateOptions.getFacetEnabled() != null) {
                            request.addParameter("IndexField.DateOptions.FacetEnabled", StringUtils.fromBoolean(dateOptions.getFacetEnabled()));
                        }

                        if (dateOptions.getSearchEnabled() != null) {
                            request.addParameter("IndexField.DateOptions.SearchEnabled", StringUtils.fromBoolean(dateOptions.getSearchEnabled()));
                        }

                        if (dateOptions.getReturnEnabled() != null) {
                            request.addParameter("IndexField.DateOptions.ReturnEnabled", StringUtils.fromBoolean(dateOptions.getReturnEnabled()));
                        }

                        if (dateOptions.getSortEnabled() != null) {
                            request.addParameter("IndexField.DateOptions.SortEnabled", StringUtils.fromBoolean(dateOptions.getSortEnabled()));
                        }
                    }
                }

                {
                    LatLonOptions latLonOptions = indexField.getLatLonOptions();
                    if (latLonOptions != null) {

                        if (latLonOptions.getDefaultValue() != null) {
                            request.addParameter("IndexField.LatLonOptions.DefaultValue", StringUtils.fromString(latLonOptions.getDefaultValue()));
                        }

                        if (latLonOptions.getSourceField() != null) {
                            request.addParameter("IndexField.LatLonOptions.SourceField", StringUtils.fromString(latLonOptions.getSourceField()));
                        }

                        if (latLonOptions.getFacetEnabled() != null) {
                            request.addParameter("IndexField.LatLonOptions.FacetEnabled", StringUtils.fromBoolean(latLonOptions.getFacetEnabled()));
                        }

                        if (latLonOptions.getSearchEnabled() != null) {
                            request.addParameter("IndexField.LatLonOptions.SearchEnabled", StringUtils.fromBoolean(latLonOptions.getSearchEnabled()));
                        }

                        if (latLonOptions.getReturnEnabled() != null) {
                            request.addParameter("IndexField.LatLonOptions.ReturnEnabled", StringUtils.fromBoolean(latLonOptions.getReturnEnabled()));
                        }

                        if (latLonOptions.getSortEnabled() != null) {
                            request.addParameter("IndexField.LatLonOptions.SortEnabled", StringUtils.fromBoolean(latLonOptions.getSortEnabled()));
                        }
                    }
                }

                {
                    IntArrayOptions intArrayOptions = indexField.getIntArrayOptions();
                    if (intArrayOptions != null) {

                        if (intArrayOptions.getDefaultValue() != null) {
                            request.addParameter("IndexField.IntArrayOptions.DefaultValue", StringUtils.fromLong(intArrayOptions.getDefaultValue()));
                        }

                        if (intArrayOptions.getSourceFields() != null) {
                            request.addParameter("IndexField.IntArrayOptions.SourceFields", StringUtils.fromString(intArrayOptions.getSourceFields()));
                        }

                        if (intArrayOptions.getFacetEnabled() != null) {
                            request.addParameter("IndexField.IntArrayOptions.FacetEnabled", StringUtils.fromBoolean(intArrayOptions.getFacetEnabled()));
                        }

                        if (intArrayOptions.getSearchEnabled() != null) {
                            request.addParameter("IndexField.IntArrayOptions.SearchEnabled", StringUtils.fromBoolean(intArrayOptions.getSearchEnabled()));
                        }

                        if (intArrayOptions.getReturnEnabled() != null) {
                            request.addParameter("IndexField.IntArrayOptions.ReturnEnabled", StringUtils.fromBoolean(intArrayOptions.getReturnEnabled()));
                        }
                    }
                }

                {
                    DoubleArrayOptions doubleArrayOptions = indexField.getDoubleArrayOptions();
                    if (doubleArrayOptions != null) {

                        if (doubleArrayOptions.getDefaultValue() != null) {
                            request.addParameter("IndexField.DoubleArrayOptions.DefaultValue", StringUtils.fromDouble(doubleArrayOptions.getDefaultValue()));
                        }

                        if (doubleArrayOptions.getSourceFields() != null) {
                            request.addParameter("IndexField.DoubleArrayOptions.SourceFields", StringUtils.fromString(doubleArrayOptions.getSourceFields()));
                        }

                        if (doubleArrayOptions.getFacetEnabled() != null) {
                            request.addParameter("IndexField.DoubleArrayOptions.FacetEnabled", StringUtils.fromBoolean(doubleArrayOptions.getFacetEnabled()));
                        }

                        if (doubleArrayOptions.getSearchEnabled() != null) {
                            request.addParameter("IndexField.DoubleArrayOptions.SearchEnabled", StringUtils.fromBoolean(doubleArrayOptions.getSearchEnabled()));
                        }

                        if (doubleArrayOptions.getReturnEnabled() != null) {
                            request.addParameter("IndexField.DoubleArrayOptions.ReturnEnabled", StringUtils.fromBoolean(doubleArrayOptions.getReturnEnabled()));
                        }
                    }
                }

                {
                    LiteralArrayOptions literalArrayOptions = indexField.getLiteralArrayOptions();
                    if (literalArrayOptions != null) {

                        if (literalArrayOptions.getDefaultValue() != null) {
                            request.addParameter("IndexField.LiteralArrayOptions.DefaultValue", StringUtils.fromString(literalArrayOptions.getDefaultValue()));
                        }

                        if (literalArrayOptions.getSourceFields() != null) {
                            request.addParameter("IndexField.LiteralArrayOptions.SourceFields", StringUtils.fromString(literalArrayOptions.getSourceFields()));
                        }

                        if (literalArrayOptions.getFacetEnabled() != null) {
                            request.addParameter("IndexField.LiteralArrayOptions.FacetEnabled", StringUtils.fromBoolean(literalArrayOptions.getFacetEnabled()));
                        }

                        if (literalArrayOptions.getSearchEnabled() != null) {
                            request.addParameter("IndexField.LiteralArrayOptions.SearchEnabled",
                                    StringUtils.fromBoolean(literalArrayOptions.getSearchEnabled()));
                        }

                        if (literalArrayOptions.getReturnEnabled() != null) {
                            request.addParameter("IndexField.LiteralArrayOptions.ReturnEnabled",
                                    StringUtils.fromBoolean(literalArrayOptions.getReturnEnabled()));
                        }
                    }
                }

                {
                    TextArrayOptions textArrayOptions = indexField.getTextArrayOptions();
                    if (textArrayOptions != null) {

                        if (textArrayOptions.getDefaultValue() != null) {
                            request.addParameter("IndexField.TextArrayOptions.DefaultValue", StringUtils.fromString(textArrayOptions.getDefaultValue()));
                        }

                        if (textArrayOptions.getSourceFields() != null) {
                            request.addParameter("IndexField.TextArrayOptions.SourceFields", StringUtils.fromString(textArrayOptions.getSourceFields()));
                        }

                        if (textArrayOptions.getReturnEnabled() != null) {
                            request.addParameter("IndexField.TextArrayOptions.ReturnEnabled", StringUtils.fromBoolean(textArrayOptions.getReturnEnabled()));
                        }

                        if (textArrayOptions.getHighlightEnabled() != null) {
                            request.addParameter("IndexField.TextArrayOptions.HighlightEnabled",
                                    StringUtils.fromBoolean(textArrayOptions.getHighlightEnabled()));
                        }

                        if (textArrayOptions.getAnalysisScheme() != null) {
                            request.addParameter("IndexField.TextArrayOptions.AnalysisScheme", StringUtils.fromString(textArrayOptions.getAnalysisScheme()));
                        }
                    }
                }

                {
                    DateArrayOptions dateArrayOptions = indexField.getDateArrayOptions();
                    if (dateArrayOptions != null) {

                        if (dateArrayOptions.getDefaultValue() != null) {
                            request.addParameter("IndexField.DateArrayOptions.DefaultValue", StringUtils.fromString(dateArrayOptions.getDefaultValue()));
                        }

                        if (dateArrayOptions.getSourceFields() != null) {
                            request.addParameter("IndexField.DateArrayOptions.SourceFields", StringUtils.fromString(dateArrayOptions.getSourceFields()));
                        }

                        if (dateArrayOptions.getFacetEnabled() != null) {
                            request.addParameter("IndexField.DateArrayOptions.FacetEnabled", StringUtils.fromBoolean(dateArrayOptions.getFacetEnabled()));
                        }

                        if (dateArrayOptions.getSearchEnabled() != null) {
                            request.addParameter("IndexField.DateArrayOptions.SearchEnabled", StringUtils.fromBoolean(dateArrayOptions.getSearchEnabled()));
                        }

                        if (dateArrayOptions.getReturnEnabled() != null) {
                            request.addParameter("IndexField.DateArrayOptions.ReturnEnabled", StringUtils.fromBoolean(dateArrayOptions.getReturnEnabled()));
                        }
                    }
                }
            }
        }

        return request;
    }

}
