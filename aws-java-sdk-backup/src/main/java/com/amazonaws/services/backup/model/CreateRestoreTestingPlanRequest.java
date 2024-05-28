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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateRestoreTestingPlan" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRestoreTestingPlanRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This is a unique string that identifies the request and allows failed requests to be retriedwithout the risk of
     * running the operation twice. This parameter is optional. If used, this parameter must contain 1 to 50
     * alphanumeric or '-_.' characters.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * A restore testing plan must contain a unique <code>RestoreTestingPlanName</code> string you create and must
     * contain a <code>ScheduleExpression</code> cron. You may optionally include a <code>StartWindowHours</code>
     * integer and a <code>CreatorRequestId</code> string.
     * </p>
     * <p>
     * The <code>RestoreTestingPlanName</code> is a unique string that is the name of the restore testing plan. This
     * cannot be changed after creation, and it must consist of only alphanumeric characters and underscores.
     * </p>
     */
    private RestoreTestingPlanForCreate restoreTestingPlan;
    /**
     * <p>
     * Optional tags to include. A tag is a key-value pair you can use to manage, filter, and search for your resources.
     * Allowed characters include UTF-8 letters,numbers, spaces, and the following characters: + - = . _ : /.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * This is a unique string that identifies the request and allows failed requests to be retriedwithout the risk of
     * running the operation twice. This parameter is optional. If used, this parameter must contain 1 to 50
     * alphanumeric or '-_.' characters.
     * </p>
     * 
     * @param creatorRequestId
     *        This is a unique string that identifies the request and allows failed requests to be retriedwithout the
     *        risk of running the operation twice. This parameter is optional. If used, this parameter must contain 1 to
     *        50 alphanumeric or '-_.' characters.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * This is a unique string that identifies the request and allows failed requests to be retriedwithout the risk of
     * running the operation twice. This parameter is optional. If used, this parameter must contain 1 to 50
     * alphanumeric or '-_.' characters.
     * </p>
     * 
     * @return This is a unique string that identifies the request and allows failed requests to be retriedwithout the
     *         risk of running the operation twice. This parameter is optional. If used, this parameter must contain 1
     *         to 50 alphanumeric or '-_.' characters.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * This is a unique string that identifies the request and allows failed requests to be retriedwithout the risk of
     * running the operation twice. This parameter is optional. If used, this parameter must contain 1 to 50
     * alphanumeric or '-_.' characters.
     * </p>
     * 
     * @param creatorRequestId
     *        This is a unique string that identifies the request and allows failed requests to be retriedwithout the
     *        risk of running the operation twice. This parameter is optional. If used, this parameter must contain 1 to
     *        50 alphanumeric or '-_.' characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestoreTestingPlanRequest withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * A restore testing plan must contain a unique <code>RestoreTestingPlanName</code> string you create and must
     * contain a <code>ScheduleExpression</code> cron. You may optionally include a <code>StartWindowHours</code>
     * integer and a <code>CreatorRequestId</code> string.
     * </p>
     * <p>
     * The <code>RestoreTestingPlanName</code> is a unique string that is the name of the restore testing plan. This
     * cannot be changed after creation, and it must consist of only alphanumeric characters and underscores.
     * </p>
     * 
     * @param restoreTestingPlan
     *        A restore testing plan must contain a unique <code>RestoreTestingPlanName</code> string you create and
     *        must contain a <code>ScheduleExpression</code> cron. You may optionally include a
     *        <code>StartWindowHours</code> integer and a <code>CreatorRequestId</code> string.</p>
     *        <p>
     *        The <code>RestoreTestingPlanName</code> is a unique string that is the name of the restore testing plan.
     *        This cannot be changed after creation, and it must consist of only alphanumeric characters and
     *        underscores.
     */

    public void setRestoreTestingPlan(RestoreTestingPlanForCreate restoreTestingPlan) {
        this.restoreTestingPlan = restoreTestingPlan;
    }

    /**
     * <p>
     * A restore testing plan must contain a unique <code>RestoreTestingPlanName</code> string you create and must
     * contain a <code>ScheduleExpression</code> cron. You may optionally include a <code>StartWindowHours</code>
     * integer and a <code>CreatorRequestId</code> string.
     * </p>
     * <p>
     * The <code>RestoreTestingPlanName</code> is a unique string that is the name of the restore testing plan. This
     * cannot be changed after creation, and it must consist of only alphanumeric characters and underscores.
     * </p>
     * 
     * @return A restore testing plan must contain a unique <code>RestoreTestingPlanName</code> string you create and
     *         must contain a <code>ScheduleExpression</code> cron. You may optionally include a
     *         <code>StartWindowHours</code> integer and a <code>CreatorRequestId</code> string.</p>
     *         <p>
     *         The <code>RestoreTestingPlanName</code> is a unique string that is the name of the restore testing plan.
     *         This cannot be changed after creation, and it must consist of only alphanumeric characters and
     *         underscores.
     */

    public RestoreTestingPlanForCreate getRestoreTestingPlan() {
        return this.restoreTestingPlan;
    }

    /**
     * <p>
     * A restore testing plan must contain a unique <code>RestoreTestingPlanName</code> string you create and must
     * contain a <code>ScheduleExpression</code> cron. You may optionally include a <code>StartWindowHours</code>
     * integer and a <code>CreatorRequestId</code> string.
     * </p>
     * <p>
     * The <code>RestoreTestingPlanName</code> is a unique string that is the name of the restore testing plan. This
     * cannot be changed after creation, and it must consist of only alphanumeric characters and underscores.
     * </p>
     * 
     * @param restoreTestingPlan
     *        A restore testing plan must contain a unique <code>RestoreTestingPlanName</code> string you create and
     *        must contain a <code>ScheduleExpression</code> cron. You may optionally include a
     *        <code>StartWindowHours</code> integer and a <code>CreatorRequestId</code> string.</p>
     *        <p>
     *        The <code>RestoreTestingPlanName</code> is a unique string that is the name of the restore testing plan.
     *        This cannot be changed after creation, and it must consist of only alphanumeric characters and
     *        underscores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestoreTestingPlanRequest withRestoreTestingPlan(RestoreTestingPlanForCreate restoreTestingPlan) {
        setRestoreTestingPlan(restoreTestingPlan);
        return this;
    }

    /**
     * <p>
     * Optional tags to include. A tag is a key-value pair you can use to manage, filter, and search for your resources.
     * Allowed characters include UTF-8 letters,numbers, spaces, and the following characters: + - = . _ : /.
     * </p>
     * 
     * @return Optional tags to include. A tag is a key-value pair you can use to manage, filter, and search for your
     *         resources. Allowed characters include UTF-8 letters,numbers, spaces, and the following characters: + - =
     *         . _ : /.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Optional tags to include. A tag is a key-value pair you can use to manage, filter, and search for your resources.
     * Allowed characters include UTF-8 letters,numbers, spaces, and the following characters: + - = . _ : /.
     * </p>
     * 
     * @param tags
     *        Optional tags to include. A tag is a key-value pair you can use to manage, filter, and search for your
     *        resources. Allowed characters include UTF-8 letters,numbers, spaces, and the following characters: + - = .
     *        _ : /.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Optional tags to include. A tag is a key-value pair you can use to manage, filter, and search for your resources.
     * Allowed characters include UTF-8 letters,numbers, spaces, and the following characters: + - = . _ : /.
     * </p>
     * 
     * @param tags
     *        Optional tags to include. A tag is a key-value pair you can use to manage, filter, and search for your
     *        resources. Allowed characters include UTF-8 letters,numbers, spaces, and the following characters: + - = .
     *        _ : /.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestoreTestingPlanRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateRestoreTestingPlanRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestoreTestingPlanRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestoreTestingPlanRequest clearTagsEntries() {
        this.tags = null;
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
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
        if (getRestoreTestingPlan() != null)
            sb.append("RestoreTestingPlan: ").append(getRestoreTestingPlan()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRestoreTestingPlanRequest == false)
            return false;
        CreateRestoreTestingPlanRequest other = (CreateRestoreTestingPlanRequest) obj;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getRestoreTestingPlan() == null ^ this.getRestoreTestingPlan() == null)
            return false;
        if (other.getRestoreTestingPlan() != null && other.getRestoreTestingPlan().equals(this.getRestoreTestingPlan()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getRestoreTestingPlan() == null) ? 0 : getRestoreTestingPlan().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateRestoreTestingPlanRequest clone() {
        return (CreateRestoreTestingPlanRequest) super.clone();
    }

}
