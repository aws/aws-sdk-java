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
package com.amazonaws.services.serverlessapplicationrepository.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Parameters supported by the application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/ParameterDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A regular expression that represents the patterns to allow for String types.
     * </p>
     */
    private String allowedPattern;
    /**
     * <p>
     * An array containing the list of values allowed for the parameter.
     * </p>
     */
    private java.util.List<String> allowedValues;
    /**
     * <p>
     * A string that explains a constraint when the constraint is violated. For example, without a constraint
     * description, a parameter that has an allowed pattern of [A-Za-z0-9]+ displays the following error message when
     * the user specifies an invalid value:
     * </p>
     * <p>
     * Malformed input-Parameter MyParameter must match pattern [A-Za-z0-9]+
     * </p>
     * <p>
     * By adding a constraint description, such as "must contain only uppercase and lowercase letters and numbers," you
     * can display the following customized error message:
     * </p>
     * <p>
     * Malformed input-Parameter MyParameter must contain only uppercase and lowercase letters and numbers.
     * </p>
     */
    private String constraintDescription;
    /**
     * <p>
     * A value of the appropriate type for the template to use if no value is specified when a stack is created. If you
     * define constraints for the parameter, you must specify a value that adheres to those constraints.
     * </p>
     */
    private String defaultValue;
    /**
     * <p>
     * A string of up to 4,000 characters that describes the parameter.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An integer value that determines the largest number of characters that you want to allow for String types.
     * </p>
     */
    private Integer maxLength;
    /**
     * <p>
     * A numeric value that determines the largest numeric value that you want to allow for Number types.
     * </p>
     */
    private Integer maxValue;
    /**
     * <p>
     * An integer value that determines the smallest number of characters that you want to allow for String types.
     * </p>
     */
    private Integer minLength;
    /**
     * <p>
     * A numeric value that determines the smallest numeric value that you want to allow for Number types.
     * </p>
     */
    private Integer minValue;
    /**
     * <p>
     * The name of the parameter.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Whether to mask the parameter value whenever anyone makes a call that describes the stack. If you set the value
     * to true, the parameter value is masked with asterisks (*****).
     * </p>
     */
    private Boolean noEcho;
    /**
     * <p>
     * A list of AWS SAM resources that use this parameter.
     * </p>
     */
    private java.util.List<String> referencedByResources;
    /**
     * <p>
     * The type of the parameter.
     * </p>
     * <p>
     * Valid values: String | Number | List&lt;Number> | CommaDelimitedList
     * </p>
     * <p>
     * String: A literal string.
     * </p>
     * <p>
     * For example, users can specify "MyUserName".
     * </p>
     * <p>
     * Number: An integer or float. AWS CloudFormation validates the parameter value as a number. However, when you use
     * the parameter elsewhere in your template (for example, by using the Ref intrinsic function), the parameter value
     * becomes a string.
     * </p>
     * <p>
     * For example, users might specify "8888".
     * </p>
     * <p>
     * List&lt;Number>: An array of integers or floats that are separated by commas. AWS CloudFormation validates the
     * parameter value as numbers. However, when you use the parameter elsewhere in your template (for example, by using
     * the Ref intrinsic function), the parameter value becomes a list of strings.
     * </p>
     * <p>
     * For example, users might specify "80,20", and then Ref results in ["80","20"].
     * </p>
     * <p>
     * CommaDelimitedList: An array of literal strings that are separated by commas. The total number of strings should
     * be one more than the total number of commas. Also, each member string is space-trimmed.
     * </p>
     * <p>
     * For example, users might specify "test,dev,prod", and then Ref results in ["test","dev","prod"].
     * </p>
     */
    private String type;

    /**
     * <p>
     * A regular expression that represents the patterns to allow for String types.
     * </p>
     * 
     * @param allowedPattern
     *        A regular expression that represents the patterns to allow for String types.
     */

    public void setAllowedPattern(String allowedPattern) {
        this.allowedPattern = allowedPattern;
    }

    /**
     * <p>
     * A regular expression that represents the patterns to allow for String types.
     * </p>
     * 
     * @return A regular expression that represents the patterns to allow for String types.
     */

    public String getAllowedPattern() {
        return this.allowedPattern;
    }

    /**
     * <p>
     * A regular expression that represents the patterns to allow for String types.
     * </p>
     * 
     * @param allowedPattern
     *        A regular expression that represents the patterns to allow for String types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDefinition withAllowedPattern(String allowedPattern) {
        setAllowedPattern(allowedPattern);
        return this;
    }

    /**
     * <p>
     * An array containing the list of values allowed for the parameter.
     * </p>
     * 
     * @return An array containing the list of values allowed for the parameter.
     */

    public java.util.List<String> getAllowedValues() {
        return allowedValues;
    }

    /**
     * <p>
     * An array containing the list of values allowed for the parameter.
     * </p>
     * 
     * @param allowedValues
     *        An array containing the list of values allowed for the parameter.
     */

    public void setAllowedValues(java.util.Collection<String> allowedValues) {
        if (allowedValues == null) {
            this.allowedValues = null;
            return;
        }

        this.allowedValues = new java.util.ArrayList<String>(allowedValues);
    }

    /**
     * <p>
     * An array containing the list of values allowed for the parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedValues(java.util.Collection)} or {@link #withAllowedValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param allowedValues
     *        An array containing the list of values allowed for the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDefinition withAllowedValues(String... allowedValues) {
        if (this.allowedValues == null) {
            setAllowedValues(new java.util.ArrayList<String>(allowedValues.length));
        }
        for (String ele : allowedValues) {
            this.allowedValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array containing the list of values allowed for the parameter.
     * </p>
     * 
     * @param allowedValues
     *        An array containing the list of values allowed for the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDefinition withAllowedValues(java.util.Collection<String> allowedValues) {
        setAllowedValues(allowedValues);
        return this;
    }

    /**
     * <p>
     * A string that explains a constraint when the constraint is violated. For example, without a constraint
     * description, a parameter that has an allowed pattern of [A-Za-z0-9]+ displays the following error message when
     * the user specifies an invalid value:
     * </p>
     * <p>
     * Malformed input-Parameter MyParameter must match pattern [A-Za-z0-9]+
     * </p>
     * <p>
     * By adding a constraint description, such as "must contain only uppercase and lowercase letters and numbers," you
     * can display the following customized error message:
     * </p>
     * <p>
     * Malformed input-Parameter MyParameter must contain only uppercase and lowercase letters and numbers.
     * </p>
     * 
     * @param constraintDescription
     *        A string that explains a constraint when the constraint is violated. For example, without a constraint
     *        description, a parameter that has an allowed pattern of [A-Za-z0-9]+ displays the following error message
     *        when the user specifies an invalid value:</p>
     *        <p>
     *        Malformed input-Parameter MyParameter must match pattern [A-Za-z0-9]+
     *        </p>
     *        <p>
     *        By adding a constraint description, such as
     *        "must contain only uppercase and lowercase letters and numbers," you can display the following customized
     *        error message:
     *        </p>
     *        <p>
     *        Malformed input-Parameter MyParameter must contain only uppercase and lowercase letters and numbers.
     */

    public void setConstraintDescription(String constraintDescription) {
        this.constraintDescription = constraintDescription;
    }

    /**
     * <p>
     * A string that explains a constraint when the constraint is violated. For example, without a constraint
     * description, a parameter that has an allowed pattern of [A-Za-z0-9]+ displays the following error message when
     * the user specifies an invalid value:
     * </p>
     * <p>
     * Malformed input-Parameter MyParameter must match pattern [A-Za-z0-9]+
     * </p>
     * <p>
     * By adding a constraint description, such as "must contain only uppercase and lowercase letters and numbers," you
     * can display the following customized error message:
     * </p>
     * <p>
     * Malformed input-Parameter MyParameter must contain only uppercase and lowercase letters and numbers.
     * </p>
     * 
     * @return A string that explains a constraint when the constraint is violated. For example, without a constraint
     *         description, a parameter that has an allowed pattern of [A-Za-z0-9]+ displays the following error message
     *         when the user specifies an invalid value:</p>
     *         <p>
     *         Malformed input-Parameter MyParameter must match pattern [A-Za-z0-9]+
     *         </p>
     *         <p>
     *         By adding a constraint description, such as
     *         "must contain only uppercase and lowercase letters and numbers," you can display the following customized
     *         error message:
     *         </p>
     *         <p>
     *         Malformed input-Parameter MyParameter must contain only uppercase and lowercase letters and numbers.
     */

    public String getConstraintDescription() {
        return this.constraintDescription;
    }

    /**
     * <p>
     * A string that explains a constraint when the constraint is violated. For example, without a constraint
     * description, a parameter that has an allowed pattern of [A-Za-z0-9]+ displays the following error message when
     * the user specifies an invalid value:
     * </p>
     * <p>
     * Malformed input-Parameter MyParameter must match pattern [A-Za-z0-9]+
     * </p>
     * <p>
     * By adding a constraint description, such as "must contain only uppercase and lowercase letters and numbers," you
     * can display the following customized error message:
     * </p>
     * <p>
     * Malformed input-Parameter MyParameter must contain only uppercase and lowercase letters and numbers.
     * </p>
     * 
     * @param constraintDescription
     *        A string that explains a constraint when the constraint is violated. For example, without a constraint
     *        description, a parameter that has an allowed pattern of [A-Za-z0-9]+ displays the following error message
     *        when the user specifies an invalid value:</p>
     *        <p>
     *        Malformed input-Parameter MyParameter must match pattern [A-Za-z0-9]+
     *        </p>
     *        <p>
     *        By adding a constraint description, such as
     *        "must contain only uppercase and lowercase letters and numbers," you can display the following customized
     *        error message:
     *        </p>
     *        <p>
     *        Malformed input-Parameter MyParameter must contain only uppercase and lowercase letters and numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDefinition withConstraintDescription(String constraintDescription) {
        setConstraintDescription(constraintDescription);
        return this;
    }

    /**
     * <p>
     * A value of the appropriate type for the template to use if no value is specified when a stack is created. If you
     * define constraints for the parameter, you must specify a value that adheres to those constraints.
     * </p>
     * 
     * @param defaultValue
     *        A value of the appropriate type for the template to use if no value is specified when a stack is created.
     *        If you define constraints for the parameter, you must specify a value that adheres to those constraints.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * A value of the appropriate type for the template to use if no value is specified when a stack is created. If you
     * define constraints for the parameter, you must specify a value that adheres to those constraints.
     * </p>
     * 
     * @return A value of the appropriate type for the template to use if no value is specified when a stack is created.
     *         If you define constraints for the parameter, you must specify a value that adheres to those constraints.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * A value of the appropriate type for the template to use if no value is specified when a stack is created. If you
     * define constraints for the parameter, you must specify a value that adheres to those constraints.
     * </p>
     * 
     * @param defaultValue
     *        A value of the appropriate type for the template to use if no value is specified when a stack is created.
     *        If you define constraints for the parameter, you must specify a value that adheres to those constraints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDefinition withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * A string of up to 4,000 characters that describes the parameter.
     * </p>
     * 
     * @param description
     *        A string of up to 4,000 characters that describes the parameter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A string of up to 4,000 characters that describes the parameter.
     * </p>
     * 
     * @return A string of up to 4,000 characters that describes the parameter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A string of up to 4,000 characters that describes the parameter.
     * </p>
     * 
     * @param description
     *        A string of up to 4,000 characters that describes the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDefinition withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An integer value that determines the largest number of characters that you want to allow for String types.
     * </p>
     * 
     * @param maxLength
     *        An integer value that determines the largest number of characters that you want to allow for String types.
     */

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    /**
     * <p>
     * An integer value that determines the largest number of characters that you want to allow for String types.
     * </p>
     * 
     * @return An integer value that determines the largest number of characters that you want to allow for String
     *         types.
     */

    public Integer getMaxLength() {
        return this.maxLength;
    }

    /**
     * <p>
     * An integer value that determines the largest number of characters that you want to allow for String types.
     * </p>
     * 
     * @param maxLength
     *        An integer value that determines the largest number of characters that you want to allow for String types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDefinition withMaxLength(Integer maxLength) {
        setMaxLength(maxLength);
        return this;
    }

    /**
     * <p>
     * A numeric value that determines the largest numeric value that you want to allow for Number types.
     * </p>
     * 
     * @param maxValue
     *        A numeric value that determines the largest numeric value that you want to allow for Number types.
     */

    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * <p>
     * A numeric value that determines the largest numeric value that you want to allow for Number types.
     * </p>
     * 
     * @return A numeric value that determines the largest numeric value that you want to allow for Number types.
     */

    public Integer getMaxValue() {
        return this.maxValue;
    }

    /**
     * <p>
     * A numeric value that determines the largest numeric value that you want to allow for Number types.
     * </p>
     * 
     * @param maxValue
     *        A numeric value that determines the largest numeric value that you want to allow for Number types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDefinition withMaxValue(Integer maxValue) {
        setMaxValue(maxValue);
        return this;
    }

    /**
     * <p>
     * An integer value that determines the smallest number of characters that you want to allow for String types.
     * </p>
     * 
     * @param minLength
     *        An integer value that determines the smallest number of characters that you want to allow for String
     *        types.
     */

    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    /**
     * <p>
     * An integer value that determines the smallest number of characters that you want to allow for String types.
     * </p>
     * 
     * @return An integer value that determines the smallest number of characters that you want to allow for String
     *         types.
     */

    public Integer getMinLength() {
        return this.minLength;
    }

    /**
     * <p>
     * An integer value that determines the smallest number of characters that you want to allow for String types.
     * </p>
     * 
     * @param minLength
     *        An integer value that determines the smallest number of characters that you want to allow for String
     *        types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDefinition withMinLength(Integer minLength) {
        setMinLength(minLength);
        return this;
    }

    /**
     * <p>
     * A numeric value that determines the smallest numeric value that you want to allow for Number types.
     * </p>
     * 
     * @param minValue
     *        A numeric value that determines the smallest numeric value that you want to allow for Number types.
     */

    public void setMinValue(Integer minValue) {
        this.minValue = minValue;
    }

    /**
     * <p>
     * A numeric value that determines the smallest numeric value that you want to allow for Number types.
     * </p>
     * 
     * @return A numeric value that determines the smallest numeric value that you want to allow for Number types.
     */

    public Integer getMinValue() {
        return this.minValue;
    }

    /**
     * <p>
     * A numeric value that determines the smallest numeric value that you want to allow for Number types.
     * </p>
     * 
     * @param minValue
     *        A numeric value that determines the smallest numeric value that you want to allow for Number types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDefinition withMinValue(Integer minValue) {
        setMinValue(minValue);
        return this;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @param name
     *        The name of the parameter.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @return The name of the parameter.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @param name
     *        The name of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDefinition withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Whether to mask the parameter value whenever anyone makes a call that describes the stack. If you set the value
     * to true, the parameter value is masked with asterisks (*****).
     * </p>
     * 
     * @param noEcho
     *        Whether to mask the parameter value whenever anyone makes a call that describes the stack. If you set the
     *        value to true, the parameter value is masked with asterisks (*****).
     */

    public void setNoEcho(Boolean noEcho) {
        this.noEcho = noEcho;
    }

    /**
     * <p>
     * Whether to mask the parameter value whenever anyone makes a call that describes the stack. If you set the value
     * to true, the parameter value is masked with asterisks (*****).
     * </p>
     * 
     * @return Whether to mask the parameter value whenever anyone makes a call that describes the stack. If you set the
     *         value to true, the parameter value is masked with asterisks (*****).
     */

    public Boolean getNoEcho() {
        return this.noEcho;
    }

    /**
     * <p>
     * Whether to mask the parameter value whenever anyone makes a call that describes the stack. If you set the value
     * to true, the parameter value is masked with asterisks (*****).
     * </p>
     * 
     * @param noEcho
     *        Whether to mask the parameter value whenever anyone makes a call that describes the stack. If you set the
     *        value to true, the parameter value is masked with asterisks (*****).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDefinition withNoEcho(Boolean noEcho) {
        setNoEcho(noEcho);
        return this;
    }

    /**
     * <p>
     * Whether to mask the parameter value whenever anyone makes a call that describes the stack. If you set the value
     * to true, the parameter value is masked with asterisks (*****).
     * </p>
     * 
     * @return Whether to mask the parameter value whenever anyone makes a call that describes the stack. If you set the
     *         value to true, the parameter value is masked with asterisks (*****).
     */

    public Boolean isNoEcho() {
        return this.noEcho;
    }

    /**
     * <p>
     * A list of AWS SAM resources that use this parameter.
     * </p>
     * 
     * @return A list of AWS SAM resources that use this parameter.
     */

    public java.util.List<String> getReferencedByResources() {
        return referencedByResources;
    }

    /**
     * <p>
     * A list of AWS SAM resources that use this parameter.
     * </p>
     * 
     * @param referencedByResources
     *        A list of AWS SAM resources that use this parameter.
     */

    public void setReferencedByResources(java.util.Collection<String> referencedByResources) {
        if (referencedByResources == null) {
            this.referencedByResources = null;
            return;
        }

        this.referencedByResources = new java.util.ArrayList<String>(referencedByResources);
    }

    /**
     * <p>
     * A list of AWS SAM resources that use this parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReferencedByResources(java.util.Collection)} or
     * {@link #withReferencedByResources(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param referencedByResources
     *        A list of AWS SAM resources that use this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDefinition withReferencedByResources(String... referencedByResources) {
        if (this.referencedByResources == null) {
            setReferencedByResources(new java.util.ArrayList<String>(referencedByResources.length));
        }
        for (String ele : referencedByResources) {
            this.referencedByResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of AWS SAM resources that use this parameter.
     * </p>
     * 
     * @param referencedByResources
     *        A list of AWS SAM resources that use this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDefinition withReferencedByResources(java.util.Collection<String> referencedByResources) {
        setReferencedByResources(referencedByResources);
        return this;
    }

    /**
     * <p>
     * The type of the parameter.
     * </p>
     * <p>
     * Valid values: String | Number | List&lt;Number> | CommaDelimitedList
     * </p>
     * <p>
     * String: A literal string.
     * </p>
     * <p>
     * For example, users can specify "MyUserName".
     * </p>
     * <p>
     * Number: An integer or float. AWS CloudFormation validates the parameter value as a number. However, when you use
     * the parameter elsewhere in your template (for example, by using the Ref intrinsic function), the parameter value
     * becomes a string.
     * </p>
     * <p>
     * For example, users might specify "8888".
     * </p>
     * <p>
     * List&lt;Number>: An array of integers or floats that are separated by commas. AWS CloudFormation validates the
     * parameter value as numbers. However, when you use the parameter elsewhere in your template (for example, by using
     * the Ref intrinsic function), the parameter value becomes a list of strings.
     * </p>
     * <p>
     * For example, users might specify "80,20", and then Ref results in ["80","20"].
     * </p>
     * <p>
     * CommaDelimitedList: An array of literal strings that are separated by commas. The total number of strings should
     * be one more than the total number of commas. Also, each member string is space-trimmed.
     * </p>
     * <p>
     * For example, users might specify "test,dev,prod", and then Ref results in ["test","dev","prod"].
     * </p>
     * 
     * @param type
     *        The type of the parameter.</p>
     *        <p>
     *        Valid values: String | Number | List&lt;Number> | CommaDelimitedList
     *        </p>
     *        <p>
     *        String: A literal string.
     *        </p>
     *        <p>
     *        For example, users can specify "MyUserName".
     *        </p>
     *        <p>
     *        Number: An integer or float. AWS CloudFormation validates the parameter value as a number. However, when
     *        you use the parameter elsewhere in your template (for example, by using the Ref intrinsic function), the
     *        parameter value becomes a string.
     *        </p>
     *        <p>
     *        For example, users might specify "8888".
     *        </p>
     *        <p>
     *        List&lt;Number>: An array of integers or floats that are separated by commas. AWS CloudFormation validates
     *        the parameter value as numbers. However, when you use the parameter elsewhere in your template (for
     *        example, by using the Ref intrinsic function), the parameter value becomes a list of strings.
     *        </p>
     *        <p>
     *        For example, users might specify "80,20", and then Ref results in ["80","20"].
     *        </p>
     *        <p>
     *        CommaDelimitedList: An array of literal strings that are separated by commas. The total number of strings
     *        should be one more than the total number of commas. Also, each member string is space-trimmed.
     *        </p>
     *        <p>
     *        For example, users might specify "test,dev,prod", and then Ref results in ["test","dev","prod"].
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the parameter.
     * </p>
     * <p>
     * Valid values: String | Number | List&lt;Number> | CommaDelimitedList
     * </p>
     * <p>
     * String: A literal string.
     * </p>
     * <p>
     * For example, users can specify "MyUserName".
     * </p>
     * <p>
     * Number: An integer or float. AWS CloudFormation validates the parameter value as a number. However, when you use
     * the parameter elsewhere in your template (for example, by using the Ref intrinsic function), the parameter value
     * becomes a string.
     * </p>
     * <p>
     * For example, users might specify "8888".
     * </p>
     * <p>
     * List&lt;Number>: An array of integers or floats that are separated by commas. AWS CloudFormation validates the
     * parameter value as numbers. However, when you use the parameter elsewhere in your template (for example, by using
     * the Ref intrinsic function), the parameter value becomes a list of strings.
     * </p>
     * <p>
     * For example, users might specify "80,20", and then Ref results in ["80","20"].
     * </p>
     * <p>
     * CommaDelimitedList: An array of literal strings that are separated by commas. The total number of strings should
     * be one more than the total number of commas. Also, each member string is space-trimmed.
     * </p>
     * <p>
     * For example, users might specify "test,dev,prod", and then Ref results in ["test","dev","prod"].
     * </p>
     * 
     * @return The type of the parameter.</p>
     *         <p>
     *         Valid values: String | Number | List&lt;Number> | CommaDelimitedList
     *         </p>
     *         <p>
     *         String: A literal string.
     *         </p>
     *         <p>
     *         For example, users can specify "MyUserName".
     *         </p>
     *         <p>
     *         Number: An integer or float. AWS CloudFormation validates the parameter value as a number. However, when
     *         you use the parameter elsewhere in your template (for example, by using the Ref intrinsic function), the
     *         parameter value becomes a string.
     *         </p>
     *         <p>
     *         For example, users might specify "8888".
     *         </p>
     *         <p>
     *         List&lt;Number>: An array of integers or floats that are separated by commas. AWS CloudFormation
     *         validates the parameter value as numbers. However, when you use the parameter elsewhere in your template
     *         (for example, by using the Ref intrinsic function), the parameter value becomes a list of strings.
     *         </p>
     *         <p>
     *         For example, users might specify "80,20", and then Ref results in ["80","20"].
     *         </p>
     *         <p>
     *         CommaDelimitedList: An array of literal strings that are separated by commas. The total number of strings
     *         should be one more than the total number of commas. Also, each member string is space-trimmed.
     *         </p>
     *         <p>
     *         For example, users might specify "test,dev,prod", and then Ref results in ["test","dev","prod"].
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the parameter.
     * </p>
     * <p>
     * Valid values: String | Number | List&lt;Number> | CommaDelimitedList
     * </p>
     * <p>
     * String: A literal string.
     * </p>
     * <p>
     * For example, users can specify "MyUserName".
     * </p>
     * <p>
     * Number: An integer or float. AWS CloudFormation validates the parameter value as a number. However, when you use
     * the parameter elsewhere in your template (for example, by using the Ref intrinsic function), the parameter value
     * becomes a string.
     * </p>
     * <p>
     * For example, users might specify "8888".
     * </p>
     * <p>
     * List&lt;Number>: An array of integers or floats that are separated by commas. AWS CloudFormation validates the
     * parameter value as numbers. However, when you use the parameter elsewhere in your template (for example, by using
     * the Ref intrinsic function), the parameter value becomes a list of strings.
     * </p>
     * <p>
     * For example, users might specify "80,20", and then Ref results in ["80","20"].
     * </p>
     * <p>
     * CommaDelimitedList: An array of literal strings that are separated by commas. The total number of strings should
     * be one more than the total number of commas. Also, each member string is space-trimmed.
     * </p>
     * <p>
     * For example, users might specify "test,dev,prod", and then Ref results in ["test","dev","prod"].
     * </p>
     * 
     * @param type
     *        The type of the parameter.</p>
     *        <p>
     *        Valid values: String | Number | List&lt;Number> | CommaDelimitedList
     *        </p>
     *        <p>
     *        String: A literal string.
     *        </p>
     *        <p>
     *        For example, users can specify "MyUserName".
     *        </p>
     *        <p>
     *        Number: An integer or float. AWS CloudFormation validates the parameter value as a number. However, when
     *        you use the parameter elsewhere in your template (for example, by using the Ref intrinsic function), the
     *        parameter value becomes a string.
     *        </p>
     *        <p>
     *        For example, users might specify "8888".
     *        </p>
     *        <p>
     *        List&lt;Number>: An array of integers or floats that are separated by commas. AWS CloudFormation validates
     *        the parameter value as numbers. However, when you use the parameter elsewhere in your template (for
     *        example, by using the Ref intrinsic function), the parameter value becomes a list of strings.
     *        </p>
     *        <p>
     *        For example, users might specify "80,20", and then Ref results in ["80","20"].
     *        </p>
     *        <p>
     *        CommaDelimitedList: An array of literal strings that are separated by commas. The total number of strings
     *        should be one more than the total number of commas. Also, each member string is space-trimmed.
     *        </p>
     *        <p>
     *        For example, users might specify "test,dev,prod", and then Ref results in ["test","dev","prod"].
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDefinition withType(String type) {
        setType(type);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAllowedPattern() != null)
            sb.append("AllowedPattern: ").append(getAllowedPattern()).append(",");
        if (getAllowedValues() != null)
            sb.append("AllowedValues: ").append(getAllowedValues()).append(",");
        if (getConstraintDescription() != null)
            sb.append("ConstraintDescription: ").append(getConstraintDescription()).append(",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getMaxLength() != null)
            sb.append("MaxLength: ").append(getMaxLength()).append(",");
        if (getMaxValue() != null)
            sb.append("MaxValue: ").append(getMaxValue()).append(",");
        if (getMinLength() != null)
            sb.append("MinLength: ").append(getMinLength()).append(",");
        if (getMinValue() != null)
            sb.append("MinValue: ").append(getMinValue()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNoEcho() != null)
            sb.append("NoEcho: ").append(getNoEcho()).append(",");
        if (getReferencedByResources() != null)
            sb.append("ReferencedByResources: ").append(getReferencedByResources()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterDefinition == false)
            return false;
        ParameterDefinition other = (ParameterDefinition) obj;
        if (other.getAllowedPattern() == null ^ this.getAllowedPattern() == null)
            return false;
        if (other.getAllowedPattern() != null && other.getAllowedPattern().equals(this.getAllowedPattern()) == false)
            return false;
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null)
            return false;
        if (other.getAllowedValues() != null && other.getAllowedValues().equals(this.getAllowedValues()) == false)
            return false;
        if (other.getConstraintDescription() == null ^ this.getConstraintDescription() == null)
            return false;
        if (other.getConstraintDescription() != null && other.getConstraintDescription().equals(this.getConstraintDescription()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getMaxLength() == null ^ this.getMaxLength() == null)
            return false;
        if (other.getMaxLength() != null && other.getMaxLength().equals(this.getMaxLength()) == false)
            return false;
        if (other.getMaxValue() == null ^ this.getMaxValue() == null)
            return false;
        if (other.getMaxValue() != null && other.getMaxValue().equals(this.getMaxValue()) == false)
            return false;
        if (other.getMinLength() == null ^ this.getMinLength() == null)
            return false;
        if (other.getMinLength() != null && other.getMinLength().equals(this.getMinLength()) == false)
            return false;
        if (other.getMinValue() == null ^ this.getMinValue() == null)
            return false;
        if (other.getMinValue() != null && other.getMinValue().equals(this.getMinValue()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNoEcho() == null ^ this.getNoEcho() == null)
            return false;
        if (other.getNoEcho() != null && other.getNoEcho().equals(this.getNoEcho()) == false)
            return false;
        if (other.getReferencedByResources() == null ^ this.getReferencedByResources() == null)
            return false;
        if (other.getReferencedByResources() != null && other.getReferencedByResources().equals(this.getReferencedByResources()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedPattern() == null) ? 0 : getAllowedPattern().hashCode());
        hashCode = prime * hashCode + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        hashCode = prime * hashCode + ((getConstraintDescription() == null) ? 0 : getConstraintDescription().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getMaxLength() == null) ? 0 : getMaxLength().hashCode());
        hashCode = prime * hashCode + ((getMaxValue() == null) ? 0 : getMaxValue().hashCode());
        hashCode = prime * hashCode + ((getMinLength() == null) ? 0 : getMinLength().hashCode());
        hashCode = prime * hashCode + ((getMinValue() == null) ? 0 : getMinValue().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNoEcho() == null) ? 0 : getNoEcho().hashCode());
        hashCode = prime * hashCode + ((getReferencedByResources() == null) ? 0 : getReferencedByResources().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ParameterDefinition clone() {
        try {
            return (ParameterDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.serverlessapplicationrepository.model.transform.ParameterDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
