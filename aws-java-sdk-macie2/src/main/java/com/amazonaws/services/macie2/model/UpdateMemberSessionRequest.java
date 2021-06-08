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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateMemberSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMemberSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the Amazon Macie resource or account that the request applies to.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Specifies the new status for the account. Valid values are: ENABLED, resume all Amazon Macie activities for the
     * account; and, PAUSED, suspend all Macie activities for the account.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The unique identifier for the Amazon Macie resource or account that the request applies to.
     * </p>
     * 
     * @param id
     *        The unique identifier for the Amazon Macie resource or account that the request applies to.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Macie resource or account that the request applies to.
     * </p>
     * 
     * @return The unique identifier for the Amazon Macie resource or account that the request applies to.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Macie resource or account that the request applies to.
     * </p>
     * 
     * @param id
     *        The unique identifier for the Amazon Macie resource or account that the request applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMemberSessionRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Specifies the new status for the account. Valid values are: ENABLED, resume all Amazon Macie activities for the
     * account; and, PAUSED, suspend all Macie activities for the account.
     * </p>
     * 
     * @param status
     *        Specifies the new status for the account. Valid values are: ENABLED, resume all Amazon Macie activities
     *        for the account; and, PAUSED, suspend all Macie activities for the account.
     * @see MacieStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the new status for the account. Valid values are: ENABLED, resume all Amazon Macie activities for the
     * account; and, PAUSED, suspend all Macie activities for the account.
     * </p>
     * 
     * @return Specifies the new status for the account. Valid values are: ENABLED, resume all Amazon Macie activities
     *         for the account; and, PAUSED, suspend all Macie activities for the account.
     * @see MacieStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies the new status for the account. Valid values are: ENABLED, resume all Amazon Macie activities for the
     * account; and, PAUSED, suspend all Macie activities for the account.
     * </p>
     * 
     * @param status
     *        Specifies the new status for the account. Valid values are: ENABLED, resume all Amazon Macie activities
     *        for the account; and, PAUSED, suspend all Macie activities for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MacieStatus
     */

    public UpdateMemberSessionRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies the new status for the account. Valid values are: ENABLED, resume all Amazon Macie activities for the
     * account; and, PAUSED, suspend all Macie activities for the account.
     * </p>
     * 
     * @param status
     *        Specifies the new status for the account. Valid values are: ENABLED, resume all Amazon Macie activities
     *        for the account; and, PAUSED, suspend all Macie activities for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MacieStatus
     */

    public UpdateMemberSessionRequest withStatus(MacieStatus status) {
        this.status = status.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMemberSessionRequest == false)
            return false;
        UpdateMemberSessionRequest other = (UpdateMemberSessionRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMemberSessionRequest clone() {
        return (UpdateMemberSessionRequest) super.clone();
    }

}
