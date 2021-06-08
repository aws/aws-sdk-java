/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetAppValidationOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAppValidationOutputResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The validation output.
     * </p>
     */
    private java.util.List<ValidationOutput> validationOutputList;

    /**
     * <p>
     * The validation output.
     * </p>
     * 
     * @return The validation output.
     */

    public java.util.List<ValidationOutput> getValidationOutputList() {
        return validationOutputList;
    }

    /**
     * <p>
     * The validation output.
     * </p>
     * 
     * @param validationOutputList
     *        The validation output.
     */

    public void setValidationOutputList(java.util.Collection<ValidationOutput> validationOutputList) {
        if (validationOutputList == null) {
            this.validationOutputList = null;
            return;
        }

        this.validationOutputList = new java.util.ArrayList<ValidationOutput>(validationOutputList);
    }

    /**
     * <p>
     * The validation output.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidationOutputList(java.util.Collection)} or {@link #withValidationOutputList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param validationOutputList
     *        The validation output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAppValidationOutputResult withValidationOutputList(ValidationOutput... validationOutputList) {
        if (this.validationOutputList == null) {
            setValidationOutputList(new java.util.ArrayList<ValidationOutput>(validationOutputList.length));
        }
        for (ValidationOutput ele : validationOutputList) {
            this.validationOutputList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The validation output.
     * </p>
     * 
     * @param validationOutputList
     *        The validation output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAppValidationOutputResult withValidationOutputList(java.util.Collection<ValidationOutput> validationOutputList) {
        setValidationOutputList(validationOutputList);
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
        if (getValidationOutputList() != null)
            sb.append("ValidationOutputList: ").append(getValidationOutputList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAppValidationOutputResult == false)
            return false;
        GetAppValidationOutputResult other = (GetAppValidationOutputResult) obj;
        if (other.getValidationOutputList() == null ^ this.getValidationOutputList() == null)
            return false;
        if (other.getValidationOutputList() != null && other.getValidationOutputList().equals(this.getValidationOutputList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValidationOutputList() == null) ? 0 : getValidationOutputList().hashCode());
        return hashCode;
    }

    @Override
    public GetAppValidationOutputResult clone() {
        try {
            return (GetAppValidationOutputResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
