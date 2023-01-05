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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateAllowList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAllowListRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The criteria that specify the text or text pattern to ignore. The criteria can be the location and name of an S3
     * object that lists specific text to ignore (s3WordsList), or a regular expression that defines a text pattern to
     * ignore (regex).
     * </p>
     * <p>
     * You can change a list's underlying criteria, such as the name of the S3 object or the regular expression to use.
     * However, you can't change the type from s3WordsList to regex or the other way around.
     * </p>
     */
    private AllowListCriteria criteria;
    /**
     * <p>
     * A custom description of the allow list. The description can contain as many as 512 characters.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier for the Amazon Macie resource that the request applies to.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A custom name for the allow list. The name can contain as many as 128 characters.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The criteria that specify the text or text pattern to ignore. The criteria can be the location and name of an S3
     * object that lists specific text to ignore (s3WordsList), or a regular expression that defines a text pattern to
     * ignore (regex).
     * </p>
     * <p>
     * You can change a list's underlying criteria, such as the name of the S3 object or the regular expression to use.
     * However, you can't change the type from s3WordsList to regex or the other way around.
     * </p>
     * 
     * @param criteria
     *        The criteria that specify the text or text pattern to ignore. The criteria can be the location and name of
     *        an S3 object that lists specific text to ignore (s3WordsList), or a regular expression that defines a text
     *        pattern to ignore (regex).</p>
     *        <p>
     *        You can change a list's underlying criteria, such as the name of the S3 object or the regular expression
     *        to use. However, you can't change the type from s3WordsList to regex or the other way around.
     */

    public void setCriteria(AllowListCriteria criteria) {
        this.criteria = criteria;
    }

    /**
     * <p>
     * The criteria that specify the text or text pattern to ignore. The criteria can be the location and name of an S3
     * object that lists specific text to ignore (s3WordsList), or a regular expression that defines a text pattern to
     * ignore (regex).
     * </p>
     * <p>
     * You can change a list's underlying criteria, such as the name of the S3 object or the regular expression to use.
     * However, you can't change the type from s3WordsList to regex or the other way around.
     * </p>
     * 
     * @return The criteria that specify the text or text pattern to ignore. The criteria can be the location and name
     *         of an S3 object that lists specific text to ignore (s3WordsList), or a regular expression that defines a
     *         text pattern to ignore (regex).</p>
     *         <p>
     *         You can change a list's underlying criteria, such as the name of the S3 object or the regular expression
     *         to use. However, you can't change the type from s3WordsList to regex or the other way around.
     */

    public AllowListCriteria getCriteria() {
        return this.criteria;
    }

    /**
     * <p>
     * The criteria that specify the text or text pattern to ignore. The criteria can be the location and name of an S3
     * object that lists specific text to ignore (s3WordsList), or a regular expression that defines a text pattern to
     * ignore (regex).
     * </p>
     * <p>
     * You can change a list's underlying criteria, such as the name of the S3 object or the regular expression to use.
     * However, you can't change the type from s3WordsList to regex or the other way around.
     * </p>
     * 
     * @param criteria
     *        The criteria that specify the text or text pattern to ignore. The criteria can be the location and name of
     *        an S3 object that lists specific text to ignore (s3WordsList), or a regular expression that defines a text
     *        pattern to ignore (regex).</p>
     *        <p>
     *        You can change a list's underlying criteria, such as the name of the S3 object or the regular expression
     *        to use. However, you can't change the type from s3WordsList to regex or the other way around.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAllowListRequest withCriteria(AllowListCriteria criteria) {
        setCriteria(criteria);
        return this;
    }

    /**
     * <p>
     * A custom description of the allow list. The description can contain as many as 512 characters.
     * </p>
     * 
     * @param description
     *        A custom description of the allow list. The description can contain as many as 512 characters.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A custom description of the allow list. The description can contain as many as 512 characters.
     * </p>
     * 
     * @return A custom description of the allow list. The description can contain as many as 512 characters.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A custom description of the allow list. The description can contain as many as 512 characters.
     * </p>
     * 
     * @param description
     *        A custom description of the allow list. The description can contain as many as 512 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAllowListRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

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

    public UpdateAllowListRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A custom name for the allow list. The name can contain as many as 128 characters.
     * </p>
     * 
     * @param name
     *        A custom name for the allow list. The name can contain as many as 128 characters.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A custom name for the allow list. The name can contain as many as 128 characters.
     * </p>
     * 
     * @return A custom name for the allow list. The name can contain as many as 128 characters.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A custom name for the allow list. The name can contain as many as 128 characters.
     * </p>
     * 
     * @param name
     *        A custom name for the allow list. The name can contain as many as 128 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAllowListRequest withName(String name) {
        setName(name);
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
        if (getCriteria() != null)
            sb.append("Criteria: ").append(getCriteria()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAllowListRequest == false)
            return false;
        UpdateAllowListRequest other = (UpdateAllowListRequest) obj;
        if (other.getCriteria() == null ^ this.getCriteria() == null)
            return false;
        if (other.getCriteria() != null && other.getCriteria().equals(this.getCriteria()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCriteria() == null) ? 0 : getCriteria().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAllowListRequest clone() {
        return (UpdateAllowListRequest) super.clone();
    }

}
