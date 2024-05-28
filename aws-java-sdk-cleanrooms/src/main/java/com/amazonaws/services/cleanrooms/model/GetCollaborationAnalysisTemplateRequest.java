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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetCollaborationAnalysisTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCollaborationAnalysisTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
    private String analysisTemplateArn;

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

    public GetCollaborationAnalysisTemplateRequest withCollaborationIdentifier(String collaborationIdentifier) {
        setCollaborationIdentifier(collaborationIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the analysis template within a collaboration.
     * </p>
     * 
     * @param analysisTemplateArn
     *        The Amazon Resource Name (ARN) associated with the analysis template within a collaboration.
     */

    public void setAnalysisTemplateArn(String analysisTemplateArn) {
        this.analysisTemplateArn = analysisTemplateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the analysis template within a collaboration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) associated with the analysis template within a collaboration.
     */

    public String getAnalysisTemplateArn() {
        return this.analysisTemplateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the analysis template within a collaboration.
     * </p>
     * 
     * @param analysisTemplateArn
     *        The Amazon Resource Name (ARN) associated with the analysis template within a collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCollaborationAnalysisTemplateRequest withAnalysisTemplateArn(String analysisTemplateArn) {
        setAnalysisTemplateArn(analysisTemplateArn);
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
        if (getAnalysisTemplateArn() != null)
            sb.append("AnalysisTemplateArn: ").append(getAnalysisTemplateArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCollaborationAnalysisTemplateRequest == false)
            return false;
        GetCollaborationAnalysisTemplateRequest other = (GetCollaborationAnalysisTemplateRequest) obj;
        if (other.getCollaborationIdentifier() == null ^ this.getCollaborationIdentifier() == null)
            return false;
        if (other.getCollaborationIdentifier() != null && other.getCollaborationIdentifier().equals(this.getCollaborationIdentifier()) == false)
            return false;
        if (other.getAnalysisTemplateArn() == null ^ this.getAnalysisTemplateArn() == null)
            return false;
        if (other.getAnalysisTemplateArn() != null && other.getAnalysisTemplateArn().equals(this.getAnalysisTemplateArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollaborationIdentifier() == null) ? 0 : getCollaborationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAnalysisTemplateArn() == null) ? 0 : getAnalysisTemplateArn().hashCode());
        return hashCode;
    }

    @Override
    public GetCollaborationAnalysisTemplateRequest clone() {
        return (GetCollaborationAnalysisTemplateRequest) super.clone();
    }

}
