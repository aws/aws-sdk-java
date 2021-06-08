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
package com.amazonaws.services.honeycode.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/StartTableDataImportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartTableDataImportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the workbook where the rows are being imported.
     * </p>
     * <p>
     * If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     */
    private String workbookId;
    /**
     * <p>
     * The source of the data that is being imported. The size of source must be no larger than 100 MB. Source must have
     * no more than 100,000 cells and no more than 1,000 rows.
     * </p>
     */
    private ImportDataSource dataSource;
    /**
     * <p>
     * The format of the data that is being imported. Currently the only option supported is "DELIMITED_TEXT".
     * </p>
     */
    private String dataFormat;
    /**
     * <p>
     * The ID of the table where the rows are being imported.
     * </p>
     * <p>
     * If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     */
    private String destinationTableId;
    /**
     * <p>
     * The options for customizing this import request.
     * </p>
     */
    private ImportOptions importOptions;
    /**
     * <p>
     * The request token for performing the update action. Request tokens help to identify duplicate requests. If a call
     * times out or fails due to a transient error like a failed network connection, you can retry the call with the
     * same request token. The service ensures that if the first call using that request token is successfully
     * performed, the second call will not perform the action again.
     * </p>
     * <p>
     * Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests
     * spanning hours or days.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The ID of the workbook where the rows are being imported.
     * </p>
     * <p>
     * If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @param workbookId
     *        The ID of the workbook where the rows are being imported.</p>
     *        <p>
     *        If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     */

    public void setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
    }

    /**
     * <p>
     * The ID of the workbook where the rows are being imported.
     * </p>
     * <p>
     * If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @return The ID of the workbook where the rows are being imported.</p>
     *         <p>
     *         If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     */

    public String getWorkbookId() {
        return this.workbookId;
    }

    /**
     * <p>
     * The ID of the workbook where the rows are being imported.
     * </p>
     * <p>
     * If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @param workbookId
     *        The ID of the workbook where the rows are being imported.</p>
     *        <p>
     *        If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTableDataImportJobRequest withWorkbookId(String workbookId) {
        setWorkbookId(workbookId);
        return this;
    }

    /**
     * <p>
     * The source of the data that is being imported. The size of source must be no larger than 100 MB. Source must have
     * no more than 100,000 cells and no more than 1,000 rows.
     * </p>
     * 
     * @param dataSource
     *        The source of the data that is being imported. The size of source must be no larger than 100 MB. Source
     *        must have no more than 100,000 cells and no more than 1,000 rows.
     */

    public void setDataSource(ImportDataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The source of the data that is being imported. The size of source must be no larger than 100 MB. Source must have
     * no more than 100,000 cells and no more than 1,000 rows.
     * </p>
     * 
     * @return The source of the data that is being imported. The size of source must be no larger than 100 MB. Source
     *         must have no more than 100,000 cells and no more than 1,000 rows.
     */

    public ImportDataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The source of the data that is being imported. The size of source must be no larger than 100 MB. Source must have
     * no more than 100,000 cells and no more than 1,000 rows.
     * </p>
     * 
     * @param dataSource
     *        The source of the data that is being imported. The size of source must be no larger than 100 MB. Source
     *        must have no more than 100,000 cells and no more than 1,000 rows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTableDataImportJobRequest withDataSource(ImportDataSource dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * The format of the data that is being imported. Currently the only option supported is "DELIMITED_TEXT".
     * </p>
     * 
     * @param dataFormat
     *        The format of the data that is being imported. Currently the only option supported is "DELIMITED_TEXT".
     * @see ImportSourceDataFormat
     */

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    /**
     * <p>
     * The format of the data that is being imported. Currently the only option supported is "DELIMITED_TEXT".
     * </p>
     * 
     * @return The format of the data that is being imported. Currently the only option supported is "DELIMITED_TEXT".
     * @see ImportSourceDataFormat
     */

    public String getDataFormat() {
        return this.dataFormat;
    }

    /**
     * <p>
     * The format of the data that is being imported. Currently the only option supported is "DELIMITED_TEXT".
     * </p>
     * 
     * @param dataFormat
     *        The format of the data that is being imported. Currently the only option supported is "DELIMITED_TEXT".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportSourceDataFormat
     */

    public StartTableDataImportJobRequest withDataFormat(String dataFormat) {
        setDataFormat(dataFormat);
        return this;
    }

    /**
     * <p>
     * The format of the data that is being imported. Currently the only option supported is "DELIMITED_TEXT".
     * </p>
     * 
     * @param dataFormat
     *        The format of the data that is being imported. Currently the only option supported is "DELIMITED_TEXT".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportSourceDataFormat
     */

    public StartTableDataImportJobRequest withDataFormat(ImportSourceDataFormat dataFormat) {
        this.dataFormat = dataFormat.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the table where the rows are being imported.
     * </p>
     * <p>
     * If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @param destinationTableId
     *        The ID of the table where the rows are being imported.</p>
     *        <p>
     *        If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     */

    public void setDestinationTableId(String destinationTableId) {
        this.destinationTableId = destinationTableId;
    }

    /**
     * <p>
     * The ID of the table where the rows are being imported.
     * </p>
     * <p>
     * If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @return The ID of the table where the rows are being imported.</p>
     *         <p>
     *         If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     */

    public String getDestinationTableId() {
        return this.destinationTableId;
    }

    /**
     * <p>
     * The ID of the table where the rows are being imported.
     * </p>
     * <p>
     * If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @param destinationTableId
     *        The ID of the table where the rows are being imported.</p>
     *        <p>
     *        If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTableDataImportJobRequest withDestinationTableId(String destinationTableId) {
        setDestinationTableId(destinationTableId);
        return this;
    }

    /**
     * <p>
     * The options for customizing this import request.
     * </p>
     * 
     * @param importOptions
     *        The options for customizing this import request.
     */

    public void setImportOptions(ImportOptions importOptions) {
        this.importOptions = importOptions;
    }

    /**
     * <p>
     * The options for customizing this import request.
     * </p>
     * 
     * @return The options for customizing this import request.
     */

    public ImportOptions getImportOptions() {
        return this.importOptions;
    }

    /**
     * <p>
     * The options for customizing this import request.
     * </p>
     * 
     * @param importOptions
     *        The options for customizing this import request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTableDataImportJobRequest withImportOptions(ImportOptions importOptions) {
        setImportOptions(importOptions);
        return this;
    }

    /**
     * <p>
     * The request token for performing the update action. Request tokens help to identify duplicate requests. If a call
     * times out or fails due to a transient error like a failed network connection, you can retry the call with the
     * same request token. The service ensures that if the first call using that request token is successfully
     * performed, the second call will not perform the action again.
     * </p>
     * <p>
     * Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests
     * spanning hours or days.
     * </p>
     * 
     * @param clientRequestToken
     *        The request token for performing the update action. Request tokens help to identify duplicate requests. If
     *        a call times out or fails due to a transient error like a failed network connection, you can retry the
     *        call with the same request token. The service ensures that if the first call using that request token is
     *        successfully performed, the second call will not perform the action again. </p>
     *        <p>
     *        Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe
     *        requests spanning hours or days.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The request token for performing the update action. Request tokens help to identify duplicate requests. If a call
     * times out or fails due to a transient error like a failed network connection, you can retry the call with the
     * same request token. The service ensures that if the first call using that request token is successfully
     * performed, the second call will not perform the action again.
     * </p>
     * <p>
     * Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests
     * spanning hours or days.
     * </p>
     * 
     * @return The request token for performing the update action. Request tokens help to identify duplicate requests.
     *         If a call times out or fails due to a transient error like a failed network connection, you can retry the
     *         call with the same request token. The service ensures that if the first call using that request token is
     *         successfully performed, the second call will not perform the action again. </p>
     *         <p>
     *         Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe
     *         requests spanning hours or days.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The request token for performing the update action. Request tokens help to identify duplicate requests. If a call
     * times out or fails due to a transient error like a failed network connection, you can retry the call with the
     * same request token. The service ensures that if the first call using that request token is successfully
     * performed, the second call will not perform the action again.
     * </p>
     * <p>
     * Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests
     * spanning hours or days.
     * </p>
     * 
     * @param clientRequestToken
     *        The request token for performing the update action. Request tokens help to identify duplicate requests. If
     *        a call times out or fails due to a transient error like a failed network connection, you can retry the
     *        call with the same request token. The service ensures that if the first call using that request token is
     *        successfully performed, the second call will not perform the action again. </p>
     *        <p>
     *        Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe
     *        requests spanning hours or days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTableDataImportJobRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getWorkbookId() != null)
            sb.append("WorkbookId: ").append(getWorkbookId()).append(",");
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getDataFormat() != null)
            sb.append("DataFormat: ").append(getDataFormat()).append(",");
        if (getDestinationTableId() != null)
            sb.append("DestinationTableId: ").append(getDestinationTableId()).append(",");
        if (getImportOptions() != null)
            sb.append("ImportOptions: ").append(getImportOptions()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartTableDataImportJobRequest == false)
            return false;
        StartTableDataImportJobRequest other = (StartTableDataImportJobRequest) obj;
        if (other.getWorkbookId() == null ^ this.getWorkbookId() == null)
            return false;
        if (other.getWorkbookId() != null && other.getWorkbookId().equals(this.getWorkbookId()) == false)
            return false;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getDataFormat() == null ^ this.getDataFormat() == null)
            return false;
        if (other.getDataFormat() != null && other.getDataFormat().equals(this.getDataFormat()) == false)
            return false;
        if (other.getDestinationTableId() == null ^ this.getDestinationTableId() == null)
            return false;
        if (other.getDestinationTableId() != null && other.getDestinationTableId().equals(this.getDestinationTableId()) == false)
            return false;
        if (other.getImportOptions() == null ^ this.getImportOptions() == null)
            return false;
        if (other.getImportOptions() != null && other.getImportOptions().equals(this.getImportOptions()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkbookId() == null) ? 0 : getWorkbookId().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getDataFormat() == null) ? 0 : getDataFormat().hashCode());
        hashCode = prime * hashCode + ((getDestinationTableId() == null) ? 0 : getDestinationTableId().hashCode());
        hashCode = prime * hashCode + ((getImportOptions() == null) ? 0 : getImportOptions().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public StartTableDataImportJobRequest clone() {
        return (StartTableDataImportJobRequest) super.clone();
    }

}
