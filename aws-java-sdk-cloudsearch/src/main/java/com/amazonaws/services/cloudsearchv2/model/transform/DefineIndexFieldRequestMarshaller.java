/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchv2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.cloudsearchv2.model.*;
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

        Request<DefineIndexFieldRequest> request = new DefaultRequest<DefineIndexFieldRequest>(defineIndexFieldRequest, "AmazonCloudSearchv2");
        request.addParameter("Action", "DefineIndexField");
        request.addParameter("Version", "2013-01-01");

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
            IntOptions intOptionsIntOptions = indexFieldIndexField.getIntOptions();
            if (intOptionsIntOptions != null) {
                if (intOptionsIntOptions.getDefaultValue() != null) {
                    request.addParameter("IndexField.IntOptions.DefaultValue", StringUtils.fromLong(intOptionsIntOptions.getDefaultValue()));
                }
                if (intOptionsIntOptions.getSourceField() != null) {
                    request.addParameter("IndexField.IntOptions.SourceField", StringUtils.fromString(intOptionsIntOptions.getSourceField()));
                }
                if (intOptionsIntOptions.isFacetEnabled() != null) {
                    request.addParameter("IndexField.IntOptions.FacetEnabled", StringUtils.fromBoolean(intOptionsIntOptions.isFacetEnabled()));
                }
                if (intOptionsIntOptions.isSearchEnabled() != null) {
                    request.addParameter("IndexField.IntOptions.SearchEnabled", StringUtils.fromBoolean(intOptionsIntOptions.isSearchEnabled()));
                }
                if (intOptionsIntOptions.isReturnEnabled() != null) {
                    request.addParameter("IndexField.IntOptions.ReturnEnabled", StringUtils.fromBoolean(intOptionsIntOptions.isReturnEnabled()));
                }
                if (intOptionsIntOptions.isSortEnabled() != null) {
                    request.addParameter("IndexField.IntOptions.SortEnabled", StringUtils.fromBoolean(intOptionsIntOptions.isSortEnabled()));
                }
            }
            DoubleOptions doubleOptionsDoubleOptions = indexFieldIndexField.getDoubleOptions();
            if (doubleOptionsDoubleOptions != null) {
                if (doubleOptionsDoubleOptions.getDefaultValue() != null) {
                    request.addParameter("IndexField.DoubleOptions.DefaultValue", StringUtils.fromDouble(doubleOptionsDoubleOptions.getDefaultValue()));
                }
                if (doubleOptionsDoubleOptions.getSourceField() != null) {
                    request.addParameter("IndexField.DoubleOptions.SourceField", StringUtils.fromString(doubleOptionsDoubleOptions.getSourceField()));
                }
                if (doubleOptionsDoubleOptions.isFacetEnabled() != null) {
                    request.addParameter("IndexField.DoubleOptions.FacetEnabled", StringUtils.fromBoolean(doubleOptionsDoubleOptions.isFacetEnabled()));
                }
                if (doubleOptionsDoubleOptions.isSearchEnabled() != null) {
                    request.addParameter("IndexField.DoubleOptions.SearchEnabled", StringUtils.fromBoolean(doubleOptionsDoubleOptions.isSearchEnabled()));
                }
                if (doubleOptionsDoubleOptions.isReturnEnabled() != null) {
                    request.addParameter("IndexField.DoubleOptions.ReturnEnabled", StringUtils.fromBoolean(doubleOptionsDoubleOptions.isReturnEnabled()));
                }
                if (doubleOptionsDoubleOptions.isSortEnabled() != null) {
                    request.addParameter("IndexField.DoubleOptions.SortEnabled", StringUtils.fromBoolean(doubleOptionsDoubleOptions.isSortEnabled()));
                }
            }
            LiteralOptions literalOptionsLiteralOptions = indexFieldIndexField.getLiteralOptions();
            if (literalOptionsLiteralOptions != null) {
                if (literalOptionsLiteralOptions.getDefaultValue() != null) {
                    request.addParameter("IndexField.LiteralOptions.DefaultValue", StringUtils.fromString(literalOptionsLiteralOptions.getDefaultValue()));
                }
                if (literalOptionsLiteralOptions.getSourceField() != null) {
                    request.addParameter("IndexField.LiteralOptions.SourceField", StringUtils.fromString(literalOptionsLiteralOptions.getSourceField()));
                }
                if (literalOptionsLiteralOptions.isFacetEnabled() != null) {
                    request.addParameter("IndexField.LiteralOptions.FacetEnabled", StringUtils.fromBoolean(literalOptionsLiteralOptions.isFacetEnabled()));
                }
                if (literalOptionsLiteralOptions.isSearchEnabled() != null) {
                    request.addParameter("IndexField.LiteralOptions.SearchEnabled", StringUtils.fromBoolean(literalOptionsLiteralOptions.isSearchEnabled()));
                }
                if (literalOptionsLiteralOptions.isReturnEnabled() != null) {
                    request.addParameter("IndexField.LiteralOptions.ReturnEnabled", StringUtils.fromBoolean(literalOptionsLiteralOptions.isReturnEnabled()));
                }
                if (literalOptionsLiteralOptions.isSortEnabled() != null) {
                    request.addParameter("IndexField.LiteralOptions.SortEnabled", StringUtils.fromBoolean(literalOptionsLiteralOptions.isSortEnabled()));
                }
            }
            TextOptions textOptionsTextOptions = indexFieldIndexField.getTextOptions();
            if (textOptionsTextOptions != null) {
                if (textOptionsTextOptions.getDefaultValue() != null) {
                    request.addParameter("IndexField.TextOptions.DefaultValue", StringUtils.fromString(textOptionsTextOptions.getDefaultValue()));
                }
                if (textOptionsTextOptions.getSourceField() != null) {
                    request.addParameter("IndexField.TextOptions.SourceField", StringUtils.fromString(textOptionsTextOptions.getSourceField()));
                }
                if (textOptionsTextOptions.isReturnEnabled() != null) {
                    request.addParameter("IndexField.TextOptions.ReturnEnabled", StringUtils.fromBoolean(textOptionsTextOptions.isReturnEnabled()));
                }
                if (textOptionsTextOptions.isSortEnabled() != null) {
                    request.addParameter("IndexField.TextOptions.SortEnabled", StringUtils.fromBoolean(textOptionsTextOptions.isSortEnabled()));
                }
                if (textOptionsTextOptions.isHighlightEnabled() != null) {
                    request.addParameter("IndexField.TextOptions.HighlightEnabled", StringUtils.fromBoolean(textOptionsTextOptions.isHighlightEnabled()));
                }
                if (textOptionsTextOptions.getAnalysisScheme() != null) {
                    request.addParameter("IndexField.TextOptions.AnalysisScheme", StringUtils.fromString(textOptionsTextOptions.getAnalysisScheme()));
                }
            }
            DateOptions dateOptionsDateOptions = indexFieldIndexField.getDateOptions();
            if (dateOptionsDateOptions != null) {
                if (dateOptionsDateOptions.getDefaultValue() != null) {
                    request.addParameter("IndexField.DateOptions.DefaultValue", StringUtils.fromString(dateOptionsDateOptions.getDefaultValue()));
                }
                if (dateOptionsDateOptions.getSourceField() != null) {
                    request.addParameter("IndexField.DateOptions.SourceField", StringUtils.fromString(dateOptionsDateOptions.getSourceField()));
                }
                if (dateOptionsDateOptions.isFacetEnabled() != null) {
                    request.addParameter("IndexField.DateOptions.FacetEnabled", StringUtils.fromBoolean(dateOptionsDateOptions.isFacetEnabled()));
                }
                if (dateOptionsDateOptions.isSearchEnabled() != null) {
                    request.addParameter("IndexField.DateOptions.SearchEnabled", StringUtils.fromBoolean(dateOptionsDateOptions.isSearchEnabled()));
                }
                if (dateOptionsDateOptions.isReturnEnabled() != null) {
                    request.addParameter("IndexField.DateOptions.ReturnEnabled", StringUtils.fromBoolean(dateOptionsDateOptions.isReturnEnabled()));
                }
                if (dateOptionsDateOptions.isSortEnabled() != null) {
                    request.addParameter("IndexField.DateOptions.SortEnabled", StringUtils.fromBoolean(dateOptionsDateOptions.isSortEnabled()));
                }
            }
            LatLonOptions latLonOptionsLatLonOptions = indexFieldIndexField.getLatLonOptions();
            if (latLonOptionsLatLonOptions != null) {
                if (latLonOptionsLatLonOptions.getDefaultValue() != null) {
                    request.addParameter("IndexField.LatLonOptions.DefaultValue", StringUtils.fromString(latLonOptionsLatLonOptions.getDefaultValue()));
                }
                if (latLonOptionsLatLonOptions.getSourceField() != null) {
                    request.addParameter("IndexField.LatLonOptions.SourceField", StringUtils.fromString(latLonOptionsLatLonOptions.getSourceField()));
                }
                if (latLonOptionsLatLonOptions.isFacetEnabled() != null) {
                    request.addParameter("IndexField.LatLonOptions.FacetEnabled", StringUtils.fromBoolean(latLonOptionsLatLonOptions.isFacetEnabled()));
                }
                if (latLonOptionsLatLonOptions.isSearchEnabled() != null) {
                    request.addParameter("IndexField.LatLonOptions.SearchEnabled", StringUtils.fromBoolean(latLonOptionsLatLonOptions.isSearchEnabled()));
                }
                if (latLonOptionsLatLonOptions.isReturnEnabled() != null) {
                    request.addParameter("IndexField.LatLonOptions.ReturnEnabled", StringUtils.fromBoolean(latLonOptionsLatLonOptions.isReturnEnabled()));
                }
                if (latLonOptionsLatLonOptions.isSortEnabled() != null) {
                    request.addParameter("IndexField.LatLonOptions.SortEnabled", StringUtils.fromBoolean(latLonOptionsLatLonOptions.isSortEnabled()));
                }
            }
            IntArrayOptions intArrayOptionsIntArrayOptions = indexFieldIndexField.getIntArrayOptions();
            if (intArrayOptionsIntArrayOptions != null) {
                if (intArrayOptionsIntArrayOptions.getDefaultValue() != null) {
                    request.addParameter("IndexField.IntArrayOptions.DefaultValue", StringUtils.fromLong(intArrayOptionsIntArrayOptions.getDefaultValue()));
                }
                if (intArrayOptionsIntArrayOptions.getSourceFields() != null) {
                    request.addParameter("IndexField.IntArrayOptions.SourceFields", StringUtils.fromString(intArrayOptionsIntArrayOptions.getSourceFields()));
                }
                if (intArrayOptionsIntArrayOptions.isFacetEnabled() != null) {
                    request.addParameter("IndexField.IntArrayOptions.FacetEnabled", StringUtils.fromBoolean(intArrayOptionsIntArrayOptions.isFacetEnabled()));
                }
                if (intArrayOptionsIntArrayOptions.isSearchEnabled() != null) {
                    request.addParameter("IndexField.IntArrayOptions.SearchEnabled", StringUtils.fromBoolean(intArrayOptionsIntArrayOptions.isSearchEnabled()));
                }
                if (intArrayOptionsIntArrayOptions.isReturnEnabled() != null) {
                    request.addParameter("IndexField.IntArrayOptions.ReturnEnabled", StringUtils.fromBoolean(intArrayOptionsIntArrayOptions.isReturnEnabled()));
                }
            }
            DoubleArrayOptions doubleArrayOptionsDoubleArrayOptions = indexFieldIndexField.getDoubleArrayOptions();
            if (doubleArrayOptionsDoubleArrayOptions != null) {
                if (doubleArrayOptionsDoubleArrayOptions.getDefaultValue() != null) {
                    request.addParameter("IndexField.DoubleArrayOptions.DefaultValue", StringUtils.fromDouble(doubleArrayOptionsDoubleArrayOptions.getDefaultValue()));
                }
                if (doubleArrayOptionsDoubleArrayOptions.getSourceFields() != null) {
                    request.addParameter("IndexField.DoubleArrayOptions.SourceFields", StringUtils.fromString(doubleArrayOptionsDoubleArrayOptions.getSourceFields()));
                }
                if (doubleArrayOptionsDoubleArrayOptions.isFacetEnabled() != null) {
                    request.addParameter("IndexField.DoubleArrayOptions.FacetEnabled", StringUtils.fromBoolean(doubleArrayOptionsDoubleArrayOptions.isFacetEnabled()));
                }
                if (doubleArrayOptionsDoubleArrayOptions.isSearchEnabled() != null) {
                    request.addParameter("IndexField.DoubleArrayOptions.SearchEnabled", StringUtils.fromBoolean(doubleArrayOptionsDoubleArrayOptions.isSearchEnabled()));
                }
                if (doubleArrayOptionsDoubleArrayOptions.isReturnEnabled() != null) {
                    request.addParameter("IndexField.DoubleArrayOptions.ReturnEnabled", StringUtils.fromBoolean(doubleArrayOptionsDoubleArrayOptions.isReturnEnabled()));
                }
            }
            LiteralArrayOptions literalArrayOptionsLiteralArrayOptions = indexFieldIndexField.getLiteralArrayOptions();
            if (literalArrayOptionsLiteralArrayOptions != null) {
                if (literalArrayOptionsLiteralArrayOptions.getDefaultValue() != null) {
                    request.addParameter("IndexField.LiteralArrayOptions.DefaultValue", StringUtils.fromString(literalArrayOptionsLiteralArrayOptions.getDefaultValue()));
                }
                if (literalArrayOptionsLiteralArrayOptions.getSourceFields() != null) {
                    request.addParameter("IndexField.LiteralArrayOptions.SourceFields", StringUtils.fromString(literalArrayOptionsLiteralArrayOptions.getSourceFields()));
                }
                if (literalArrayOptionsLiteralArrayOptions.isFacetEnabled() != null) {
                    request.addParameter("IndexField.LiteralArrayOptions.FacetEnabled", StringUtils.fromBoolean(literalArrayOptionsLiteralArrayOptions.isFacetEnabled()));
                }
                if (literalArrayOptionsLiteralArrayOptions.isSearchEnabled() != null) {
                    request.addParameter("IndexField.LiteralArrayOptions.SearchEnabled", StringUtils.fromBoolean(literalArrayOptionsLiteralArrayOptions.isSearchEnabled()));
                }
                if (literalArrayOptionsLiteralArrayOptions.isReturnEnabled() != null) {
                    request.addParameter("IndexField.LiteralArrayOptions.ReturnEnabled", StringUtils.fromBoolean(literalArrayOptionsLiteralArrayOptions.isReturnEnabled()));
                }
            }
            TextArrayOptions textArrayOptionsTextArrayOptions = indexFieldIndexField.getTextArrayOptions();
            if (textArrayOptionsTextArrayOptions != null) {
                if (textArrayOptionsTextArrayOptions.getDefaultValue() != null) {
                    request.addParameter("IndexField.TextArrayOptions.DefaultValue", StringUtils.fromString(textArrayOptionsTextArrayOptions.getDefaultValue()));
                }
                if (textArrayOptionsTextArrayOptions.getSourceFields() != null) {
                    request.addParameter("IndexField.TextArrayOptions.SourceFields", StringUtils.fromString(textArrayOptionsTextArrayOptions.getSourceFields()));
                }
                if (textArrayOptionsTextArrayOptions.isReturnEnabled() != null) {
                    request.addParameter("IndexField.TextArrayOptions.ReturnEnabled", StringUtils.fromBoolean(textArrayOptionsTextArrayOptions.isReturnEnabled()));
                }
                if (textArrayOptionsTextArrayOptions.isHighlightEnabled() != null) {
                    request.addParameter("IndexField.TextArrayOptions.HighlightEnabled", StringUtils.fromBoolean(textArrayOptionsTextArrayOptions.isHighlightEnabled()));
                }
                if (textArrayOptionsTextArrayOptions.getAnalysisScheme() != null) {
                    request.addParameter("IndexField.TextArrayOptions.AnalysisScheme", StringUtils.fromString(textArrayOptionsTextArrayOptions.getAnalysisScheme()));
                }
            }
            DateArrayOptions dateArrayOptionsDateArrayOptions = indexFieldIndexField.getDateArrayOptions();
            if (dateArrayOptionsDateArrayOptions != null) {
                if (dateArrayOptionsDateArrayOptions.getDefaultValue() != null) {
                    request.addParameter("IndexField.DateArrayOptions.DefaultValue", StringUtils.fromString(dateArrayOptionsDateArrayOptions.getDefaultValue()));
                }
                if (dateArrayOptionsDateArrayOptions.getSourceFields() != null) {
                    request.addParameter("IndexField.DateArrayOptions.SourceFields", StringUtils.fromString(dateArrayOptionsDateArrayOptions.getSourceFields()));
                }
                if (dateArrayOptionsDateArrayOptions.isFacetEnabled() != null) {
                    request.addParameter("IndexField.DateArrayOptions.FacetEnabled", StringUtils.fromBoolean(dateArrayOptionsDateArrayOptions.isFacetEnabled()));
                }
                if (dateArrayOptionsDateArrayOptions.isSearchEnabled() != null) {
                    request.addParameter("IndexField.DateArrayOptions.SearchEnabled", StringUtils.fromBoolean(dateArrayOptionsDateArrayOptions.isSearchEnabled()));
                }
                if (dateArrayOptionsDateArrayOptions.isReturnEnabled() != null) {
                    request.addParameter("IndexField.DateArrayOptions.ReturnEnabled", StringUtils.fromBoolean(dateArrayOptionsDateArrayOptions.isReturnEnabled()));
                }
            }
        }

        return request;
    }
}
