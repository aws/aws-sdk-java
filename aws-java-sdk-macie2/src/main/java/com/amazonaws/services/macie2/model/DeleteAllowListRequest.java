/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DeleteAllowList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAllowListRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the Amazon Macie resource that the request applies to.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Specifies whether to force deletion of the allow list, even if active classification jobs are configured to use
     * the list.
     * </p>
     * <p>
     * When you try to delete an allow list, Amazon Macie checks for classification jobs that use the list and have a
     * status other than COMPLETE or CANCELLED. By default, Macie rejects your request if any jobs meet these criteria.
     * To skip these checks and delete the list, set this value to true. To delete the list only if no active jobs are
     * configured to use it, set this value to false.
     * </p>
     */
    private String ignoreJobChecks;

    /**
     * <p>
     * The unique identifier for the Amazon Macie resource that the request applies to.
     * </p>
     * 
     * @param id
     *        The unique identifier for the Amazon Macie resource that the request applies to.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Macie resource that the request applies to.
     * </p>
     * 
     * @return The unique identifier for the Amazon Macie resource that the request applies to.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Macie resource that the request applies to.
     * </p>
     * 
     * @param id
     *        The unique identifier for the Amazon Macie resource that the request applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAllowListRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Specifies whether to force deletion of the allow list, even if active classification jobs are configured to use
     * the list.
     * </p>
     * <p>
     * When you try to delete an allow list, Amazon Macie checks for classification jobs that use the list and have a
     * status other than COMPLETE or CANCELLED. By default, Macie rejects your request if any jobs meet these criteria.
     * To skip these checks and delete the list, set this value to true. To delete the list only if no active jobs are
     * configured to use it, set this value to false.
     * </p>
     * 
     * @param ignoreJobChecks
     *        Specifies whether to force deletion of the allow list, even if active classification jobs are configured
     *        to use the list.</p>
     *        <p>
     *        When you try to delete an allow list, Amazon Macie checks for classification jobs that use the list and
     *        have a status other than COMPLETE or CANCELLED. By default, Macie rejects your request if any jobs meet
     *        these criteria. To skip these checks and delete the list, set this value to true. To delete the list only
     *        if no active jobs are configured to use it, set this value to false.
     */

    public void setIgnoreJobChecks(String ignoreJobChecks) {
        this.ignoreJobChecks = ignoreJobChecks;
    }

    /**
     * <p>
     * Specifies whether to force deletion of the allow list, even if active classification jobs are configured to use
     * the list.
     * </p>
     * <p>
     * When you try to delete an allow list, Amazon Macie checks for classification jobs that use the list and have a
     * status other than COMPLETE or CANCELLED. By default, Macie rejects your request if any jobs meet these criteria.
     * To skip these checks and delete the list, set this value to true. To delete the list only if no active jobs are
     * configured to use it, set this value to false.
     * </p>
     * 
     * @return Specifies whether to force deletion of the allow list, even if active classification jobs are configured
     *         to use the list.</p>
     *         <p>
     *         When you try to delete an allow list, Amazon Macie checks for classification jobs that use the list and
     *         have a status other than COMPLETE or CANCELLED. By default, Macie rejects your request if any jobs meet
     *         these criteria. To skip these checks and delete the list, set this value to true. To delete the list only
     *         if no active jobs are configured to use it, set this value to false.
     */

    public String getIgnoreJobChecks() {
        return this.ignoreJobChecks;
    }

    /**
     * <p>
     * Specifies whether to force deletion of the allow list, even if active classification jobs are configured to use
     * the list.
     * </p>
     * <p>
     * When you try to delete an allow list, Amazon Macie checks for classification jobs that use the list and have a
     * status other than COMPLETE or CANCELLED. By default, Macie rejects your request if any jobs meet these criteria.
     * To skip these checks and delete the list, set this value to true. To delete the list only if no active jobs are
     * configured to use it, set this value to false.
     * </p>
     * 
     * @param ignoreJobChecks
     *        Specifies whether to force deletion of the allow list, even if active classification jobs are configured
     *        to use the list.</p>
     *        <p>
     *        When you try to delete an allow list, Amazon Macie checks for classification jobs that use the list and
     *        have a status other than COMPLETE or CANCELLED. By default, Macie rejects your request if any jobs meet
     *        these criteria. To skip these checks and delete the list, set this value to true. To delete the list only
     *        if no active jobs are configured to use it, set this value to false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAllowListRequest withIgnoreJobChecks(String ignoreJobChecks) {
        setIgnoreJobChecks(ignoreJobChecks);
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
        if (getIgnoreJobChecks() != null)
            sb.append("IgnoreJobChecks: ").append(getIgnoreJobChecks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAllowListRequest == false)
            return false;
        DeleteAllowListRequest other = (DeleteAllowListRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIgnoreJobChecks() == null ^ this.getIgnoreJobChecks() == null)
            return false;
        if (other.getIgnoreJobChecks() != null && other.getIgnoreJobChecks().equals(this.getIgnoreJobChecks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIgnoreJobChecks() == null) ? 0 : getIgnoreJobChecks().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAllowListRequest clone() {
        return (DeleteAllowListRequest) super.clone();
    }

}
