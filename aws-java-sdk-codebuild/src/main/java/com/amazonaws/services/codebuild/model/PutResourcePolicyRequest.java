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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/PutResourcePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutResourcePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A JSON-formatted resource policy. For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/project-sharing.html#project-sharing-share">Sharing
     * a Project</a> and <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/report-groups-sharing.html#report-groups-sharing-share"
     * >Sharing a Report Group</a> in the <i>AWS CodeBuild User Guide</i>.
     * </p>
     */
    private String policy;
    /**
     * <p>
     * The ARN of the <code>Project</code> or <code>ReportGroup</code> resource you want to associate with a resource
     * policy.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * A JSON-formatted resource policy. For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/project-sharing.html#project-sharing-share">Sharing
     * a Project</a> and <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/report-groups-sharing.html#report-groups-sharing-share"
     * >Sharing a Report Group</a> in the <i>AWS CodeBuild User Guide</i>.
     * </p>
     * 
     * @param policy
     *        A JSON-formatted resource policy. For more information, see <a
     *        href="https://docs.aws.amazon.com/codebuild/latest/userguide/project-sharing.html#project-sharing-share"
     *        >Sharing a Project</a> and <a href=
     *        "https://docs.aws.amazon.com/codebuild/latest/userguide/report-groups-sharing.html#report-groups-sharing-share"
     *        >Sharing a Report Group</a> in the <i>AWS CodeBuild User Guide</i>.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * A JSON-formatted resource policy. For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/project-sharing.html#project-sharing-share">Sharing
     * a Project</a> and <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/report-groups-sharing.html#report-groups-sharing-share"
     * >Sharing a Report Group</a> in the <i>AWS CodeBuild User Guide</i>.
     * </p>
     * 
     * @return A JSON-formatted resource policy. For more information, see <a
     *         href="https://docs.aws.amazon.com/codebuild/latest/userguide/project-sharing.html#project-sharing-share"
     *         >Sharing a Project</a> and <a href=
     *         "https://docs.aws.amazon.com/codebuild/latest/userguide/report-groups-sharing.html#report-groups-sharing-share"
     *         >Sharing a Report Group</a> in the <i>AWS CodeBuild User Guide</i>.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * A JSON-formatted resource policy. For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/project-sharing.html#project-sharing-share">Sharing
     * a Project</a> and <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/report-groups-sharing.html#report-groups-sharing-share"
     * >Sharing a Report Group</a> in the <i>AWS CodeBuild User Guide</i>.
     * </p>
     * 
     * @param policy
     *        A JSON-formatted resource policy. For more information, see <a
     *        href="https://docs.aws.amazon.com/codebuild/latest/userguide/project-sharing.html#project-sharing-share"
     *        >Sharing a Project</a> and <a href=
     *        "https://docs.aws.amazon.com/codebuild/latest/userguide/report-groups-sharing.html#report-groups-sharing-share"
     *        >Sharing a Report Group</a> in the <i>AWS CodeBuild User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * The ARN of the <code>Project</code> or <code>ReportGroup</code> resource you want to associate with a resource
     * policy.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the <code>Project</code> or <code>ReportGroup</code> resource you want to associate with a
     *        resource policy.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the <code>Project</code> or <code>ReportGroup</code> resource you want to associate with a resource
     * policy.
     * </p>
     * 
     * @return The ARN of the <code>Project</code> or <code>ReportGroup</code> resource you want to associate with a
     *         resource policy.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the <code>Project</code> or <code>ReportGroup</code> resource you want to associate with a resource
     * policy.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the <code>Project</code> or <code>ReportGroup</code> resource you want to associate with a
     *        resource policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutResourcePolicyRequest == false)
            return false;
        PutResourcePolicyRequest other = (PutResourcePolicyRequest) obj;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public PutResourcePolicyRequest clone() {
        return (PutResourcePolicyRequest) super.clone();
    }

}
