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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UpdateProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Use this parameter if the project will use client-side evaluation powered by AppConfig. Client-side evaluation
     * allows your application to assign variations to user sessions locally instead of by calling the <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html"
     * >EvaluateFeature</a> operation. This mitigates the latency and availability risks that come with an API call.
     * allows you to
     * </p>
     * <p>
     * This parameter is a structure that contains information about the AppConfig application that will be used for
     * client-side evaluation.
     * </p>
     */
    private ProjectAppConfigResourceConfig appConfigResource;
    /**
     * <p>
     * An optional description of the project.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name or ARN of the project to update.
     * </p>
     */
    private String project;

    /**
     * <p>
     * Use this parameter if the project will use client-side evaluation powered by AppConfig. Client-side evaluation
     * allows your application to assign variations to user sessions locally instead of by calling the <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html"
     * >EvaluateFeature</a> operation. This mitigates the latency and availability risks that come with an API call.
     * allows you to
     * </p>
     * <p>
     * This parameter is a structure that contains information about the AppConfig application that will be used for
     * client-side evaluation.
     * </p>
     * 
     * @param appConfigResource
     *        Use this parameter if the project will use client-side evaluation powered by AppConfig. Client-side
     *        evaluation allows your application to assign variations to user sessions locally instead of by calling the
     *        <a href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html">
     *        EvaluateFeature</a> operation. This mitigates the latency and availability risks that come with an API
     *        call. allows you to</p>
     *        <p>
     *        This parameter is a structure that contains information about the AppConfig application that will be used
     *        for client-side evaluation.
     */

    public void setAppConfigResource(ProjectAppConfigResourceConfig appConfigResource) {
        this.appConfigResource = appConfigResource;
    }

    /**
     * <p>
     * Use this parameter if the project will use client-side evaluation powered by AppConfig. Client-side evaluation
     * allows your application to assign variations to user sessions locally instead of by calling the <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html"
     * >EvaluateFeature</a> operation. This mitigates the latency and availability risks that come with an API call.
     * allows you to
     * </p>
     * <p>
     * This parameter is a structure that contains information about the AppConfig application that will be used for
     * client-side evaluation.
     * </p>
     * 
     * @return Use this parameter if the project will use client-side evaluation powered by AppConfig. Client-side
     *         evaluation allows your application to assign variations to user sessions locally instead of by calling
     *         the <a
     *         href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html"
     *         >EvaluateFeature</a> operation. This mitigates the latency and availability risks that come with an API
     *         call. allows you to</p>
     *         <p>
     *         This parameter is a structure that contains information about the AppConfig application that will be used
     *         for client-side evaluation.
     */

    public ProjectAppConfigResourceConfig getAppConfigResource() {
        return this.appConfigResource;
    }

    /**
     * <p>
     * Use this parameter if the project will use client-side evaluation powered by AppConfig. Client-side evaluation
     * allows your application to assign variations to user sessions locally instead of by calling the <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html"
     * >EvaluateFeature</a> operation. This mitigates the latency and availability risks that come with an API call.
     * allows you to
     * </p>
     * <p>
     * This parameter is a structure that contains information about the AppConfig application that will be used for
     * client-side evaluation.
     * </p>
     * 
     * @param appConfigResource
     *        Use this parameter if the project will use client-side evaluation powered by AppConfig. Client-side
     *        evaluation allows your application to assign variations to user sessions locally instead of by calling the
     *        <a href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html">
     *        EvaluateFeature</a> operation. This mitigates the latency and availability risks that come with an API
     *        call. allows you to</p>
     *        <p>
     *        This parameter is a structure that contains information about the AppConfig application that will be used
     *        for client-side evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withAppConfigResource(ProjectAppConfigResourceConfig appConfigResource) {
        setAppConfigResource(appConfigResource);
        return this;
    }

    /**
     * <p>
     * An optional description of the project.
     * </p>
     * 
     * @param description
     *        An optional description of the project.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description of the project.
     * </p>
     * 
     * @return An optional description of the project.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description of the project.
     * </p>
     * 
     * @param description
     *        An optional description of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the project to update.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project to update.
     */

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * <p>
     * The name or ARN of the project to update.
     * </p>
     * 
     * @return The name or ARN of the project to update.
     */

    public String getProject() {
        return this.project;
    }

    /**
     * <p>
     * The name or ARN of the project to update.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withProject(String project) {
        setProject(project);
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
        if (getAppConfigResource() != null)
            sb.append("AppConfigResource: ").append(getAppConfigResource()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getProject() != null)
            sb.append("Project: ").append(getProject());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProjectRequest == false)
            return false;
        UpdateProjectRequest other = (UpdateProjectRequest) obj;
        if (other.getAppConfigResource() == null ^ this.getAppConfigResource() == null)
            return false;
        if (other.getAppConfigResource() != null && other.getAppConfigResource().equals(this.getAppConfigResource()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getProject() == null ^ this.getProject() == null)
            return false;
        if (other.getProject() != null && other.getProject().equals(this.getProject()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppConfigResource() == null) ? 0 : getAppConfigResource().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProjectRequest clone() {
        return (UpdateProjectRequest) super.clone();
    }

}
