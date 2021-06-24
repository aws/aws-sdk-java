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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information that defines how the CodeBuild build project reports the build status to the source provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BuildStatusConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BuildStatusConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the context of the build status CodeBuild sends to the source provider. The usage of this parameter
     * depends on the source provider.
     * </p>
     * <dl>
     * <dt>Bitbucket</dt>
     * <dd>
     * <p>
     * This parameter is used for the <code>name</code> parameter in the Bitbucket commit status. For more information,
     * see <a href=
     * "https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D/%7Brepo_slug%7D/commit/%7Bnode%7D/statuses/build"
     * >build</a> in the Bitbucket API documentation.
     * </p>
     * </dd>
     * <dt>GitHub/GitHub Enterprise Server</dt>
     * <dd>
     * <p>
     * This parameter is used for the <code>context</code> parameter in the GitHub commit status. For more information,
     * see <a href="https://developer.github.com/v3/repos/statuses/#create-a-commit-status">Create a commit status</a>
     * in the GitHub developer guide.
     * </p>
     * </dd>
     * </dl>
     */
    private String context;
    /**
     * <p>
     * Specifies the target url of the build status CodeBuild sends to the source provider. The usage of this parameter
     * depends on the source provider.
     * </p>
     * <dl>
     * <dt>Bitbucket</dt>
     * <dd>
     * <p>
     * This parameter is used for the <code>url</code> parameter in the Bitbucket commit status. For more information,
     * see <a href=
     * "https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D/%7Brepo_slug%7D/commit/%7Bnode%7D/statuses/build"
     * >build</a> in the Bitbucket API documentation.
     * </p>
     * </dd>
     * <dt>GitHub/GitHub Enterprise Server</dt>
     * <dd>
     * <p>
     * This parameter is used for the <code>target_url</code> parameter in the GitHub commit status. For more
     * information, see <a href="https://developer.github.com/v3/repos/statuses/#create-a-commit-status">Create a commit
     * status</a> in the GitHub developer guide.
     * </p>
     * </dd>
     * </dl>
     */
    private String targetUrl;

    /**
     * <p>
     * Specifies the context of the build status CodeBuild sends to the source provider. The usage of this parameter
     * depends on the source provider.
     * </p>
     * <dl>
     * <dt>Bitbucket</dt>
     * <dd>
     * <p>
     * This parameter is used for the <code>name</code> parameter in the Bitbucket commit status. For more information,
     * see <a href=
     * "https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D/%7Brepo_slug%7D/commit/%7Bnode%7D/statuses/build"
     * >build</a> in the Bitbucket API documentation.
     * </p>
     * </dd>
     * <dt>GitHub/GitHub Enterprise Server</dt>
     * <dd>
     * <p>
     * This parameter is used for the <code>context</code> parameter in the GitHub commit status. For more information,
     * see <a href="https://developer.github.com/v3/repos/statuses/#create-a-commit-status">Create a commit status</a>
     * in the GitHub developer guide.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param context
     *        Specifies the context of the build status CodeBuild sends to the source provider. The usage of this
     *        parameter depends on the source provider.</p>
     *        <dl>
     *        <dt>Bitbucket</dt>
     *        <dd>
     *        <p>
     *        This parameter is used for the <code>name</code> parameter in the Bitbucket commit status. For more
     *        information, see <a href=
     *        "https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D/%7Brepo_slug%7D/commit/%7Bnode%7D/statuses/build"
     *        >build</a> in the Bitbucket API documentation.
     *        </p>
     *        </dd>
     *        <dt>GitHub/GitHub Enterprise Server</dt>
     *        <dd>
     *        <p>
     *        This parameter is used for the <code>context</code> parameter in the GitHub commit status. For more
     *        information, see <a href="https://developer.github.com/v3/repos/statuses/#create-a-commit-status">Create a
     *        commit status</a> in the GitHub developer guide.
     *        </p>
     *        </dd>
     */

    public void setContext(String context) {
        this.context = context;
    }

    /**
     * <p>
     * Specifies the context of the build status CodeBuild sends to the source provider. The usage of this parameter
     * depends on the source provider.
     * </p>
     * <dl>
     * <dt>Bitbucket</dt>
     * <dd>
     * <p>
     * This parameter is used for the <code>name</code> parameter in the Bitbucket commit status. For more information,
     * see <a href=
     * "https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D/%7Brepo_slug%7D/commit/%7Bnode%7D/statuses/build"
     * >build</a> in the Bitbucket API documentation.
     * </p>
     * </dd>
     * <dt>GitHub/GitHub Enterprise Server</dt>
     * <dd>
     * <p>
     * This parameter is used for the <code>context</code> parameter in the GitHub commit status. For more information,
     * see <a href="https://developer.github.com/v3/repos/statuses/#create-a-commit-status">Create a commit status</a>
     * in the GitHub developer guide.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return Specifies the context of the build status CodeBuild sends to the source provider. The usage of this
     *         parameter depends on the source provider.</p>
     *         <dl>
     *         <dt>Bitbucket</dt>
     *         <dd>
     *         <p>
     *         This parameter is used for the <code>name</code> parameter in the Bitbucket commit status. For more
     *         information, see <a href=
     *         "https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D/%7Brepo_slug%7D/commit/%7Bnode%7D/statuses/build"
     *         >build</a> in the Bitbucket API documentation.
     *         </p>
     *         </dd>
     *         <dt>GitHub/GitHub Enterprise Server</dt>
     *         <dd>
     *         <p>
     *         This parameter is used for the <code>context</code> parameter in the GitHub commit status. For more
     *         information, see <a href="https://developer.github.com/v3/repos/statuses/#create-a-commit-status">Create
     *         a commit status</a> in the GitHub developer guide.
     *         </p>
     *         </dd>
     */

    public String getContext() {
        return this.context;
    }

    /**
     * <p>
     * Specifies the context of the build status CodeBuild sends to the source provider. The usage of this parameter
     * depends on the source provider.
     * </p>
     * <dl>
     * <dt>Bitbucket</dt>
     * <dd>
     * <p>
     * This parameter is used for the <code>name</code> parameter in the Bitbucket commit status. For more information,
     * see <a href=
     * "https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D/%7Brepo_slug%7D/commit/%7Bnode%7D/statuses/build"
     * >build</a> in the Bitbucket API documentation.
     * </p>
     * </dd>
     * <dt>GitHub/GitHub Enterprise Server</dt>
     * <dd>
     * <p>
     * This parameter is used for the <code>context</code> parameter in the GitHub commit status. For more information,
     * see <a href="https://developer.github.com/v3/repos/statuses/#create-a-commit-status">Create a commit status</a>
     * in the GitHub developer guide.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param context
     *        Specifies the context of the build status CodeBuild sends to the source provider. The usage of this
     *        parameter depends on the source provider.</p>
     *        <dl>
     *        <dt>Bitbucket</dt>
     *        <dd>
     *        <p>
     *        This parameter is used for the <code>name</code> parameter in the Bitbucket commit status. For more
     *        information, see <a href=
     *        "https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D/%7Brepo_slug%7D/commit/%7Bnode%7D/statuses/build"
     *        >build</a> in the Bitbucket API documentation.
     *        </p>
     *        </dd>
     *        <dt>GitHub/GitHub Enterprise Server</dt>
     *        <dd>
     *        <p>
     *        This parameter is used for the <code>context</code> parameter in the GitHub commit status. For more
     *        information, see <a href="https://developer.github.com/v3/repos/statuses/#create-a-commit-status">Create a
     *        commit status</a> in the GitHub developer guide.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildStatusConfig withContext(String context) {
        setContext(context);
        return this;
    }

    /**
     * <p>
     * Specifies the target url of the build status CodeBuild sends to the source provider. The usage of this parameter
     * depends on the source provider.
     * </p>
     * <dl>
     * <dt>Bitbucket</dt>
     * <dd>
     * <p>
     * This parameter is used for the <code>url</code> parameter in the Bitbucket commit status. For more information,
     * see <a href=
     * "https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D/%7Brepo_slug%7D/commit/%7Bnode%7D/statuses/build"
     * >build</a> in the Bitbucket API documentation.
     * </p>
     * </dd>
     * <dt>GitHub/GitHub Enterprise Server</dt>
     * <dd>
     * <p>
     * This parameter is used for the <code>target_url</code> parameter in the GitHub commit status. For more
     * information, see <a href="https://developer.github.com/v3/repos/statuses/#create-a-commit-status">Create a commit
     * status</a> in the GitHub developer guide.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param targetUrl
     *        Specifies the target url of the build status CodeBuild sends to the source provider. The usage of this
     *        parameter depends on the source provider.</p>
     *        <dl>
     *        <dt>Bitbucket</dt>
     *        <dd>
     *        <p>
     *        This parameter is used for the <code>url</code> parameter in the Bitbucket commit status. For more
     *        information, see <a href=
     *        "https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D/%7Brepo_slug%7D/commit/%7Bnode%7D/statuses/build"
     *        >build</a> in the Bitbucket API documentation.
     *        </p>
     *        </dd>
     *        <dt>GitHub/GitHub Enterprise Server</dt>
     *        <dd>
     *        <p>
     *        This parameter is used for the <code>target_url</code> parameter in the GitHub commit status. For more
     *        information, see <a href="https://developer.github.com/v3/repos/statuses/#create-a-commit-status">Create a
     *        commit status</a> in the GitHub developer guide.
     *        </p>
     *        </dd>
     */

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    /**
     * <p>
     * Specifies the target url of the build status CodeBuild sends to the source provider. The usage of this parameter
     * depends on the source provider.
     * </p>
     * <dl>
     * <dt>Bitbucket</dt>
     * <dd>
     * <p>
     * This parameter is used for the <code>url</code> parameter in the Bitbucket commit status. For more information,
     * see <a href=
     * "https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D/%7Brepo_slug%7D/commit/%7Bnode%7D/statuses/build"
     * >build</a> in the Bitbucket API documentation.
     * </p>
     * </dd>
     * <dt>GitHub/GitHub Enterprise Server</dt>
     * <dd>
     * <p>
     * This parameter is used for the <code>target_url</code> parameter in the GitHub commit status. For more
     * information, see <a href="https://developer.github.com/v3/repos/statuses/#create-a-commit-status">Create a commit
     * status</a> in the GitHub developer guide.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return Specifies the target url of the build status CodeBuild sends to the source provider. The usage of this
     *         parameter depends on the source provider.</p>
     *         <dl>
     *         <dt>Bitbucket</dt>
     *         <dd>
     *         <p>
     *         This parameter is used for the <code>url</code> parameter in the Bitbucket commit status. For more
     *         information, see <a href=
     *         "https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D/%7Brepo_slug%7D/commit/%7Bnode%7D/statuses/build"
     *         >build</a> in the Bitbucket API documentation.
     *         </p>
     *         </dd>
     *         <dt>GitHub/GitHub Enterprise Server</dt>
     *         <dd>
     *         <p>
     *         This parameter is used for the <code>target_url</code> parameter in the GitHub commit status. For more
     *         information, see <a href="https://developer.github.com/v3/repos/statuses/#create-a-commit-status">Create
     *         a commit status</a> in the GitHub developer guide.
     *         </p>
     *         </dd>
     */

    public String getTargetUrl() {
        return this.targetUrl;
    }

    /**
     * <p>
     * Specifies the target url of the build status CodeBuild sends to the source provider. The usage of this parameter
     * depends on the source provider.
     * </p>
     * <dl>
     * <dt>Bitbucket</dt>
     * <dd>
     * <p>
     * This parameter is used for the <code>url</code> parameter in the Bitbucket commit status. For more information,
     * see <a href=
     * "https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D/%7Brepo_slug%7D/commit/%7Bnode%7D/statuses/build"
     * >build</a> in the Bitbucket API documentation.
     * </p>
     * </dd>
     * <dt>GitHub/GitHub Enterprise Server</dt>
     * <dd>
     * <p>
     * This parameter is used for the <code>target_url</code> parameter in the GitHub commit status. For more
     * information, see <a href="https://developer.github.com/v3/repos/statuses/#create-a-commit-status">Create a commit
     * status</a> in the GitHub developer guide.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param targetUrl
     *        Specifies the target url of the build status CodeBuild sends to the source provider. The usage of this
     *        parameter depends on the source provider.</p>
     *        <dl>
     *        <dt>Bitbucket</dt>
     *        <dd>
     *        <p>
     *        This parameter is used for the <code>url</code> parameter in the Bitbucket commit status. For more
     *        information, see <a href=
     *        "https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D/%7Brepo_slug%7D/commit/%7Bnode%7D/statuses/build"
     *        >build</a> in the Bitbucket API documentation.
     *        </p>
     *        </dd>
     *        <dt>GitHub/GitHub Enterprise Server</dt>
     *        <dd>
     *        <p>
     *        This parameter is used for the <code>target_url</code> parameter in the GitHub commit status. For more
     *        information, see <a href="https://developer.github.com/v3/repos/statuses/#create-a-commit-status">Create a
     *        commit status</a> in the GitHub developer guide.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildStatusConfig withTargetUrl(String targetUrl) {
        setTargetUrl(targetUrl);
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
        if (getContext() != null)
            sb.append("Context: ").append(getContext()).append(",");
        if (getTargetUrl() != null)
            sb.append("TargetUrl: ").append(getTargetUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BuildStatusConfig == false)
            return false;
        BuildStatusConfig other = (BuildStatusConfig) obj;
        if (other.getContext() == null ^ this.getContext() == null)
            return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false)
            return false;
        if (other.getTargetUrl() == null ^ this.getTargetUrl() == null)
            return false;
        if (other.getTargetUrl() != null && other.getTargetUrl().equals(this.getTargetUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        hashCode = prime * hashCode + ((getTargetUrl() == null) ? 0 : getTargetUrl().hashCode());
        return hashCode;
    }

    @Override
    public BuildStatusConfig clone() {
        try {
            return (BuildStatusConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.BuildStatusConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
