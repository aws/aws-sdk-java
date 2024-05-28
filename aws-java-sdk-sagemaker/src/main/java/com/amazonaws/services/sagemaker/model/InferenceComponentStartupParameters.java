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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Settings that take effect while the model container starts up.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/InferenceComponentStartupParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceComponentStartupParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timeout value, in seconds, to download and extract the model that you want to host from Amazon S3 to the
     * individual inference instance associated with this inference component.
     * </p>
     */
    private Integer modelDataDownloadTimeoutInSeconds;
    /**
     * <p>
     * The timeout value, in seconds, for your inference container to pass health check by Amazon S3 Hosting. For more
     * information about health check, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests"
     * >How Your Container Should Respond to Health Check (Ping) Requests</a>.
     * </p>
     */
    private Integer containerStartupHealthCheckTimeoutInSeconds;

    /**
     * <p>
     * The timeout value, in seconds, to download and extract the model that you want to host from Amazon S3 to the
     * individual inference instance associated with this inference component.
     * </p>
     * 
     * @param modelDataDownloadTimeoutInSeconds
     *        The timeout value, in seconds, to download and extract the model that you want to host from Amazon S3 to
     *        the individual inference instance associated with this inference component.
     */

    public void setModelDataDownloadTimeoutInSeconds(Integer modelDataDownloadTimeoutInSeconds) {
        this.modelDataDownloadTimeoutInSeconds = modelDataDownloadTimeoutInSeconds;
    }

    /**
     * <p>
     * The timeout value, in seconds, to download and extract the model that you want to host from Amazon S3 to the
     * individual inference instance associated with this inference component.
     * </p>
     * 
     * @return The timeout value, in seconds, to download and extract the model that you want to host from Amazon S3 to
     *         the individual inference instance associated with this inference component.
     */

    public Integer getModelDataDownloadTimeoutInSeconds() {
        return this.modelDataDownloadTimeoutInSeconds;
    }

    /**
     * <p>
     * The timeout value, in seconds, to download and extract the model that you want to host from Amazon S3 to the
     * individual inference instance associated with this inference component.
     * </p>
     * 
     * @param modelDataDownloadTimeoutInSeconds
     *        The timeout value, in seconds, to download and extract the model that you want to host from Amazon S3 to
     *        the individual inference instance associated with this inference component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceComponentStartupParameters withModelDataDownloadTimeoutInSeconds(Integer modelDataDownloadTimeoutInSeconds) {
        setModelDataDownloadTimeoutInSeconds(modelDataDownloadTimeoutInSeconds);
        return this;
    }

    /**
     * <p>
     * The timeout value, in seconds, for your inference container to pass health check by Amazon S3 Hosting. For more
     * information about health check, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests"
     * >How Your Container Should Respond to Health Check (Ping) Requests</a>.
     * </p>
     * 
     * @param containerStartupHealthCheckTimeoutInSeconds
     *        The timeout value, in seconds, for your inference container to pass health check by Amazon S3 Hosting. For
     *        more information about health check, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests"
     *        >How Your Container Should Respond to Health Check (Ping) Requests</a>.
     */

    public void setContainerStartupHealthCheckTimeoutInSeconds(Integer containerStartupHealthCheckTimeoutInSeconds) {
        this.containerStartupHealthCheckTimeoutInSeconds = containerStartupHealthCheckTimeoutInSeconds;
    }

    /**
     * <p>
     * The timeout value, in seconds, for your inference container to pass health check by Amazon S3 Hosting. For more
     * information about health check, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests"
     * >How Your Container Should Respond to Health Check (Ping) Requests</a>.
     * </p>
     * 
     * @return The timeout value, in seconds, for your inference container to pass health check by Amazon S3 Hosting.
     *         For more information about health check, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests"
     *         >How Your Container Should Respond to Health Check (Ping) Requests</a>.
     */

    public Integer getContainerStartupHealthCheckTimeoutInSeconds() {
        return this.containerStartupHealthCheckTimeoutInSeconds;
    }

    /**
     * <p>
     * The timeout value, in seconds, for your inference container to pass health check by Amazon S3 Hosting. For more
     * information about health check, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests"
     * >How Your Container Should Respond to Health Check (Ping) Requests</a>.
     * </p>
     * 
     * @param containerStartupHealthCheckTimeoutInSeconds
     *        The timeout value, in seconds, for your inference container to pass health check by Amazon S3 Hosting. For
     *        more information about health check, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests"
     *        >How Your Container Should Respond to Health Check (Ping) Requests</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceComponentStartupParameters withContainerStartupHealthCheckTimeoutInSeconds(Integer containerStartupHealthCheckTimeoutInSeconds) {
        setContainerStartupHealthCheckTimeoutInSeconds(containerStartupHealthCheckTimeoutInSeconds);
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
        if (getModelDataDownloadTimeoutInSeconds() != null)
            sb.append("ModelDataDownloadTimeoutInSeconds: ").append(getModelDataDownloadTimeoutInSeconds()).append(",");
        if (getContainerStartupHealthCheckTimeoutInSeconds() != null)
            sb.append("ContainerStartupHealthCheckTimeoutInSeconds: ").append(getContainerStartupHealthCheckTimeoutInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferenceComponentStartupParameters == false)
            return false;
        InferenceComponentStartupParameters other = (InferenceComponentStartupParameters) obj;
        if (other.getModelDataDownloadTimeoutInSeconds() == null ^ this.getModelDataDownloadTimeoutInSeconds() == null)
            return false;
        if (other.getModelDataDownloadTimeoutInSeconds() != null
                && other.getModelDataDownloadTimeoutInSeconds().equals(this.getModelDataDownloadTimeoutInSeconds()) == false)
            return false;
        if (other.getContainerStartupHealthCheckTimeoutInSeconds() == null ^ this.getContainerStartupHealthCheckTimeoutInSeconds() == null)
            return false;
        if (other.getContainerStartupHealthCheckTimeoutInSeconds() != null
                && other.getContainerStartupHealthCheckTimeoutInSeconds().equals(this.getContainerStartupHealthCheckTimeoutInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelDataDownloadTimeoutInSeconds() == null) ? 0 : getModelDataDownloadTimeoutInSeconds().hashCode());
        hashCode = prime * hashCode
                + ((getContainerStartupHealthCheckTimeoutInSeconds() == null) ? 0 : getContainerStartupHealthCheckTimeoutInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public InferenceComponentStartupParameters clone() {
        try {
            return (InferenceComponentStartupParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.InferenceComponentStartupParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
