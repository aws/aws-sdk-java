/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.codegen.internal;

import com.amazonaws.codegen.model.intermediate.Metadata;
import com.amazonaws.codegen.model.intermediate.ShapeModel;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static com.amazonaws.codegen.internal.Constants.AWS_DOCS_HOST;
import static com.amazonaws.codegen.model.intermediate.ShapeType.Model;
import static com.amazonaws.codegen.model.intermediate.ShapeType.Request;
import static com.amazonaws.codegen.model.intermediate.ShapeType.Response;

public class DocumentationUtils {

    public static final String DEFAULT_ASYNC_RETURN = "A Java Future containing the result of the %s operation returned by the service.";

    public static final String DEFAULT_SYNC_RETURN = "Result of the %s operation returned by the service.";

    public static final String DEFAULT_SETTER = "Sets the value of the %s property for this object.";

    public static final String DEFAULT_SETTER_PARAM = "The new value for the %s property for this object.";

    public static final String DEFAULT_GETTER = "Returns the value of the %s property for this object.";

    public static final String DEFAULT_GETTER_PARAM = "The value of the %s property for this object.";

    public static final String DEFAULT_FLUENT_RETURN = "Returns a reference to this object so that method calls can be chained together.";

    public static final String CONSTRUCTOR_DOC = "Constructs a new %s object. Callers should use the setter or fluent setter (with...) methods to initialize any additional object members.";

    public static final String LIST_VARARG_ADDITIONAL_DOC = "<p><b>NOTE:</b> This method appends the values to the existing list (if any). Use {@link #set%s(java.util.Collection)} or {@link #with%s(java.util.Collection)} if you want to override the existing values.</p>";

    //TODO kylthoms@: probably should move this to a custom config in each service
    private static final Set<String> SERVICES_EXCLUDED_FROM_CROSS_LINKING = new HashSet<>(Arrays.asList(
            "apigateway", "budgets", "cloudsearch", "cloudsearchdomain",
            "discovery", "elastictranscoder", "es", "glacier", "importexport",
            "iot", "data.iot", "machinelearning", "rekognition", "s3", "sdb"
    ));

    public static String generateSetterDocumentation() {
        return null;
    }

    public static String generateGetterDocumentation() {
        return null;
    }

    public static String generateWitherDocumentation() {
        return null;
    }

    /**
     * Returns a documentation with HTML tags prefixed and suffixed removed, or
     * returns empty string if the input is empty or null. This method is to be
     * used when constructing documentation for method parameters.
     *
     * @param documentation
     *            unprocessed input documentation
     * @return HTML tag stripped documentation or empty string if input was
     *         null.
     */
    public static String stripHTMLTags(String documentation) {
        if (documentation == null) {
            return "";
        }

        if (documentation.startsWith("<")) {
            int startTagIndex = documentation.indexOf(">");
            final int closingTagIndex = documentation.lastIndexOf("<");
            if (closingTagIndex > startTagIndex) {
                documentation =  stripHTMLTags(documentation.substring
                        (startTagIndex + 1,
                        closingTagIndex));
            } else {
                documentation = stripHTMLTags(documentation.substring
                        (startTagIndex + 1));
            }
        }

        return documentation.trim();
    }

    /**
     * Escapes Java comment breaking illegal character sequences.
     *
     * @param documentation
     *            unprocessed input documentation
     * @return escaped documentation, or empty string if input was null
     */
    public static String escapeIllegalCharacters(String documentation) {
        if (documentation == null) {
            return "";
        }

        /*
         * this specifically handles a case where a '* /' sequence may
         * be present in documentation and inadvertently terminate that Java
         * comment line, resulting in broken code.
         */
        documentation = documentation.replaceAll("\\*\\/", "*&#47;");

        return documentation;
    }

    /**
     * Create the HTML for a link to the operation/shape core AWS docs site
     *
     * @param metadata  the UID for the service from that services metadata
     * @param name the name of the shape/request/operation
     *
     * @return a '@see also' HTML link to the doc
     */
    public static String createLinkToServiceDocumentation(Metadata metadata, String name) {
        if (isCrossLinkingEnabledForService(metadata)) {
            return String.format("@see <a href=\"http://%s/goto/WebAPI/%s/%s\" target=\"_top\">AWS API Documentation</a>",
                    AWS_DOCS_HOST,
                    metadata.getUid(),
                    name);
        }
        return "";
    }

    /**
     * Create the HTML for a link to the operation/shape core AWS docs site
     *
     * @param metadata  the UID for the service from that services metadata
     * @param shapeModel the model of the shape
     *
     * @return a '@see also' HTML link to the doc
     */
    public static String createLinkToServiceDocumentation(Metadata metadata, ShapeModel shapeModel) {
        return isRequestResponseOrModel(shapeModel) ? createLinkToServiceDocumentation(metadata, shapeModel.getDocumentationShapeName()) : "";
    }

    public static String removeFromEnd(String string, String stringToRemove) {
        return string.endsWith(stringToRemove) ? string.substring(0, string.length() - stringToRemove.length()) : string;
    }

    private static boolean isRequestResponseOrModel(ShapeModel shapeModel) {
        return shapeModel.getShapeType() == Model || shapeModel.getShapeType() == Request || shapeModel.getShapeType() == Response;
    }

    private static boolean isCrossLinkingEnabledForService(Metadata metadata) {
        return metadata.getUid() != null && metadata.getEndpointPrefix() != null && !SERVICES_EXCLUDED_FROM_CROSS_LINKING.contains(metadata.getEndpointPrefix());
    }
}
