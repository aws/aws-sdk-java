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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetFindingsFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFindingsFilterResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The action that's performed on findings that meet the filter criteria (findingCriteria). Possible values are:
     * ARCHIVE, suppress (automatically archive) the findings; and, NOOP, don't perform any action on the findings.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the filter.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The custom description of the filter.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The criteria that's used to filter findings.
     * </p>
     */
    private FindingCriteria findingCriteria;
    /**
     * <p>
     * The unique identifier for the filter.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The custom name of the filter.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The position of the filter in the list of saved filters on the Amazon Macie console. This value also determines
     * the order in which the filter is applied to findings, relative to other filters that are also applied to the
     * findings.
     * </p>
     */
    private Integer position;
    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that are associated with the filter.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The action that's performed on findings that meet the filter criteria (findingCriteria). Possible values are:
     * ARCHIVE, suppress (automatically archive) the findings; and, NOOP, don't perform any action on the findings.
     * </p>
     * 
     * @param action
     *        The action that's performed on findings that meet the filter criteria (findingCriteria). Possible values
     *        are: ARCHIVE, suppress (automatically archive) the findings; and, NOOP, don't perform any action on the
     *        findings.
     * @see FindingsFilterAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action that's performed on findings that meet the filter criteria (findingCriteria). Possible values are:
     * ARCHIVE, suppress (automatically archive) the findings; and, NOOP, don't perform any action on the findings.
     * </p>
     * 
     * @return The action that's performed on findings that meet the filter criteria (findingCriteria). Possible values
     *         are: ARCHIVE, suppress (automatically archive) the findings; and, NOOP, don't perform any action on the
     *         findings.
     * @see FindingsFilterAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action that's performed on findings that meet the filter criteria (findingCriteria). Possible values are:
     * ARCHIVE, suppress (automatically archive) the findings; and, NOOP, don't perform any action on the findings.
     * </p>
     * 
     * @param action
     *        The action that's performed on findings that meet the filter criteria (findingCriteria). Possible values
     *        are: ARCHIVE, suppress (automatically archive) the findings; and, NOOP, don't perform any action on the
     *        findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingsFilterAction
     */

    public GetFindingsFilterResult withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action that's performed on findings that meet the filter criteria (findingCriteria). Possible values are:
     * ARCHIVE, suppress (automatically archive) the findings; and, NOOP, don't perform any action on the findings.
     * </p>
     * 
     * @param action
     *        The action that's performed on findings that meet the filter criteria (findingCriteria). Possible values
     *        are: ARCHIVE, suppress (automatically archive) the findings; and, NOOP, don't perform any action on the
     *        findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingsFilterAction
     */

    public GetFindingsFilterResult withAction(FindingsFilterAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the filter.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the filter.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the filter.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the filter.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the filter.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsFilterResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The custom description of the filter.
     * </p>
     * 
     * @param description
     *        The custom description of the filter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The custom description of the filter.
     * </p>
     * 
     * @return The custom description of the filter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The custom description of the filter.
     * </p>
     * 
     * @param description
     *        The custom description of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsFilterResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The criteria that's used to filter findings.
     * </p>
     * 
     * @param findingCriteria
     *        The criteria that's used to filter findings.
     */

    public void setFindingCriteria(FindingCriteria findingCriteria) {
        this.findingCriteria = findingCriteria;
    }

    /**
     * <p>
     * The criteria that's used to filter findings.
     * </p>
     * 
     * @return The criteria that's used to filter findings.
     */

    public FindingCriteria getFindingCriteria() {
        return this.findingCriteria;
    }

    /**
     * <p>
     * The criteria that's used to filter findings.
     * </p>
     * 
     * @param findingCriteria
     *        The criteria that's used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsFilterResult withFindingCriteria(FindingCriteria findingCriteria) {
        setFindingCriteria(findingCriteria);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the filter.
     * </p>
     * 
     * @param id
     *        The unique identifier for the filter.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the filter.
     * </p>
     * 
     * @return The unique identifier for the filter.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the filter.
     * </p>
     * 
     * @param id
     *        The unique identifier for the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsFilterResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The custom name of the filter.
     * </p>
     * 
     * @param name
     *        The custom name of the filter.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The custom name of the filter.
     * </p>
     * 
     * @return The custom name of the filter.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The custom name of the filter.
     * </p>
     * 
     * @param name
     *        The custom name of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsFilterResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The position of the filter in the list of saved filters on the Amazon Macie console. This value also determines
     * the order in which the filter is applied to findings, relative to other filters that are also applied to the
     * findings.
     * </p>
     * 
     * @param position
     *        The position of the filter in the list of saved filters on the Amazon Macie console. This value also
     *        determines the order in which the filter is applied to findings, relative to other filters that are also
     *        applied to the findings.
     */

    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * <p>
     * The position of the filter in the list of saved filters on the Amazon Macie console. This value also determines
     * the order in which the filter is applied to findings, relative to other filters that are also applied to the
     * findings.
     * </p>
     * 
     * @return The position of the filter in the list of saved filters on the Amazon Macie console. This value also
     *         determines the order in which the filter is applied to findings, relative to other filters that are also
     *         applied to the findings.
     */

    public Integer getPosition() {
        return this.position;
    }

    /**
     * <p>
     * The position of the filter in the list of saved filters on the Amazon Macie console. This value also determines
     * the order in which the filter is applied to findings, relative to other filters that are also applied to the
     * findings.
     * </p>
     * 
     * @param position
     *        The position of the filter in the list of saved filters on the Amazon Macie console. This value also
     *        determines the order in which the filter is applied to findings, relative to other filters that are also
     *        applied to the findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsFilterResult withPosition(Integer position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that are associated with the filter.
     * </p>
     * 
     * @return A map of key-value pairs that identifies the tags (keys and values) that are associated with the filter.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that are associated with the filter.
     * </p>
     * 
     * @param tags
     *        A map of key-value pairs that identifies the tags (keys and values) that are associated with the filter.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that are associated with the filter.
     * </p>
     * 
     * @param tags
     *        A map of key-value pairs that identifies the tags (keys and values) that are associated with the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsFilterResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetFindingsFilterResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsFilterResult addTagsEntry(String key, String value) {
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

    public GetFindingsFilterResult clearTagsEntries() {
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFindingCriteria() != null)
            sb.append("FindingCriteria: ").append(getFindingCriteria()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFindingsFilterResult == false)
            return false;
        GetFindingsFilterResult other = (GetFindingsFilterResult) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFindingCriteria() == null ^ this.getFindingCriteria() == null)
            return false;
        if (other.getFindingCriteria() != null && other.getFindingCriteria().equals(this.getFindingCriteria()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
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

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFindingCriteria() == null) ? 0 : getFindingCriteria().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetFindingsFilterResult clone() {
        try {
            return (GetFindingsFilterResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
