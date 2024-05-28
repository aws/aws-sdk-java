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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/BatchGetFindingDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetFindingDetailsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Error information for findings that details could not be returned for.
     * </p>
     */
    private java.util.List<FindingDetailsError> errors;
    /**
     * <p>
     * A finding's vulnerability details.
     * </p>
     */
    private java.util.List<FindingDetail> findingDetails;

    /**
     * <p>
     * Error information for findings that details could not be returned for.
     * </p>
     * 
     * @return Error information for findings that details could not be returned for.
     */

    public java.util.List<FindingDetailsError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Error information for findings that details could not be returned for.
     * </p>
     * 
     * @param errors
     *        Error information for findings that details could not be returned for.
     */

    public void setErrors(java.util.Collection<FindingDetailsError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<FindingDetailsError>(errors);
    }

    /**
     * <p>
     * Error information for findings that details could not be returned for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Error information for findings that details could not be returned for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFindingDetailsResult withErrors(FindingDetailsError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<FindingDetailsError>(errors.length));
        }
        for (FindingDetailsError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Error information for findings that details could not be returned for.
     * </p>
     * 
     * @param errors
     *        Error information for findings that details could not be returned for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFindingDetailsResult withErrors(java.util.Collection<FindingDetailsError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * A finding's vulnerability details.
     * </p>
     * 
     * @return A finding's vulnerability details.
     */

    public java.util.List<FindingDetail> getFindingDetails() {
        return findingDetails;
    }

    /**
     * <p>
     * A finding's vulnerability details.
     * </p>
     * 
     * @param findingDetails
     *        A finding's vulnerability details.
     */

    public void setFindingDetails(java.util.Collection<FindingDetail> findingDetails) {
        if (findingDetails == null) {
            this.findingDetails = null;
            return;
        }

        this.findingDetails = new java.util.ArrayList<FindingDetail>(findingDetails);
    }

    /**
     * <p>
     * A finding's vulnerability details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindingDetails(java.util.Collection)} or {@link #withFindingDetails(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param findingDetails
     *        A finding's vulnerability details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFindingDetailsResult withFindingDetails(FindingDetail... findingDetails) {
        if (this.findingDetails == null) {
            setFindingDetails(new java.util.ArrayList<FindingDetail>(findingDetails.length));
        }
        for (FindingDetail ele : findingDetails) {
            this.findingDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A finding's vulnerability details.
     * </p>
     * 
     * @param findingDetails
     *        A finding's vulnerability details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFindingDetailsResult withFindingDetails(java.util.Collection<FindingDetail> findingDetails) {
        setFindingDetails(findingDetails);
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
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors()).append(",");
        if (getFindingDetails() != null)
            sb.append("FindingDetails: ").append(getFindingDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetFindingDetailsResult == false)
            return false;
        BatchGetFindingDetailsResult other = (BatchGetFindingDetailsResult) obj;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getFindingDetails() == null ^ this.getFindingDetails() == null)
            return false;
        if (other.getFindingDetails() != null && other.getFindingDetails().equals(this.getFindingDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getFindingDetails() == null) ? 0 : getFindingDetails().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetFindingDetailsResult clone() {
        try {
            return (BatchGetFindingDetailsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
