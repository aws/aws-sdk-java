/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.verifiedpermissions.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request failed because one or more input parameters don't satisfy their constraint requirements. The output is
 * provided as a list of fields and a reason for each field that isn't valid.
 * </p>
 * <p>
 * The possible reasons include the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>UnrecognizedEntityType</b>
 * </p>
 * <p>
 * The policy includes an entity type that isn't found in the schema.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>UnrecognizedActionId</b>
 * </p>
 * <p>
 * The policy includes an action id that isn't found in the schema.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>InvalidActionApplication</b>
 * </p>
 * <p>
 * The policy includes an action that, according to the schema, doesn't support the specified principal and resource.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>UnexpectedType</b>
 * </p>
 * <p>
 * The policy included an operand that isn't a valid type for the specified operation.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>IncompatibleTypes</b>
 * </p>
 * <p>
 * The types of elements included in a <code>set</code>, or the types of expressions used in an
 * <code>if...then...else</code> clause aren't compatible in this context.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>MissingAttribute</b>
 * </p>
 * <p>
 * The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for the existence
 * of the attribute first before attempting to access its value. For more information, see the <a
 * href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has (presence of
 * attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>UnsafeOptionalAttributeAccess</b>
 * </p>
 * <p>
 * The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be present. Test
 * for the existence of the attribute first before attempting to access its value. For more information, see the <a
 * href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has (presence of
 * attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>ImpossiblePolicy</b>
 * </p>
 * <p>
 * Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it can never
 * apply to any query, and so it can never affect an authorization decision.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>WrongNumberArguments</b>
 * </p>
 * <p>
 * The policy references an extension type with the wrong number of arguments.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>FunctionArgumentValidationError</b>
 * </p>
 * <p>
 * Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed as an IPv4
 * address can contain only digits and the period character.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationException extends com.amazonaws.services.verifiedpermissions.model.AmazonVerifiedPermissionsException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The list of fields that aren't valid.
     * </p>
     */
    private java.util.List<ValidationExceptionField> fieldList;

    /**
     * Constructs a new ValidationException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ValidationException(String message) {
        super(message);
    }

    /**
     * <p>
     * The list of fields that aren't valid.
     * </p>
     * 
     * @return The list of fields that aren't valid.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("fieldList")
    public java.util.List<ValidationExceptionField> getFieldList() {
        return fieldList;
    }

    /**
     * <p>
     * The list of fields that aren't valid.
     * </p>
     * 
     * @param fieldList
     *        The list of fields that aren't valid.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("fieldList")
    public void setFieldList(java.util.Collection<ValidationExceptionField> fieldList) {
        if (fieldList == null) {
            this.fieldList = null;
            return;
        }

        this.fieldList = new java.util.ArrayList<ValidationExceptionField>(fieldList);
    }

    /**
     * <p>
     * The list of fields that aren't valid.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldList(java.util.Collection)} or {@link #withFieldList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param fieldList
     *        The list of fields that aren't valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationException withFieldList(ValidationExceptionField... fieldList) {
        if (this.fieldList == null) {
            setFieldList(new java.util.ArrayList<ValidationExceptionField>(fieldList.length));
        }
        for (ValidationExceptionField ele : fieldList) {
            this.fieldList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of fields that aren't valid.
     * </p>
     * 
     * @param fieldList
     *        The list of fields that aren't valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationException withFieldList(java.util.Collection<ValidationExceptionField> fieldList) {
        setFieldList(fieldList);
        return this;
    }

}
