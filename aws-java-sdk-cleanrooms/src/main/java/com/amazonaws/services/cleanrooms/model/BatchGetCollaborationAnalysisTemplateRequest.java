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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/BatchGetCollaborationAnalysisTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetCollaborationAnalysisTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the collaboration that the analysis templates belong to. Currently accepts collaboration
     * ID.
     * </p>
     */
    private String collaborationIdentifier;
    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the analysis template within a collaboration.
     * </p>
     */
    private java.util.List<String> analysisTemplateArns;

    /**
     * <p>
     * A unique identifier for the collaboration that the analysis templates belong to. Currently accepts collaboration
     * ID.
     * </p>
     * 
     * @param collaborationIdentifier
     *        A unique identifier for the collaboration that the analysis templates belong to. Currently accepts
     *        collaboration ID.
     */

    public void setCollaborationIdentifier(String collaborationIdentifier) {
        this.collaborationIdentifier = collaborationIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the collaboration that the analysis templates belong to. Currently accepts collaboration
     * ID.
     * </p>
     * 
     * @return A unique identifier for the collaboration that the analysis templates belong to. Currently accepts
     *         collaboration ID.
     */

    public String getCollaborationIdentifier() {
        return this.collaborationIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the collaboration that the analysis templates belong to. Currently accepts collaboration
     * ID.
     * </p>
     * 
     * @param collaborationIdentifier
     *        A unique identifier for the collaboration that the analysis templates belong to. Currently accepts
     *        collaboration ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCollaborationAnalysisTemplateRequest withCollaborationIdentifier(String collaborationIdentifier) {
        setCollaborationIdentifier(collaborationIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the analysis template within a collaboration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) associated with the analysis template within a collaboration.
     */

    public java.util.List<String> getAnalysisTemplateArns() {
        return analysisTemplateArns;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the analysis template within a collaboration.
     * </p>
     * 
     * @param analysisTemplateArns
     *        The Amazon Resource Name (ARN) associated with the analysis template within a collaboration.
     */

    public void setAnalysisTemplateArns(java.util.Collection<String> analysisTemplateArns) {
        if (analysisTemplateArns == null) {
            this.analysisTemplateArns = null;
            return;
        }

        this.analysisTemplateArns = new java.util.ArrayList<String>(analysisTemplateArns);
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the analysis template within a collaboration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnalysisTemplateArns(java.util.Collection)} or {@link #withAnalysisTemplateArns(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param analysisTemplateArns
     *        The Amazon Resource Name (ARN) associated with the analysis template within a collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCollaborationAnalysisTemplateRequest withAnalysisTemplateArns(String... analysisTemplateArns) {
        if (this.analysisTemplateArns == null) {
            setAnalysisTemplateArns(new java.util.ArrayList<String>(analysisTemplateArns.length));
        }
        for (String ele : analysisTemplateArns) {
            this.analysisTemplateArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the analysis template within a collaboration.
     * </p>
     * 
     * @param analysisTemplateArns
     *        The Amazon Resource Name (ARN) associated with the analysis template within a collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCollaborationAnalysisTemplateRequest withAnalysisTemplateArns(java.util.Collection<String> analysisTemplateArns) {
        setAnalysisTemplateArns(analysisTemplateArns);
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
        if (getCollaborationIdentifier() != null)
            sb.append("CollaborationIdentifier: ").append(getCollaborationIdentifier()).append(",");
        if (getAnalysisTemplateArns() != null)
            sb.append("AnalysisTemplateArns: ").append(getAnalysisTemplateArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetCollaborationAnalysisTemplateRequest == false)
            return false;
        BatchGetCollaborationAnalysisTemplateRequest other = (BatchGetCollaborationAnalysisTemplateRequest) obj;
        if (other.getCollaborationIdentifier() == null ^ this.getCollaborationIdentifier() == null)
            return false;
        if (other.getCollaborationIdentifier() != null && other.getCollaborationIdentifier().equals(this.getCollaborationIdentifier()) == false)
            return false;
        if (other.getAnalysisTemplateArns() == null ^ this.getAnalysisTemplateArns() == null)
            return false;
        if (other.getAnalysisTemplateArns() != null && other.getAnalysisTemplateArns().equals(this.getAnalysisTemplateArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollaborationIdentifier() == null) ? 0 : getCollaborationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAnalysisTemplateArns() == null) ? 0 : getAnalysisTemplateArns().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetCollaborationAnalysisTemplateRequest clone() {
        return (BatchGetCollaborationAnalysisTemplateRequest) super.clone();
    }

}
