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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateAnalysisTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAnalysisTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the analysis template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier for a membership resource.
     * </p>
     */
    private String membershipIdentifier;
    /**
     * <p>
     * The name of the analysis template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The format of the analysis template.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The information in the analysis template. Currently supports <code>text</code>, the query text for the analysis
     * template.
     * </p>
     */
    private AnalysisSource source;
    /**
     * <p>
     * An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     * optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM
     * policies to control access to this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The parameters of the analysis template.
     * </p>
     */
    private java.util.List<AnalysisParameter> analysisParameters;

    /**
     * <p>
     * The description of the analysis template.
     * </p>
     * 
     * @param description
     *        The description of the analysis template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the analysis template.
     * </p>
     * 
     * @return The description of the analysis template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the analysis template.
     * </p>
     * 
     * @param description
     *        The description of the analysis template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnalysisTemplateRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier for a membership resource.
     * </p>
     * 
     * @param membershipIdentifier
     *        The identifier for a membership resource.
     */

    public void setMembershipIdentifier(String membershipIdentifier) {
        this.membershipIdentifier = membershipIdentifier;
    }

    /**
     * <p>
     * The identifier for a membership resource.
     * </p>
     * 
     * @return The identifier for a membership resource.
     */

    public String getMembershipIdentifier() {
        return this.membershipIdentifier;
    }

    /**
     * <p>
     * The identifier for a membership resource.
     * </p>
     * 
     * @param membershipIdentifier
     *        The identifier for a membership resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnalysisTemplateRequest withMembershipIdentifier(String membershipIdentifier) {
        setMembershipIdentifier(membershipIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the analysis template.
     * </p>
     * 
     * @param name
     *        The name of the analysis template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the analysis template.
     * </p>
     * 
     * @return The name of the analysis template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the analysis template.
     * </p>
     * 
     * @param name
     *        The name of the analysis template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnalysisTemplateRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The format of the analysis template.
     * </p>
     * 
     * @param format
     *        The format of the analysis template.
     * @see AnalysisFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the analysis template.
     * </p>
     * 
     * @return The format of the analysis template.
     * @see AnalysisFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the analysis template.
     * </p>
     * 
     * @param format
     *        The format of the analysis template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisFormat
     */

    public CreateAnalysisTemplateRequest withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the analysis template.
     * </p>
     * 
     * @param format
     *        The format of the analysis template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisFormat
     */

    public CreateAnalysisTemplateRequest withFormat(AnalysisFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The information in the analysis template. Currently supports <code>text</code>, the query text for the analysis
     * template.
     * </p>
     * 
     * @param source
     *        The information in the analysis template. Currently supports <code>text</code>, the query text for the
     *        analysis template.
     */

    public void setSource(AnalysisSource source) {
        this.source = source;
    }

    /**
     * <p>
     * The information in the analysis template. Currently supports <code>text</code>, the query text for the analysis
     * template.
     * </p>
     * 
     * @return The information in the analysis template. Currently supports <code>text</code>, the query text for the
     *         analysis template.
     */

    public AnalysisSource getSource() {
        return this.source;
    }

    /**
     * <p>
     * The information in the analysis template. Currently supports <code>text</code>, the query text for the analysis
     * template.
     * </p>
     * 
     * @param source
     *        The information in the analysis template. Currently supports <code>text</code>, the query text for the
     *        analysis template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnalysisTemplateRequest withSource(AnalysisSource source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     * optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM
     * policies to control access to this resource.
     * </p>
     * 
     * @return An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     *         optional value, both of which you define. When you use tagging, you can also use tag-based access control
     *         in IAM policies to control access to this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     * optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM
     * policies to control access to this resource.
     * </p>
     * 
     * @param tags
     *        An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     *        optional value, both of which you define. When you use tagging, you can also use tag-based access control
     *        in IAM policies to control access to this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     * optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM
     * policies to control access to this resource.
     * </p>
     * 
     * @param tags
     *        An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     *        optional value, both of which you define. When you use tagging, you can also use tag-based access control
     *        in IAM policies to control access to this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnalysisTemplateRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateAnalysisTemplateRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnalysisTemplateRequest addTagsEntry(String key, String value) {
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

    public CreateAnalysisTemplateRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The parameters of the analysis template.
     * </p>
     * 
     * @return The parameters of the analysis template.
     */

    public java.util.List<AnalysisParameter> getAnalysisParameters() {
        return analysisParameters;
    }

    /**
     * <p>
     * The parameters of the analysis template.
     * </p>
     * 
     * @param analysisParameters
     *        The parameters of the analysis template.
     */

    public void setAnalysisParameters(java.util.Collection<AnalysisParameter> analysisParameters) {
        if (analysisParameters == null) {
            this.analysisParameters = null;
            return;
        }

        this.analysisParameters = new java.util.ArrayList<AnalysisParameter>(analysisParameters);
    }

    /**
     * <p>
     * The parameters of the analysis template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnalysisParameters(java.util.Collection)} or {@link #withAnalysisParameters(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param analysisParameters
     *        The parameters of the analysis template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnalysisTemplateRequest withAnalysisParameters(AnalysisParameter... analysisParameters) {
        if (this.analysisParameters == null) {
            setAnalysisParameters(new java.util.ArrayList<AnalysisParameter>(analysisParameters.length));
        }
        for (AnalysisParameter ele : analysisParameters) {
            this.analysisParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The parameters of the analysis template.
     * </p>
     * 
     * @param analysisParameters
     *        The parameters of the analysis template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnalysisTemplateRequest withAnalysisParameters(java.util.Collection<AnalysisParameter> analysisParameters) {
        setAnalysisParameters(analysisParameters);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getMembershipIdentifier() != null)
            sb.append("MembershipIdentifier: ").append(getMembershipIdentifier()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append("***Sensitive Data Redacted***").append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getAnalysisParameters() != null)
            sb.append("AnalysisParameters: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAnalysisTemplateRequest == false)
            return false;
        CreateAnalysisTemplateRequest other = (CreateAnalysisTemplateRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getMembershipIdentifier() == null ^ this.getMembershipIdentifier() == null)
            return false;
        if (other.getMembershipIdentifier() != null && other.getMembershipIdentifier().equals(this.getMembershipIdentifier()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getAnalysisParameters() == null ^ this.getAnalysisParameters() == null)
            return false;
        if (other.getAnalysisParameters() != null && other.getAnalysisParameters().equals(this.getAnalysisParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getMembershipIdentifier() == null) ? 0 : getMembershipIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getAnalysisParameters() == null) ? 0 : getAnalysisParameters().hashCode());
        return hashCode;
    }

    @Override
    public CreateAnalysisTemplateRequest clone() {
        return (CreateAnalysisTemplateRequest) super.clone();
    }

}
