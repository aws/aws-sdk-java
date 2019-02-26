/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An array of information related to the import task request that includes status information, times, IDs, the Amazon
 * S3 Object URL for the import file, and more.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportTask implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID for a specific import task. These IDs aren't globally unique, but they are unique within an AWS
     * account.
     * </p>
     */
    private String importTaskId;
    /**
     * <p>
     * A unique token used to prevent the same import request from occurring more than once. If you didn't provide a
     * token, a token was automatically generated when the import task request was sent.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * A descriptive name for an import task. You can use this name to filter future requests related to this import
     * task, such as identifying applications and servers that were included in this import task. We recommend that you
     * use a meaningful name for each import task.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The URL for your import file that you've uploaded to Amazon S3.
     * </p>
     */
    private String importUrl;
    /**
     * <p>
     * The status of the import task. An import can have the status of <code>IMPORT_COMPLETE</code> and still have some
     * records fail to import from the overall request. More information can be found in the downloadable archive
     * defined in the <code>errorsAndFailedEntriesZip</code> field, or in the Migration Hub management console.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time that the import task request was made, presented in the Unix time stamp format.
     * </p>
     */
    private java.util.Date importRequestTime;
    /**
     * <p>
     * The time that the import task request finished, presented in the Unix time stamp format.
     * </p>
     */
    private java.util.Date importCompletionTime;
    /**
     * <p>
     * The time that the import task request was deleted, presented in the Unix time stamp format.
     * </p>
     */
    private java.util.Date importDeletedTime;
    /**
     * <p>
     * The total number of server records in the import file that were successfully imported.
     * </p>
     */
    private Integer serverImportSuccess;
    /**
     * <p>
     * The total number of server records in the import file that failed to be imported.
     * </p>
     */
    private Integer serverImportFailure;
    /**
     * <p>
     * The total number of application records in the import file that were successfully imported.
     * </p>
     */
    private Integer applicationImportSuccess;
    /**
     * <p>
     * The total number of application records in the import file that failed to be imported.
     * </p>
     */
    private Integer applicationImportFailure;
    /**
     * <p>
     * A link to a compressed archive folder (in the ZIP format) that contains an error log and a file of failed
     * records. You can use these two files to quickly identify records that failed, why they failed, and correct those
     * records. Afterward, you can upload the corrected file to your Amazon S3 bucket and create another import task
     * request.
     * </p>
     * <p>
     * This field also includes authorization information so you can confirm the authenticity of the compressed archive
     * before you download it.
     * </p>
     * <p>
     * If some records failed to be imported we recommend that you correct the records in the failed entries file and
     * then imports that failed entries file. This prevents you from having to correct and update the larger original
     * file and attempt importing it again.
     * </p>
     */
    private String errorsAndFailedEntriesZip;

    /**
     * <p>
     * The unique ID for a specific import task. These IDs aren't globally unique, but they are unique within an AWS
     * account.
     * </p>
     * 
     * @param importTaskId
     *        The unique ID for a specific import task. These IDs aren't globally unique, but they are unique within an
     *        AWS account.
     */

    public void setImportTaskId(String importTaskId) {
        this.importTaskId = importTaskId;
    }

    /**
     * <p>
     * The unique ID for a specific import task. These IDs aren't globally unique, but they are unique within an AWS
     * account.
     * </p>
     * 
     * @return The unique ID for a specific import task. These IDs aren't globally unique, but they are unique within an
     *         AWS account.
     */

    public String getImportTaskId() {
        return this.importTaskId;
    }

    /**
     * <p>
     * The unique ID for a specific import task. These IDs aren't globally unique, but they are unique within an AWS
     * account.
     * </p>
     * 
     * @param importTaskId
     *        The unique ID for a specific import task. These IDs aren't globally unique, but they are unique within an
     *        AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTask withImportTaskId(String importTaskId) {
        setImportTaskId(importTaskId);
        return this;
    }

    /**
     * <p>
     * A unique token used to prevent the same import request from occurring more than once. If you didn't provide a
     * token, a token was automatically generated when the import task request was sent.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique token used to prevent the same import request from occurring more than once. If you didn't
     *        provide a token, a token was automatically generated when the import task request was sent.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique token used to prevent the same import request from occurring more than once. If you didn't provide a
     * token, a token was automatically generated when the import task request was sent.
     * </p>
     * 
     * @return A unique token used to prevent the same import request from occurring more than once. If you didn't
     *         provide a token, a token was automatically generated when the import task request was sent.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique token used to prevent the same import request from occurring more than once. If you didn't provide a
     * token, a token was automatically generated when the import task request was sent.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique token used to prevent the same import request from occurring more than once. If you didn't
     *        provide a token, a token was automatically generated when the import task request was sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTask withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * A descriptive name for an import task. You can use this name to filter future requests related to this import
     * task, such as identifying applications and servers that were included in this import task. We recommend that you
     * use a meaningful name for each import task.
     * </p>
     * 
     * @param name
     *        A descriptive name for an import task. You can use this name to filter future requests related to this
     *        import task, such as identifying applications and servers that were included in this import task. We
     *        recommend that you use a meaningful name for each import task.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A descriptive name for an import task. You can use this name to filter future requests related to this import
     * task, such as identifying applications and servers that were included in this import task. We recommend that you
     * use a meaningful name for each import task.
     * </p>
     * 
     * @return A descriptive name for an import task. You can use this name to filter future requests related to this
     *         import task, such as identifying applications and servers that were included in this import task. We
     *         recommend that you use a meaningful name for each import task.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A descriptive name for an import task. You can use this name to filter future requests related to this import
     * task, such as identifying applications and servers that were included in this import task. We recommend that you
     * use a meaningful name for each import task.
     * </p>
     * 
     * @param name
     *        A descriptive name for an import task. You can use this name to filter future requests related to this
     *        import task, such as identifying applications and servers that were included in this import task. We
     *        recommend that you use a meaningful name for each import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTask withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The URL for your import file that you've uploaded to Amazon S3.
     * </p>
     * 
     * @param importUrl
     *        The URL for your import file that you've uploaded to Amazon S3.
     */

    public void setImportUrl(String importUrl) {
        this.importUrl = importUrl;
    }

    /**
     * <p>
     * The URL for your import file that you've uploaded to Amazon S3.
     * </p>
     * 
     * @return The URL for your import file that you've uploaded to Amazon S3.
     */

    public String getImportUrl() {
        return this.importUrl;
    }

    /**
     * <p>
     * The URL for your import file that you've uploaded to Amazon S3.
     * </p>
     * 
     * @param importUrl
     *        The URL for your import file that you've uploaded to Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTask withImportUrl(String importUrl) {
        setImportUrl(importUrl);
        return this;
    }

    /**
     * <p>
     * The status of the import task. An import can have the status of <code>IMPORT_COMPLETE</code> and still have some
     * records fail to import from the overall request. More information can be found in the downloadable archive
     * defined in the <code>errorsAndFailedEntriesZip</code> field, or in the Migration Hub management console.
     * </p>
     * 
     * @param status
     *        The status of the import task. An import can have the status of <code>IMPORT_COMPLETE</code> and still
     *        have some records fail to import from the overall request. More information can be found in the
     *        downloadable archive defined in the <code>errorsAndFailedEntriesZip</code> field, or in the Migration Hub
     *        management console.
     * @see ImportStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the import task. An import can have the status of <code>IMPORT_COMPLETE</code> and still have some
     * records fail to import from the overall request. More information can be found in the downloadable archive
     * defined in the <code>errorsAndFailedEntriesZip</code> field, or in the Migration Hub management console.
     * </p>
     * 
     * @return The status of the import task. An import can have the status of <code>IMPORT_COMPLETE</code> and still
     *         have some records fail to import from the overall request. More information can be found in the
     *         downloadable archive defined in the <code>errorsAndFailedEntriesZip</code> field, or in the Migration Hub
     *         management console.
     * @see ImportStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the import task. An import can have the status of <code>IMPORT_COMPLETE</code> and still have some
     * records fail to import from the overall request. More information can be found in the downloadable archive
     * defined in the <code>errorsAndFailedEntriesZip</code> field, or in the Migration Hub management console.
     * </p>
     * 
     * @param status
     *        The status of the import task. An import can have the status of <code>IMPORT_COMPLETE</code> and still
     *        have some records fail to import from the overall request. More information can be found in the
     *        downloadable archive defined in the <code>errorsAndFailedEntriesZip</code> field, or in the Migration Hub
     *        management console.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public ImportTask withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the import task. An import can have the status of <code>IMPORT_COMPLETE</code> and still have some
     * records fail to import from the overall request. More information can be found in the downloadable archive
     * defined in the <code>errorsAndFailedEntriesZip</code> field, or in the Migration Hub management console.
     * </p>
     * 
     * @param status
     *        The status of the import task. An import can have the status of <code>IMPORT_COMPLETE</code> and still
     *        have some records fail to import from the overall request. More information can be found in the
     *        downloadable archive defined in the <code>errorsAndFailedEntriesZip</code> field, or in the Migration Hub
     *        management console.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public ImportTask withStatus(ImportStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time that the import task request was made, presented in the Unix time stamp format.
     * </p>
     * 
     * @param importRequestTime
     *        The time that the import task request was made, presented in the Unix time stamp format.
     */

    public void setImportRequestTime(java.util.Date importRequestTime) {
        this.importRequestTime = importRequestTime;
    }

    /**
     * <p>
     * The time that the import task request was made, presented in the Unix time stamp format.
     * </p>
     * 
     * @return The time that the import task request was made, presented in the Unix time stamp format.
     */

    public java.util.Date getImportRequestTime() {
        return this.importRequestTime;
    }

    /**
     * <p>
     * The time that the import task request was made, presented in the Unix time stamp format.
     * </p>
     * 
     * @param importRequestTime
     *        The time that the import task request was made, presented in the Unix time stamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTask withImportRequestTime(java.util.Date importRequestTime) {
        setImportRequestTime(importRequestTime);
        return this;
    }

    /**
     * <p>
     * The time that the import task request finished, presented in the Unix time stamp format.
     * </p>
     * 
     * @param importCompletionTime
     *        The time that the import task request finished, presented in the Unix time stamp format.
     */

    public void setImportCompletionTime(java.util.Date importCompletionTime) {
        this.importCompletionTime = importCompletionTime;
    }

    /**
     * <p>
     * The time that the import task request finished, presented in the Unix time stamp format.
     * </p>
     * 
     * @return The time that the import task request finished, presented in the Unix time stamp format.
     */

    public java.util.Date getImportCompletionTime() {
        return this.importCompletionTime;
    }

    /**
     * <p>
     * The time that the import task request finished, presented in the Unix time stamp format.
     * </p>
     * 
     * @param importCompletionTime
     *        The time that the import task request finished, presented in the Unix time stamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTask withImportCompletionTime(java.util.Date importCompletionTime) {
        setImportCompletionTime(importCompletionTime);
        return this;
    }

    /**
     * <p>
     * The time that the import task request was deleted, presented in the Unix time stamp format.
     * </p>
     * 
     * @param importDeletedTime
     *        The time that the import task request was deleted, presented in the Unix time stamp format.
     */

    public void setImportDeletedTime(java.util.Date importDeletedTime) {
        this.importDeletedTime = importDeletedTime;
    }

    /**
     * <p>
     * The time that the import task request was deleted, presented in the Unix time stamp format.
     * </p>
     * 
     * @return The time that the import task request was deleted, presented in the Unix time stamp format.
     */

    public java.util.Date getImportDeletedTime() {
        return this.importDeletedTime;
    }

    /**
     * <p>
     * The time that the import task request was deleted, presented in the Unix time stamp format.
     * </p>
     * 
     * @param importDeletedTime
     *        The time that the import task request was deleted, presented in the Unix time stamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTask withImportDeletedTime(java.util.Date importDeletedTime) {
        setImportDeletedTime(importDeletedTime);
        return this;
    }

    /**
     * <p>
     * The total number of server records in the import file that were successfully imported.
     * </p>
     * 
     * @param serverImportSuccess
     *        The total number of server records in the import file that were successfully imported.
     */

    public void setServerImportSuccess(Integer serverImportSuccess) {
        this.serverImportSuccess = serverImportSuccess;
    }

    /**
     * <p>
     * The total number of server records in the import file that were successfully imported.
     * </p>
     * 
     * @return The total number of server records in the import file that were successfully imported.
     */

    public Integer getServerImportSuccess() {
        return this.serverImportSuccess;
    }

    /**
     * <p>
     * The total number of server records in the import file that were successfully imported.
     * </p>
     * 
     * @param serverImportSuccess
     *        The total number of server records in the import file that were successfully imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTask withServerImportSuccess(Integer serverImportSuccess) {
        setServerImportSuccess(serverImportSuccess);
        return this;
    }

    /**
     * <p>
     * The total number of server records in the import file that failed to be imported.
     * </p>
     * 
     * @param serverImportFailure
     *        The total number of server records in the import file that failed to be imported.
     */

    public void setServerImportFailure(Integer serverImportFailure) {
        this.serverImportFailure = serverImportFailure;
    }

    /**
     * <p>
     * The total number of server records in the import file that failed to be imported.
     * </p>
     * 
     * @return The total number of server records in the import file that failed to be imported.
     */

    public Integer getServerImportFailure() {
        return this.serverImportFailure;
    }

    /**
     * <p>
     * The total number of server records in the import file that failed to be imported.
     * </p>
     * 
     * @param serverImportFailure
     *        The total number of server records in the import file that failed to be imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTask withServerImportFailure(Integer serverImportFailure) {
        setServerImportFailure(serverImportFailure);
        return this;
    }

    /**
     * <p>
     * The total number of application records in the import file that were successfully imported.
     * </p>
     * 
     * @param applicationImportSuccess
     *        The total number of application records in the import file that were successfully imported.
     */

    public void setApplicationImportSuccess(Integer applicationImportSuccess) {
        this.applicationImportSuccess = applicationImportSuccess;
    }

    /**
     * <p>
     * The total number of application records in the import file that were successfully imported.
     * </p>
     * 
     * @return The total number of application records in the import file that were successfully imported.
     */

    public Integer getApplicationImportSuccess() {
        return this.applicationImportSuccess;
    }

    /**
     * <p>
     * The total number of application records in the import file that were successfully imported.
     * </p>
     * 
     * @param applicationImportSuccess
     *        The total number of application records in the import file that were successfully imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTask withApplicationImportSuccess(Integer applicationImportSuccess) {
        setApplicationImportSuccess(applicationImportSuccess);
        return this;
    }

    /**
     * <p>
     * The total number of application records in the import file that failed to be imported.
     * </p>
     * 
     * @param applicationImportFailure
     *        The total number of application records in the import file that failed to be imported.
     */

    public void setApplicationImportFailure(Integer applicationImportFailure) {
        this.applicationImportFailure = applicationImportFailure;
    }

    /**
     * <p>
     * The total number of application records in the import file that failed to be imported.
     * </p>
     * 
     * @return The total number of application records in the import file that failed to be imported.
     */

    public Integer getApplicationImportFailure() {
        return this.applicationImportFailure;
    }

    /**
     * <p>
     * The total number of application records in the import file that failed to be imported.
     * </p>
     * 
     * @param applicationImportFailure
     *        The total number of application records in the import file that failed to be imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTask withApplicationImportFailure(Integer applicationImportFailure) {
        setApplicationImportFailure(applicationImportFailure);
        return this;
    }

    /**
     * <p>
     * A link to a compressed archive folder (in the ZIP format) that contains an error log and a file of failed
     * records. You can use these two files to quickly identify records that failed, why they failed, and correct those
     * records. Afterward, you can upload the corrected file to your Amazon S3 bucket and create another import task
     * request.
     * </p>
     * <p>
     * This field also includes authorization information so you can confirm the authenticity of the compressed archive
     * before you download it.
     * </p>
     * <p>
     * If some records failed to be imported we recommend that you correct the records in the failed entries file and
     * then imports that failed entries file. This prevents you from having to correct and update the larger original
     * file and attempt importing it again.
     * </p>
     * 
     * @param errorsAndFailedEntriesZip
     *        A link to a compressed archive folder (in the ZIP format) that contains an error log and a file of failed
     *        records. You can use these two files to quickly identify records that failed, why they failed, and correct
     *        those records. Afterward, you can upload the corrected file to your Amazon S3 bucket and create another
     *        import task request.</p>
     *        <p>
     *        This field also includes authorization information so you can confirm the authenticity of the compressed
     *        archive before you download it.
     *        </p>
     *        <p>
     *        If some records failed to be imported we recommend that you correct the records in the failed entries file
     *        and then imports that failed entries file. This prevents you from having to correct and update the larger
     *        original file and attempt importing it again.
     */

    public void setErrorsAndFailedEntriesZip(String errorsAndFailedEntriesZip) {
        this.errorsAndFailedEntriesZip = errorsAndFailedEntriesZip;
    }

    /**
     * <p>
     * A link to a compressed archive folder (in the ZIP format) that contains an error log and a file of failed
     * records. You can use these two files to quickly identify records that failed, why they failed, and correct those
     * records. Afterward, you can upload the corrected file to your Amazon S3 bucket and create another import task
     * request.
     * </p>
     * <p>
     * This field also includes authorization information so you can confirm the authenticity of the compressed archive
     * before you download it.
     * </p>
     * <p>
     * If some records failed to be imported we recommend that you correct the records in the failed entries file and
     * then imports that failed entries file. This prevents you from having to correct and update the larger original
     * file and attempt importing it again.
     * </p>
     * 
     * @return A link to a compressed archive folder (in the ZIP format) that contains an error log and a file of failed
     *         records. You can use these two files to quickly identify records that failed, why they failed, and
     *         correct those records. Afterward, you can upload the corrected file to your Amazon S3 bucket and create
     *         another import task request.</p>
     *         <p>
     *         This field also includes authorization information so you can confirm the authenticity of the compressed
     *         archive before you download it.
     *         </p>
     *         <p>
     *         If some records failed to be imported we recommend that you correct the records in the failed entries
     *         file and then imports that failed entries file. This prevents you from having to correct and update the
     *         larger original file and attempt importing it again.
     */

    public String getErrorsAndFailedEntriesZip() {
        return this.errorsAndFailedEntriesZip;
    }

    /**
     * <p>
     * A link to a compressed archive folder (in the ZIP format) that contains an error log and a file of failed
     * records. You can use these two files to quickly identify records that failed, why they failed, and correct those
     * records. Afterward, you can upload the corrected file to your Amazon S3 bucket and create another import task
     * request.
     * </p>
     * <p>
     * This field also includes authorization information so you can confirm the authenticity of the compressed archive
     * before you download it.
     * </p>
     * <p>
     * If some records failed to be imported we recommend that you correct the records in the failed entries file and
     * then imports that failed entries file. This prevents you from having to correct and update the larger original
     * file and attempt importing it again.
     * </p>
     * 
     * @param errorsAndFailedEntriesZip
     *        A link to a compressed archive folder (in the ZIP format) that contains an error log and a file of failed
     *        records. You can use these two files to quickly identify records that failed, why they failed, and correct
     *        those records. Afterward, you can upload the corrected file to your Amazon S3 bucket and create another
     *        import task request.</p>
     *        <p>
     *        This field also includes authorization information so you can confirm the authenticity of the compressed
     *        archive before you download it.
     *        </p>
     *        <p>
     *        If some records failed to be imported we recommend that you correct the records in the failed entries file
     *        and then imports that failed entries file. This prevents you from having to correct and update the larger
     *        original file and attempt importing it again.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTask withErrorsAndFailedEntriesZip(String errorsAndFailedEntriesZip) {
        setErrorsAndFailedEntriesZip(errorsAndFailedEntriesZip);
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
        if (getImportTaskId() != null)
            sb.append("ImportTaskId: ").append(getImportTaskId()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getImportUrl() != null)
            sb.append("ImportUrl: ").append(getImportUrl()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getImportRequestTime() != null)
            sb.append("ImportRequestTime: ").append(getImportRequestTime()).append(",");
        if (getImportCompletionTime() != null)
            sb.append("ImportCompletionTime: ").append(getImportCompletionTime()).append(",");
        if (getImportDeletedTime() != null)
            sb.append("ImportDeletedTime: ").append(getImportDeletedTime()).append(",");
        if (getServerImportSuccess() != null)
            sb.append("ServerImportSuccess: ").append(getServerImportSuccess()).append(",");
        if (getServerImportFailure() != null)
            sb.append("ServerImportFailure: ").append(getServerImportFailure()).append(",");
        if (getApplicationImportSuccess() != null)
            sb.append("ApplicationImportSuccess: ").append(getApplicationImportSuccess()).append(",");
        if (getApplicationImportFailure() != null)
            sb.append("ApplicationImportFailure: ").append(getApplicationImportFailure()).append(",");
        if (getErrorsAndFailedEntriesZip() != null)
            sb.append("ErrorsAndFailedEntriesZip: ").append(getErrorsAndFailedEntriesZip());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportTask == false)
            return false;
        ImportTask other = (ImportTask) obj;
        if (other.getImportTaskId() == null ^ this.getImportTaskId() == null)
            return false;
        if (other.getImportTaskId() != null && other.getImportTaskId().equals(this.getImportTaskId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getImportUrl() == null ^ this.getImportUrl() == null)
            return false;
        if (other.getImportUrl() != null && other.getImportUrl().equals(this.getImportUrl()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getImportRequestTime() == null ^ this.getImportRequestTime() == null)
            return false;
        if (other.getImportRequestTime() != null && other.getImportRequestTime().equals(this.getImportRequestTime()) == false)
            return false;
        if (other.getImportCompletionTime() == null ^ this.getImportCompletionTime() == null)
            return false;
        if (other.getImportCompletionTime() != null && other.getImportCompletionTime().equals(this.getImportCompletionTime()) == false)
            return false;
        if (other.getImportDeletedTime() == null ^ this.getImportDeletedTime() == null)
            return false;
        if (other.getImportDeletedTime() != null && other.getImportDeletedTime().equals(this.getImportDeletedTime()) == false)
            return false;
        if (other.getServerImportSuccess() == null ^ this.getServerImportSuccess() == null)
            return false;
        if (other.getServerImportSuccess() != null && other.getServerImportSuccess().equals(this.getServerImportSuccess()) == false)
            return false;
        if (other.getServerImportFailure() == null ^ this.getServerImportFailure() == null)
            return false;
        if (other.getServerImportFailure() != null && other.getServerImportFailure().equals(this.getServerImportFailure()) == false)
            return false;
        if (other.getApplicationImportSuccess() == null ^ this.getApplicationImportSuccess() == null)
            return false;
        if (other.getApplicationImportSuccess() != null && other.getApplicationImportSuccess().equals(this.getApplicationImportSuccess()) == false)
            return false;
        if (other.getApplicationImportFailure() == null ^ this.getApplicationImportFailure() == null)
            return false;
        if (other.getApplicationImportFailure() != null && other.getApplicationImportFailure().equals(this.getApplicationImportFailure()) == false)
            return false;
        if (other.getErrorsAndFailedEntriesZip() == null ^ this.getErrorsAndFailedEntriesZip() == null)
            return false;
        if (other.getErrorsAndFailedEntriesZip() != null && other.getErrorsAndFailedEntriesZip().equals(this.getErrorsAndFailedEntriesZip()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImportTaskId() == null) ? 0 : getImportTaskId().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getImportUrl() == null) ? 0 : getImportUrl().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getImportRequestTime() == null) ? 0 : getImportRequestTime().hashCode());
        hashCode = prime * hashCode + ((getImportCompletionTime() == null) ? 0 : getImportCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getImportDeletedTime() == null) ? 0 : getImportDeletedTime().hashCode());
        hashCode = prime * hashCode + ((getServerImportSuccess() == null) ? 0 : getServerImportSuccess().hashCode());
        hashCode = prime * hashCode + ((getServerImportFailure() == null) ? 0 : getServerImportFailure().hashCode());
        hashCode = prime * hashCode + ((getApplicationImportSuccess() == null) ? 0 : getApplicationImportSuccess().hashCode());
        hashCode = prime * hashCode + ((getApplicationImportFailure() == null) ? 0 : getApplicationImportFailure().hashCode());
        hashCode = prime * hashCode + ((getErrorsAndFailedEntriesZip() == null) ? 0 : getErrorsAndFailedEntriesZip().hashCode());
        return hashCode;
    }

    @Override
    public ImportTask clone() {
        try {
            return (ImportTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationdiscovery.model.transform.ImportTaskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
