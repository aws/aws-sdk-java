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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/StartModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the project that contains the model that you want to start.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * The version of the model that you want to start.
     * </p>
     */
    private String modelVersion;
    /**
     * <p>
     * The minimum number of inference units to use. A single inference unit represents 1 hour of processing and can
     * support up to 5 Transaction Pers Second (TPS). Use a higher number to increase the TPS throughput of your model.
     * You are charged for the number of inference units that you use.
     * </p>
     */
    private Integer minInferenceUnits;
    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>StartModel</code> completes only once. You
     * choose the value to pass. For example, An issue, such as an network outage, might prevent you from getting a
     * response from <code>StartModel</code>. In this case, safely retry your call to <code>StartModel</code> by using
     * the same <code>ClientToken</code> parameter value. An error occurs if the other input parameters are not the same
     * as in the first request. Using a different value for <code>ClientToken</code> is considered a new call to
     * <code>StartModel</code>. An idempotency token is active for 8 hours.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the project that contains the model that you want to start.
     * </p>
     * 
     * @param projectName
     *        The name of the project that contains the model that you want to start.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project that contains the model that you want to start.
     * </p>
     * 
     * @return The name of the project that contains the model that you want to start.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project that contains the model that you want to start.
     * </p>
     * 
     * @param projectName
     *        The name of the project that contains the model that you want to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartModelRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * The version of the model that you want to start.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model that you want to start.
     */

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The version of the model that you want to start.
     * </p>
     * 
     * @return The version of the model that you want to start.
     */

    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * <p>
     * The version of the model that you want to start.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model that you want to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartModelRequest withModelVersion(String modelVersion) {
        setModelVersion(modelVersion);
        return this;
    }

    /**
     * <p>
     * The minimum number of inference units to use. A single inference unit represents 1 hour of processing and can
     * support up to 5 Transaction Pers Second (TPS). Use a higher number to increase the TPS throughput of your model.
     * You are charged for the number of inference units that you use.
     * </p>
     * 
     * @param minInferenceUnits
     *        The minimum number of inference units to use. A single inference unit represents 1 hour of processing and
     *        can support up to 5 Transaction Pers Second (TPS). Use a higher number to increase the TPS throughput of
     *        your model. You are charged for the number of inference units that you use.
     */

    public void setMinInferenceUnits(Integer minInferenceUnits) {
        this.minInferenceUnits = minInferenceUnits;
    }

    /**
     * <p>
     * The minimum number of inference units to use. A single inference unit represents 1 hour of processing and can
     * support up to 5 Transaction Pers Second (TPS). Use a higher number to increase the TPS throughput of your model.
     * You are charged for the number of inference units that you use.
     * </p>
     * 
     * @return The minimum number of inference units to use. A single inference unit represents 1 hour of processing and
     *         can support up to 5 Transaction Pers Second (TPS). Use a higher number to increase the TPS throughput of
     *         your model. You are charged for the number of inference units that you use.
     */

    public Integer getMinInferenceUnits() {
        return this.minInferenceUnits;
    }

    /**
     * <p>
     * The minimum number of inference units to use. A single inference unit represents 1 hour of processing and can
     * support up to 5 Transaction Pers Second (TPS). Use a higher number to increase the TPS throughput of your model.
     * You are charged for the number of inference units that you use.
     * </p>
     * 
     * @param minInferenceUnits
     *        The minimum number of inference units to use. A single inference unit represents 1 hour of processing and
     *        can support up to 5 Transaction Pers Second (TPS). Use a higher number to increase the TPS throughput of
     *        your model. You are charged for the number of inference units that you use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartModelRequest withMinInferenceUnits(Integer minInferenceUnits) {
        setMinInferenceUnits(minInferenceUnits);
        return this;
    }

    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>StartModel</code> completes only once. You
     * choose the value to pass. For example, An issue, such as an network outage, might prevent you from getting a
     * response from <code>StartModel</code>. In this case, safely retry your call to <code>StartModel</code> by using
     * the same <code>ClientToken</code> parameter value. An error occurs if the other input parameters are not the same
     * as in the first request. Using a different value for <code>ClientToken</code> is considered a new call to
     * <code>StartModel</code>. An idempotency token is active for 8 hours.
     * </p>
     * 
     * @param clientToken
     *        ClientToken is an idempotency token that ensures a call to <code>StartModel</code> completes only once.
     *        You choose the value to pass. For example, An issue, such as an network outage, might prevent you from
     *        getting a response from <code>StartModel</code>. In this case, safely retry your call to
     *        <code>StartModel</code> by using the same <code>ClientToken</code> parameter value. An error occurs if the
     *        other input parameters are not the same as in the first request. Using a different value for
     *        <code>ClientToken</code> is considered a new call to <code>StartModel</code>. An idempotency token is
     *        active for 8 hours.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>StartModel</code> completes only once. You
     * choose the value to pass. For example, An issue, such as an network outage, might prevent you from getting a
     * response from <code>StartModel</code>. In this case, safely retry your call to <code>StartModel</code> by using
     * the same <code>ClientToken</code> parameter value. An error occurs if the other input parameters are not the same
     * as in the first request. Using a different value for <code>ClientToken</code> is considered a new call to
     * <code>StartModel</code>. An idempotency token is active for 8 hours.
     * </p>
     * 
     * @return ClientToken is an idempotency token that ensures a call to <code>StartModel</code> completes only once.
     *         You choose the value to pass. For example, An issue, such as an network outage, might prevent you from
     *         getting a response from <code>StartModel</code>. In this case, safely retry your call to
     *         <code>StartModel</code> by using the same <code>ClientToken</code> parameter value. An error occurs if
     *         the other input parameters are not the same as in the first request. Using a different value for
     *         <code>ClientToken</code> is considered a new call to <code>StartModel</code>. An idempotency token is
     *         active for 8 hours.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>StartModel</code> completes only once. You
     * choose the value to pass. For example, An issue, such as an network outage, might prevent you from getting a
     * response from <code>StartModel</code>. In this case, safely retry your call to <code>StartModel</code> by using
     * the same <code>ClientToken</code> parameter value. An error occurs if the other input parameters are not the same
     * as in the first request. Using a different value for <code>ClientToken</code> is considered a new call to
     * <code>StartModel</code>. An idempotency token is active for 8 hours.
     * </p>
     * 
     * @param clientToken
     *        ClientToken is an idempotency token that ensures a call to <code>StartModel</code> completes only once.
     *        You choose the value to pass. For example, An issue, such as an network outage, might prevent you from
     *        getting a response from <code>StartModel</code>. In this case, safely retry your call to
     *        <code>StartModel</code> by using the same <code>ClientToken</code> parameter value. An error occurs if the
     *        other input parameters are not the same as in the first request. Using a different value for
     *        <code>ClientToken</code> is considered a new call to <code>StartModel</code>. An idempotency token is
     *        active for 8 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartModelRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getModelVersion() != null)
            sb.append("ModelVersion: ").append(getModelVersion()).append(",");
        if (getMinInferenceUnits() != null)
            sb.append("MinInferenceUnits: ").append(getMinInferenceUnits()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartModelRequest == false)
            return false;
        StartModelRequest other = (StartModelRequest) obj;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getModelVersion() == null ^ this.getModelVersion() == null)
            return false;
        if (other.getModelVersion() != null && other.getModelVersion().equals(this.getModelVersion()) == false)
            return false;
        if (other.getMinInferenceUnits() == null ^ this.getMinInferenceUnits() == null)
            return false;
        if (other.getMinInferenceUnits() != null && other.getMinInferenceUnits().equals(this.getMinInferenceUnits()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        hashCode = prime * hashCode + ((getMinInferenceUnits() == null) ? 0 : getMinInferenceUnits().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public StartModelRequest clone() {
        return (StartModelRequest) super.clone();
    }

}
