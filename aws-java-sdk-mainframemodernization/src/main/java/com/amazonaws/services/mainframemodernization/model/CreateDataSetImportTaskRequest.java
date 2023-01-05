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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/CreateDataSetImportTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataSetImportTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the application for which you want to import data sets.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request to create a data set
     * import. The service generates the clientToken when the API call is triggered. The token expires after one hour,
     * so if you retry the API within this timeframe with the same clientToken, you will get the same response. The
     * service also handles deleting the clientToken after it expires.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The data set import task configuration.
     * </p>
     */
    private DataSetImportConfig importConfig;

    /**
     * <p>
     * The unique identifier of the application for which you want to import data sets.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier of the application for which you want to import data sets.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier of the application for which you want to import data sets.
     * </p>
     * 
     * @return The unique identifier of the application for which you want to import data sets.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier of the application for which you want to import data sets.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier of the application for which you want to import data sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSetImportTaskRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request to create a data set
     * import. The service generates the clientToken when the API call is triggered. The token expires after one hour,
     * so if you retry the API within this timeframe with the same clientToken, you will get the same response. The
     * service also handles deleting the clientToken after it expires.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request to create a data
     *        set import. The service generates the clientToken when the API call is triggered. The token expires after
     *        one hour, so if you retry the API within this timeframe with the same clientToken, you will get the same
     *        response. The service also handles deleting the clientToken after it expires.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request to create a data set
     * import. The service generates the clientToken when the API call is triggered. The token expires after one hour,
     * so if you retry the API within this timeframe with the same clientToken, you will get the same response. The
     * service also handles deleting the clientToken after it expires.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure the idempotency of the request to create a data
     *         set import. The service generates the clientToken when the API call is triggered. The token expires after
     *         one hour, so if you retry the API within this timeframe with the same clientToken, you will get the same
     *         response. The service also handles deleting the clientToken after it expires.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request to create a data set
     * import. The service generates the clientToken when the API call is triggered. The token expires after one hour,
     * so if you retry the API within this timeframe with the same clientToken, you will get the same response. The
     * service also handles deleting the clientToken after it expires.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request to create a data
     *        set import. The service generates the clientToken when the API call is triggered. The token expires after
     *        one hour, so if you retry the API within this timeframe with the same clientToken, you will get the same
     *        response. The service also handles deleting the clientToken after it expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSetImportTaskRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The data set import task configuration.
     * </p>
     * 
     * @param importConfig
     *        The data set import task configuration.
     */

    public void setImportConfig(DataSetImportConfig importConfig) {
        this.importConfig = importConfig;
    }

    /**
     * <p>
     * The data set import task configuration.
     * </p>
     * 
     * @return The data set import task configuration.
     */

    public DataSetImportConfig getImportConfig() {
        return this.importConfig;
    }

    /**
     * <p>
     * The data set import task configuration.
     * </p>
     * 
     * @param importConfig
     *        The data set import task configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSetImportTaskRequest withImportConfig(DataSetImportConfig importConfig) {
        setImportConfig(importConfig);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getImportConfig() != null)
            sb.append("ImportConfig: ").append(getImportConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDataSetImportTaskRequest == false)
            return false;
        CreateDataSetImportTaskRequest other = (CreateDataSetImportTaskRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getImportConfig() == null ^ this.getImportConfig() == null)
            return false;
        if (other.getImportConfig() != null && other.getImportConfig().equals(this.getImportConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getImportConfig() == null) ? 0 : getImportConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataSetImportTaskRequest clone() {
        return (CreateDataSetImportTaskRequest) super.clone();
    }

}
