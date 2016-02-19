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
}
