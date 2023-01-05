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
package com.amazonaws.services.oam.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/UpdateLink" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLinkResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the link that you have updated.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The random ID string that Amazon Web Services generated as part of the sink ARN.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The label assigned to this link, with the variables resolved to their actual values.
     * </p>
     */
    private String label;
    /**
     * <p>
     * The exact label template that was specified when the link was created, with the template variables not resolved.
     * </p>
     */
    private String labelTemplate;
    /**
     * <p>
     * The resource types now supported by this link.
     * </p>
     */
    private java.util.List<String> resourceTypes;
    /**
     * <p>
     * The ARN of the sink that is used for this link.
     * </p>
     */
    private String sinkArn;
    /**
     * <p>
     * The tags assigned to the link.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ARN of the link that you have updated.
     * </p>
     * 
     * @param arn
     *        The ARN of the link that you have updated.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the link that you have updated.
     * </p>
     * 
     * @return The ARN of the link that you have updated.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the link that you have updated.
     * </p>
     * 
     * @param arn
     *        The ARN of the link that you have updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLinkResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The random ID string that Amazon Web Services generated as part of the sink ARN.
     * </p>
     * 
     * @param id
     *        The random ID string that Amazon Web Services generated as part of the sink ARN.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The random ID string that Amazon Web Services generated as part of the sink ARN.
     * </p>
     * 
     * @return The random ID string that Amazon Web Services generated as part of the sink ARN.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The random ID string that Amazon Web Services generated as part of the sink ARN.
     * </p>
     * 
     * @param id
     *        The random ID string that Amazon Web Services generated as part of the sink ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLinkResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The label assigned to this link, with the variables resolved to their actual values.
     * </p>
     * 
     * @param label
     *        The label assigned to this link, with the variables resolved to their actual values.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The label assigned to this link, with the variables resolved to their actual values.
     * </p>
     * 
     * @return The label assigned to this link, with the variables resolved to their actual values.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * The label assigned to this link, with the variables resolved to their actual values.
     * </p>
     * 
     * @param label
     *        The label assigned to this link, with the variables resolved to their actual values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLinkResult withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * The exact label template that was specified when the link was created, with the template variables not resolved.
     * </p>
     * 
     * @param labelTemplate
     *        The exact label template that was specified when the link was created, with the template variables not
     *        resolved.
     */

    public void setLabelTemplate(String labelTemplate) {
        this.labelTemplate = labelTemplate;
    }

    /**
     * <p>
     * The exact label template that was specified when the link was created, with the template variables not resolved.
     * </p>
     * 
     * @return The exact label template that was specified when the link was created, with the template variables not
     *         resolved.
     */

    public String getLabelTemplate() {
        return this.labelTemplate;
    }

    /**
     * <p>
     * The exact label template that was specified when the link was created, with the template variables not resolved.
     * </p>
     * 
     * @param labelTemplate
     *        The exact label template that was specified when the link was created, with the template variables not
     *        resolved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLinkResult withLabelTemplate(String labelTemplate) {
        setLabelTemplate(labelTemplate);
        return this;
    }

    /**
     * <p>
     * The resource types now supported by this link.
     * </p>
     * 
     * @return The resource types now supported by this link.
     */

    public java.util.List<String> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * <p>
     * The resource types now supported by this link.
     * </p>
     * 
     * @param resourceTypes
     *        The resource types now supported by this link.
     */

    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new java.util.ArrayList<String>(resourceTypes);
    }

    /**
     * <p>
     * The resource types now supported by this link.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        The resource types now supported by this link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLinkResult withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new java.util.ArrayList<String>(resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource types now supported by this link.
     * </p>
     * 
     * @param resourceTypes
     *        The resource types now supported by this link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLinkResult withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * The ARN of the sink that is used for this link.
     * </p>
     * 
     * @param sinkArn
     *        The ARN of the sink that is used for this link.
     */

    public void setSinkArn(String sinkArn) {
        this.sinkArn = sinkArn;
    }

    /**
     * <p>
     * The ARN of the sink that is used for this link.
     * </p>
     * 
     * @return The ARN of the sink that is used for this link.
     */

    public String getSinkArn() {
        return this.sinkArn;
    }

    /**
     * <p>
     * The ARN of the sink that is used for this link.
     * </p>
     * 
     * @param sinkArn
     *        The ARN of the sink that is used for this link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLinkResult withSinkArn(String sinkArn) {
        setSinkArn(sinkArn);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the link.
     * </p>
     * 
     * @return The tags assigned to the link.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the link.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the link.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the link.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLinkResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see UpdateLinkResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLinkResult addTagsEntry(String key, String value) {
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

    public UpdateLinkResult clearTagsEntries() {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getLabelTemplate() != null)
            sb.append("LabelTemplate: ").append(getLabelTemplate()).append(",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: ").append(getResourceTypes()).append(",");
        if (getSinkArn() != null)
            sb.append("SinkArn: ").append(getSinkArn()).append(",");
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

        if (obj instanceof UpdateLinkResult == false)
            return false;
        UpdateLinkResult other = (UpdateLinkResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getLabelTemplate() == null ^ this.getLabelTemplate() == null)
            return false;
        if (other.getLabelTemplate() != null && other.getLabelTemplate().equals(this.getLabelTemplate()) == false)
            return false;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        if (other.getSinkArn() == null ^ this.getSinkArn() == null)
            return false;
        if (other.getSinkArn() != null && other.getSinkArn().equals(this.getSinkArn()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getLabelTemplate() == null) ? 0 : getLabelTemplate().hashCode());
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getSinkArn() == null) ? 0 : getSinkArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLinkResult clone() {
        try {
            return (UpdateLinkResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
