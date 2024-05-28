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
package com.amazonaws.services.appfabric.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a summary of an ingestion.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/IngestionSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IngestionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ingestion.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the application.
     * </p>
     */
    private String app;
    /**
     * <p>
     * The ID of the application tenant.
     * </p>
     */
    private String tenantId;
    /**
     * <p>
     * The status of the ingestion.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ingestion.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the ingestion.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ingestion.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the ingestion.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ingestion.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the ingestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param app
     *        The name of the application.
     */

    public void setApp(String app) {
        this.app = app;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @return The name of the application.
     */

    public String getApp() {
        return this.app;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param app
     *        The name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionSummary withApp(String app) {
        setApp(app);
        return this;
    }

    /**
     * <p>
     * The ID of the application tenant.
     * </p>
     * 
     * @param tenantId
     *        The ID of the application tenant.
     */

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * <p>
     * The ID of the application tenant.
     * </p>
     * 
     * @return The ID of the application tenant.
     */

    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * <p>
     * The ID of the application tenant.
     * </p>
     * 
     * @param tenantId
     *        The ID of the application tenant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionSummary withTenantId(String tenantId) {
        setTenantId(tenantId);
        return this;
    }

    /**
     * <p>
     * The status of the ingestion.
     * </p>
     * 
     * @param state
     *        The status of the ingestion.
     * @see IngestionState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The status of the ingestion.
     * </p>
     * 
     * @return The status of the ingestion.
     * @see IngestionState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The status of the ingestion.
     * </p>
     * 
     * @param state
     *        The status of the ingestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionState
     */

    public IngestionSummary withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The status of the ingestion.
     * </p>
     * 
     * @param state
     *        The status of the ingestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionState
     */

    public IngestionSummary withState(IngestionState state) {
        this.state = state.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getApp() != null)
            sb.append("App: ").append(getApp()).append(",");
        if (getTenantId() != null)
            sb.append("TenantId: ").append(getTenantId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IngestionSummary == false)
            return false;
        IngestionSummary other = (IngestionSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getApp() == null ^ this.getApp() == null)
            return false;
        if (other.getApp() != null && other.getApp().equals(this.getApp()) == false)
            return false;
        if (other.getTenantId() == null ^ this.getTenantId() == null)
            return false;
        if (other.getTenantId() != null && other.getTenantId().equals(this.getTenantId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getApp() == null) ? 0 : getApp().hashCode());
        hashCode = prime * hashCode + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public IngestionSummary clone() {
        try {
            return (IngestionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appfabric.model.transform.IngestionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
