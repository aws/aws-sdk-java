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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/CreateAdditionalAssignmentsForHIT"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAdditionalAssignmentsForHITRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the HIT to extend.
     * </p>
     */
    private String hITId;
    /**
     * <p>
     * The number of additional assignments to request for this HIT.
     * </p>
     */
    private Integer numberOfAdditionalAssignments;
    /**
     * <p>
     * A unique identifier for this request, which allows you to retry the call on error without extending the HIT
     * multiple times. This is useful in cases such as network timeouts where it is unclear whether or not the call
     * succeeded on the server. If the extend HIT already exists in the system from a previous call using the same
     * <code>UniqueRequestToken</code>, subsequent calls will return an error with a message containing the request ID.
     * </p>
     */
    private String uniqueRequestToken;

    /**
     * <p>
     * The ID of the HIT to extend.
     * </p>
     * 
     * @param hITId
     *        The ID of the HIT to extend.
     */

    public void setHITId(String hITId) {
        this.hITId = hITId;
    }

    /**
     * <p>
     * The ID of the HIT to extend.
     * </p>
     * 
     * @return The ID of the HIT to extend.
     */

    public String getHITId() {
        return this.hITId;
    }

    /**
     * <p>
     * The ID of the HIT to extend.
     * </p>
     * 
     * @param hITId
     *        The ID of the HIT to extend.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAdditionalAssignmentsForHITRequest withHITId(String hITId) {
        setHITId(hITId);
        return this;
    }

    /**
     * <p>
     * The number of additional assignments to request for this HIT.
     * </p>
     * 
     * @param numberOfAdditionalAssignments
     *        The number of additional assignments to request for this HIT.
     */

    public void setNumberOfAdditionalAssignments(Integer numberOfAdditionalAssignments) {
        this.numberOfAdditionalAssignments = numberOfAdditionalAssignments;
    }

    /**
     * <p>
     * The number of additional assignments to request for this HIT.
     * </p>
     * 
     * @return The number of additional assignments to request for this HIT.
     */

    public Integer getNumberOfAdditionalAssignments() {
        return this.numberOfAdditionalAssignments;
    }

    /**
     * <p>
     * The number of additional assignments to request for this HIT.
     * </p>
     * 
     * @param numberOfAdditionalAssignments
     *        The number of additional assignments to request for this HIT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAdditionalAssignmentsForHITRequest withNumberOfAdditionalAssignments(Integer numberOfAdditionalAssignments) {
        setNumberOfAdditionalAssignments(numberOfAdditionalAssignments);
        return this;
    }

    /**
     * <p>
     * A unique identifier for this request, which allows you to retry the call on error without extending the HIT
     * multiple times. This is useful in cases such as network timeouts where it is unclear whether or not the call
     * succeeded on the server. If the extend HIT already exists in the system from a previous call using the same
     * <code>UniqueRequestToken</code>, subsequent calls will return an error with a message containing the request ID.
     * </p>
     * 
     * @param uniqueRequestToken
     *        A unique identifier for this request, which allows you to retry the call on error without extending the
     *        HIT multiple times. This is useful in cases such as network timeouts where it is unclear whether or not
     *        the call succeeded on the server. If the extend HIT already exists in the system from a previous call
     *        using the same <code>UniqueRequestToken</code>, subsequent calls will return an error with a message
     *        containing the request ID.
     */

    public void setUniqueRequestToken(String uniqueRequestToken) {
        this.uniqueRequestToken = uniqueRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this request, which allows you to retry the call on error without extending the HIT
     * multiple times. This is useful in cases such as network timeouts where it is unclear whether or not the call
     * succeeded on the server. If the extend HIT already exists in the system from a previous call using the same
     * <code>UniqueRequestToken</code>, subsequent calls will return an error with a message containing the request ID.
     * </p>
     * 
     * @return A unique identifier for this request, which allows you to retry the call on error without extending the
     *         HIT multiple times. This is useful in cases such as network timeouts where it is unclear whether or not
     *         the call succeeded on the server. If the extend HIT already exists in the system from a previous call
     *         using the same <code>UniqueRequestToken</code>, subsequent calls will return an error with a message
     *         containing the request ID.
     */

    public String getUniqueRequestToken() {
        return this.uniqueRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this request, which allows you to retry the call on error without extending the HIT
     * multiple times. This is useful in cases such as network timeouts where it is unclear whether or not the call
     * succeeded on the server. If the extend HIT already exists in the system from a previous call using the same
     * <code>UniqueRequestToken</code>, subsequent calls will return an error with a message containing the request ID.
     * </p>
     * 
     * @param uniqueRequestToken
     *        A unique identifier for this request, which allows you to retry the call on error without extending the
     *        HIT multiple times. This is useful in cases such as network timeouts where it is unclear whether or not
     *        the call succeeded on the server. If the extend HIT already exists in the system from a previous call
     *        using the same <code>UniqueRequestToken</code>, subsequent calls will return an error with a message
     *        containing the request ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAdditionalAssignmentsForHITRequest withUniqueRequestToken(String uniqueRequestToken) {
        setUniqueRequestToken(uniqueRequestToken);
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
        if (getHITId() != null)
            sb.append("HITId: ").append(getHITId()).append(",");
        if (getNumberOfAdditionalAssignments() != null)
            sb.append("NumberOfAdditionalAssignments: ").append(getNumberOfAdditionalAssignments()).append(",");
        if (getUniqueRequestToken() != null)
            sb.append("UniqueRequestToken: ").append(getUniqueRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAdditionalAssignmentsForHITRequest == false)
            return false;
        CreateAdditionalAssignmentsForHITRequest other = (CreateAdditionalAssignmentsForHITRequest) obj;
        if (other.getHITId() == null ^ this.getHITId() == null)
            return false;
        if (other.getHITId() != null && other.getHITId().equals(this.getHITId()) == false)
            return false;
        if (other.getNumberOfAdditionalAssignments() == null ^ this.getNumberOfAdditionalAssignments() == null)
            return false;
        if (other.getNumberOfAdditionalAssignments() != null
                && other.getNumberOfAdditionalAssignments().equals(this.getNumberOfAdditionalAssignments()) == false)
            return false;
        if (other.getUniqueRequestToken() == null ^ this.getUniqueRequestToken() == null)
            return false;
        if (other.getUniqueRequestToken() != null && other.getUniqueRequestToken().equals(this.getUniqueRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHITId() == null) ? 0 : getHITId().hashCode());
        hashCode = prime * hashCode + ((getNumberOfAdditionalAssignments() == null) ? 0 : getNumberOfAdditionalAssignments().hashCode());
        hashCode = prime * hashCode + ((getUniqueRequestToken() == null) ? 0 : getUniqueRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateAdditionalAssignmentsForHITRequest clone() {
        return (CreateAdditionalAssignmentsForHITRequest) super.clone();
    }

}
