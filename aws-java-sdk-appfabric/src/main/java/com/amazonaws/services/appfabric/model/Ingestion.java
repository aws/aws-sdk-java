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
 * Contains information about an ingestion.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/Ingestion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ingestion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ingestion.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the app bundle for the ingestion.
     * </p>
     */
    private String appBundleArn;
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
     * The timestamp of when the ingestion was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The timestamp of when the ingestion was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The status of the ingestion.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The type of the ingestion.
     * </p>
     */
    private String ingestionType;

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

    public Ingestion withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the app bundle for the ingestion.
     * </p>
     * 
     * @param appBundleArn
     *        The Amazon Resource Name (ARN) of the app bundle for the ingestion.
     */

    public void setAppBundleArn(String appBundleArn) {
        this.appBundleArn = appBundleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the app bundle for the ingestion.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the app bundle for the ingestion.
     */

    public String getAppBundleArn() {
        return this.appBundleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the app bundle for the ingestion.
     * </p>
     * 
     * @param appBundleArn
     *        The Amazon Resource Name (ARN) of the app bundle for the ingestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ingestion withAppBundleArn(String appBundleArn) {
        setAppBundleArn(appBundleArn);
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

    public Ingestion withApp(String app) {
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

    public Ingestion withTenantId(String tenantId) {
        setTenantId(tenantId);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the ingestion was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the ingestion was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the ingestion was created.
     * </p>
     * 
     * @return The timestamp of when the ingestion was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the ingestion was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the ingestion was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ingestion withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the ingestion was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the ingestion was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the ingestion was last updated.
     * </p>
     * 
     * @return The timestamp of when the ingestion was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the ingestion was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the ingestion was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ingestion withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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

    public Ingestion withState(String state) {
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

    public Ingestion withState(IngestionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The type of the ingestion.
     * </p>
     * 
     * @param ingestionType
     *        The type of the ingestion.
     * @see IngestionType
     */

    public void setIngestionType(String ingestionType) {
        this.ingestionType = ingestionType;
    }

    /**
     * <p>
     * The type of the ingestion.
     * </p>
     * 
     * @return The type of the ingestion.
     * @see IngestionType
     */

    public String getIngestionType() {
        return this.ingestionType;
    }

    /**
     * <p>
     * The type of the ingestion.
     * </p>
     * 
     * @param ingestionType
     *        The type of the ingestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionType
     */

    public Ingestion withIngestionType(String ingestionType) {
        setIngestionType(ingestionType);
        return this;
    }

    /**
     * <p>
     * The type of the ingestion.
     * </p>
     * 
     * @param ingestionType
     *        The type of the ingestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionType
     */

    public Ingestion withIngestionType(IngestionType ingestionType) {
        this.ingestionType = ingestionType.toString();
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
        if (getAppBundleArn() != null)
            sb.append("AppBundleArn: ").append(getAppBundleArn()).append(",");
        if (getApp() != null)
            sb.append("App: ").append(getApp()).append(",");
        if (getTenantId() != null)
            sb.append("TenantId: ").append(getTenantId()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getIngestionType() != null)
            sb.append("IngestionType: ").append(getIngestionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ingestion == false)
            return false;
        Ingestion other = (Ingestion) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAppBundleArn() == null ^ this.getAppBundleArn() == null)
            return false;
        if (other.getAppBundleArn() != null && other.getAppBundleArn().equals(this.getAppBundleArn()) == false)
            return false;
        if (other.getApp() == null ^ this.getApp() == null)
            return false;
        if (other.getApp() != null && other.getApp().equals(this.getApp()) == false)
            return false;
        if (other.getTenantId() == null ^ this.getTenantId() == null)
            return false;
        if (other.getTenantId() != null && other.getTenantId().equals(this.getTenantId()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getIngestionType() == null ^ this.getIngestionType() == null)
            return false;
        if (other.getIngestionType() != null && other.getIngestionType().equals(this.getIngestionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAppBundleArn() == null) ? 0 : getAppBundleArn().hashCode());
        hashCode = prime * hashCode + ((getApp() == null) ? 0 : getApp().hashCode());
        hashCode = prime * hashCode + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getIngestionType() == null) ? 0 : getIngestionType().hashCode());
        return hashCode;
    }

    @Override
    public Ingestion clone() {
        try {
            return (Ingestion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appfabric.model.transform.IngestionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
