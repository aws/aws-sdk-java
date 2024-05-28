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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A type of trigger configuration for Git-based source actions.
 * </p>
 * <note>
 * <p>
 * You can specify the Git configuration trigger type for all third-party Git-based source actions that are supported by
 * the <code>CodeStarSourceConnection</code> action type.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/GitConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GitConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the pipeline source action where the trigger configuration, such as Git tags, is specified. The
     * trigger configuration will start the pipeline upon the specified change only.
     * </p>
     * <note>
     * <p>
     * You can only specify one trigger configuration per source action.
     * </p>
     * </note>
     */
    private String sourceActionName;
    /**
     * <p>
     * The field where the repository event that will start the pipeline, such as pushing Git tags, is specified with
     * details.
     * </p>
     */
    private java.util.List<GitPushFilter> push;
    /**
     * <p>
     * The field where the repository event that will start the pipeline is specified as pull requests.
     * </p>
     */
    private java.util.List<GitPullRequestFilter> pullRequest;

    /**
     * <p>
     * The name of the pipeline source action where the trigger configuration, such as Git tags, is specified. The
     * trigger configuration will start the pipeline upon the specified change only.
     * </p>
     * <note>
     * <p>
     * You can only specify one trigger configuration per source action.
     * </p>
     * </note>
     * 
     * @param sourceActionName
     *        The name of the pipeline source action where the trigger configuration, such as Git tags, is specified.
     *        The trigger configuration will start the pipeline upon the specified change only.</p> <note>
     *        <p>
     *        You can only specify one trigger configuration per source action.
     *        </p>
     */

    public void setSourceActionName(String sourceActionName) {
        this.sourceActionName = sourceActionName;
    }

    /**
     * <p>
     * The name of the pipeline source action where the trigger configuration, such as Git tags, is specified. The
     * trigger configuration will start the pipeline upon the specified change only.
     * </p>
     * <note>
     * <p>
     * You can only specify one trigger configuration per source action.
     * </p>
     * </note>
     * 
     * @return The name of the pipeline source action where the trigger configuration, such as Git tags, is specified.
     *         The trigger configuration will start the pipeline upon the specified change only.</p> <note>
     *         <p>
     *         You can only specify one trigger configuration per source action.
     *         </p>
     */

    public String getSourceActionName() {
        return this.sourceActionName;
    }

    /**
     * <p>
     * The name of the pipeline source action where the trigger configuration, such as Git tags, is specified. The
     * trigger configuration will start the pipeline upon the specified change only.
     * </p>
     * <note>
     * <p>
     * You can only specify one trigger configuration per source action.
     * </p>
     * </note>
     * 
     * @param sourceActionName
     *        The name of the pipeline source action where the trigger configuration, such as Git tags, is specified.
     *        The trigger configuration will start the pipeline upon the specified change only.</p> <note>
     *        <p>
     *        You can only specify one trigger configuration per source action.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitConfiguration withSourceActionName(String sourceActionName) {
        setSourceActionName(sourceActionName);
        return this;
    }

    /**
     * <p>
     * The field where the repository event that will start the pipeline, such as pushing Git tags, is specified with
     * details.
     * </p>
     * 
     * @return The field where the repository event that will start the pipeline, such as pushing Git tags, is specified
     *         with details.
     */

    public java.util.List<GitPushFilter> getPush() {
        return push;
    }

    /**
     * <p>
     * The field where the repository event that will start the pipeline, such as pushing Git tags, is specified with
     * details.
     * </p>
     * 
     * @param push
     *        The field where the repository event that will start the pipeline, such as pushing Git tags, is specified
     *        with details.
     */

    public void setPush(java.util.Collection<GitPushFilter> push) {
        if (push == null) {
            this.push = null;
            return;
        }

        this.push = new java.util.ArrayList<GitPushFilter>(push);
    }

    /**
     * <p>
     * The field where the repository event that will start the pipeline, such as pushing Git tags, is specified with
     * details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPush(java.util.Collection)} or {@link #withPush(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param push
     *        The field where the repository event that will start the pipeline, such as pushing Git tags, is specified
     *        with details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitConfiguration withPush(GitPushFilter... push) {
        if (this.push == null) {
            setPush(new java.util.ArrayList<GitPushFilter>(push.length));
        }
        for (GitPushFilter ele : push) {
            this.push.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The field where the repository event that will start the pipeline, such as pushing Git tags, is specified with
     * details.
     * </p>
     * 
     * @param push
     *        The field where the repository event that will start the pipeline, such as pushing Git tags, is specified
     *        with details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitConfiguration withPush(java.util.Collection<GitPushFilter> push) {
        setPush(push);
        return this;
    }

    /**
     * <p>
     * The field where the repository event that will start the pipeline is specified as pull requests.
     * </p>
     * 
     * @return The field where the repository event that will start the pipeline is specified as pull requests.
     */

    public java.util.List<GitPullRequestFilter> getPullRequest() {
        return pullRequest;
    }

    /**
     * <p>
     * The field where the repository event that will start the pipeline is specified as pull requests.
     * </p>
     * 
     * @param pullRequest
     *        The field where the repository event that will start the pipeline is specified as pull requests.
     */

    public void setPullRequest(java.util.Collection<GitPullRequestFilter> pullRequest) {
        if (pullRequest == null) {
            this.pullRequest = null;
            return;
        }

        this.pullRequest = new java.util.ArrayList<GitPullRequestFilter>(pullRequest);
    }

    /**
     * <p>
     * The field where the repository event that will start the pipeline is specified as pull requests.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPullRequest(java.util.Collection)} or {@link #withPullRequest(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param pullRequest
     *        The field where the repository event that will start the pipeline is specified as pull requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitConfiguration withPullRequest(GitPullRequestFilter... pullRequest) {
        if (this.pullRequest == null) {
            setPullRequest(new java.util.ArrayList<GitPullRequestFilter>(pullRequest.length));
        }
        for (GitPullRequestFilter ele : pullRequest) {
            this.pullRequest.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The field where the repository event that will start the pipeline is specified as pull requests.
     * </p>
     * 
     * @param pullRequest
     *        The field where the repository event that will start the pipeline is specified as pull requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitConfiguration withPullRequest(java.util.Collection<GitPullRequestFilter> pullRequest) {
        setPullRequest(pullRequest);
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
        if (getSourceActionName() != null)
            sb.append("SourceActionName: ").append(getSourceActionName()).append(",");
        if (getPush() != null)
            sb.append("Push: ").append(getPush()).append(",");
        if (getPullRequest() != null)
            sb.append("PullRequest: ").append(getPullRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GitConfiguration == false)
            return false;
        GitConfiguration other = (GitConfiguration) obj;
        if (other.getSourceActionName() == null ^ this.getSourceActionName() == null)
            return false;
        if (other.getSourceActionName() != null && other.getSourceActionName().equals(this.getSourceActionName()) == false)
            return false;
        if (other.getPush() == null ^ this.getPush() == null)
            return false;
        if (other.getPush() != null && other.getPush().equals(this.getPush()) == false)
            return false;
        if (other.getPullRequest() == null ^ this.getPullRequest() == null)
            return false;
        if (other.getPullRequest() != null && other.getPullRequest().equals(this.getPullRequest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceActionName() == null) ? 0 : getSourceActionName().hashCode());
        hashCode = prime * hashCode + ((getPush() == null) ? 0 : getPush().hashCode());
        hashCode = prime * hashCode + ((getPullRequest() == null) ? 0 : getPullRequest().hashCode());
        return hashCode;
    }

    @Override
    public GitConfiguration clone() {
        try {
            return (GitConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.GitConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
