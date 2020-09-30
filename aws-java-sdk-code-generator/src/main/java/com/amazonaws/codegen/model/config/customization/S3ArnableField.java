/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.codegen.model.config.customization;

import com.amazonaws.arn.ArnConverter;
import java.util.Map;

/**
 * Indicating a field that can be an ARN
 */
public class S3ArnableField {
    private String field;

    private String arnConverterFqcn;

    private String arnResourceFqcn;

    /**
     * The ARN field to be substituted with the value from the getter
     */
    private String arnResourceSubstitutionGetter;

    /**
     * Contains the fields that need to be populated if null from the getter methods.
     *
     * The key is the field name and the value is the getter method in ARN which supplies the value
     */
    private Map<String, String> otherFieldsToPopulate;

    public String getField() {
        return field;
    }

    /**
     * Sets the field
     *
     * @param field The new field value.
     * @return This object for method chaining.
     */
    public S3ArnableField withField(String field) {
        this.field = field;
        return this;
    }

    /**
     * @return the FQCN of the {@link ArnConverter}
     */
    public String getArnConverterFqcn() {
        return arnConverterFqcn;
    }

    /**
     * Sets the arnConverterFqcn
     *
     * @param arnConverterFqcn The new arnConverterFqcn value.
     * @return This object for method chaining.
     */
    public S3ArnableField withArnConverterFqcn(String arnConverterFqcn) {
        this.arnConverterFqcn = arnConverterFqcn;
        return this;
    }

    public String getArnResourceFqcn() {
        return arnResourceFqcn;
    }

    /**
     * Sets the arnResourceFqcn
     *
     * @param arnResourceFqcn The new arnResourceFqcn value.
     * @return This object for method chaining.
     */
    public S3ArnableField withArnResourceFqcn(String arnResourceFqcn) {
        this.arnResourceFqcn = arnResourceFqcn;
        return this;
    }

    public String getArnResourceSubstitutionGetter() {
        return arnResourceSubstitutionGetter;
    }

    /**
     * Sets the arnResourceSubstitutionGetter
     *
     * @param arnResourceSubstitutionGetter The new arnResourceSubstitutionGetter value.
     * @return This object for method chaining.
     */
    public S3ArnableField withArnResourceSubstitutionGetter(String arnResourceSubstitutionGetter) {
        this.arnResourceSubstitutionGetter = arnResourceSubstitutionGetter;
        return this;
    }

    public Map<String, String> getOtherFieldsToPopulate() {
        return otherFieldsToPopulate;
    }

    /**
     * Sets the substitionSetterToGetter
     *
     * @param substitionSetterToGetter The new substitionSetterToGetter value.
     * @return This object for method chaining.
     */
    public S3ArnableField withSubstitionSetterToGetter(Map<String, String> substitionSetterToGetter) {
        this.otherFieldsToPopulate = substitionSetterToGetter;
        return this;
    }
}
