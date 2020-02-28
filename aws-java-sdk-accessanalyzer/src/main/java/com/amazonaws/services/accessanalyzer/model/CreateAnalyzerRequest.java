/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an analyzer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/CreateAnalyzer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAnalyzerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the analyzer to create.
     * </p>
     */
    private String analyzerName;
    /**
     * <p>
     * Specifies the archive rules to add for the analyzer. Archive rules automatically archive findings that meet the
     * criteria you define for the rule.
     * </p>
     */
    private java.util.List<InlineArchiveRule> archiveRules;
    /**
     * <p>
     * A client token.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The tags to apply to the analyzer.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The type of analyzer to create. Only ACCOUNT analyzers are supported. You can create only one analyzer per
     * account per Region.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The name of the analyzer to create.
     * </p>
     * 
     * @param analyzerName
     *        The name of the analyzer to create.
     */

    public void setAnalyzerName(String analyzerName) {
        this.analyzerName = analyzerName;
    }

    /**
     * <p>
     * The name of the analyzer to create.
     * </p>
     * 
     * @return The name of the analyzer to create.
     */

    public String getAnalyzerName() {
        return this.analyzerName;
    }

    /**
     * <p>
     * The name of the analyzer to create.
     * </p>
     * 
     * @param analyzerName
     *        The name of the analyzer to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnalyzerRequest withAnalyzerName(String analyzerName) {
        setAnalyzerName(analyzerName);
        return this;
    }

    /**
     * <p>
     * Specifies the archive rules to add for the analyzer. Archive rules automatically archive findings that meet the
     * criteria you define for the rule.
     * </p>
     * 
     * @return Specifies the archive rules to add for the analyzer. Archive rules automatically archive findings that
     *         meet the criteria you define for the rule.
     */

    public java.util.List<InlineArchiveRule> getArchiveRules() {
        return archiveRules;
    }

    /**
     * <p>
     * Specifies the archive rules to add for the analyzer. Archive rules automatically archive findings that meet the
     * criteria you define for the rule.
     * </p>
     * 
     * @param archiveRules
     *        Specifies the archive rules to add for the analyzer. Archive rules automatically archive findings that
     *        meet the criteria you define for the rule.
     */

    public void setArchiveRules(java.util.Collection<InlineArchiveRule> archiveRules) {
        if (archiveRules == null) {
            this.archiveRules = null;
            return;
        }

        this.archiveRules = new java.util.ArrayList<InlineArchiveRule>(archiveRules);
    }

    /**
     * <p>
     * Specifies the archive rules to add for the analyzer. Archive rules automatically archive findings that meet the
     * criteria you define for the rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArchiveRules(java.util.Collection)} or {@link #withArchiveRules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param archiveRules
     *        Specifies the archive rules to add for the analyzer. Archive rules automatically archive findings that
     *        meet the criteria you define for the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnalyzerRequest withArchiveRules(InlineArchiveRule... archiveRules) {
        if (this.archiveRules == null) {
            setArchiveRules(new java.util.ArrayList<InlineArchiveRule>(archiveRules.length));
        }
        for (InlineArchiveRule ele : archiveRules) {
            this.archiveRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the archive rules to add for the analyzer. Archive rules automatically archive findings that meet the
     * criteria you define for the rule.
     * </p>
     * 
     * @param archiveRules
     *        Specifies the archive rules to add for the analyzer. Archive rules automatically archive findings that
     *        meet the criteria you define for the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnalyzerRequest withArchiveRules(java.util.Collection<InlineArchiveRule> archiveRules) {
        setArchiveRules(archiveRules);
        return this;
    }

    /**
     * <p>
     * A client token.
     * </p>
     * 
     * @param clientToken
     *        A client token.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A client token.
     * </p>
     * 
     * @return A client token.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A client token.
     * </p>
     * 
     * @param clientToken
     *        A client token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnalyzerRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the analyzer.
     * </p>
     * 
     * @return The tags to apply to the analyzer.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to apply to the analyzer.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the analyzer.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to apply to the analyzer.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the analyzer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnalyzerRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateAnalyzerRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnalyzerRequest addTagsEntry(String key, String value) {
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

    public CreateAnalyzerRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The type of analyzer to create. Only ACCOUNT analyzers are supported. You can create only one analyzer per
     * account per Region.
     * </p>
     * 
     * @param type
     *        The type of analyzer to create. Only ACCOUNT analyzers are supported. You can create only one analyzer per
     *        account per Region.
     * @see Type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of analyzer to create. Only ACCOUNT analyzers are supported. You can create only one analyzer per
     * account per Region.
     * </p>
     * 
     * @return The type of analyzer to create. Only ACCOUNT analyzers are supported. You can create only one analyzer
     *         per account per Region.
     * @see Type
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of analyzer to create. Only ACCOUNT analyzers are supported. You can create only one analyzer per
     * account per Region.
     * </p>
     * 
     * @param type
     *        The type of analyzer to create. Only ACCOUNT analyzers are supported. You can create only one analyzer per
     *        account per Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public CreateAnalyzerRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of analyzer to create. Only ACCOUNT analyzers are supported. You can create only one analyzer per
     * account per Region.
     * </p>
     * 
     * @param type
     *        The type of analyzer to create. Only ACCOUNT analyzers are supported. You can create only one analyzer per
     *        account per Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public CreateAnalyzerRequest withType(Type type) {
        this.type = type.toString();
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
        if (getAnalyzerName() != null)
            sb.append("AnalyzerName: ").append(getAnalyzerName()).append(",");
        if (getArchiveRules() != null)
            sb.append("ArchiveRules: ").append(getArchiveRules()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAnalyzerRequest == false)
            return false;
        CreateAnalyzerRequest other = (CreateAnalyzerRequest) obj;
        if (other.getAnalyzerName() == null ^ this.getAnalyzerName() == null)
            return false;
        if (other.getAnalyzerName() != null && other.getAnalyzerName().equals(this.getAnalyzerName()) == false)
            return false;
        if (other.getArchiveRules() == null ^ this.getArchiveRules() == null)
            return false;
        if (other.getArchiveRules() != null && other.getArchiveRules().equals(this.getArchiveRules()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalyzerName() == null) ? 0 : getAnalyzerName().hashCode());
        hashCode = prime * hashCode + ((getArchiveRules() == null) ? 0 : getArchiveRules().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public CreateAnalyzerRequest clone() {
        return (CreateAnalyzerRequest) super.clone();
    }

}
