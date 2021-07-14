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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartReplicationTaskAssessmentRun"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartReplicationTaskAssessmentRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the migration task associated with the premigration assessment run that you want to
     * start.
     * </p>
     */
    private String replicationTaskArn;
    /**
     * <p>
     * ARN of the service role needed to start the assessment run. The role must allow the <code>iam:PassRole</code>
     * action.
     * </p>
     */
    private String serviceAccessRoleArn;
    /**
     * <p>
     * Amazon S3 bucket where you want DMS to store the results of this assessment run.
     * </p>
     */
    private String resultLocationBucket;
    /**
     * <p>
     * Folder within an Amazon S3 bucket where you want DMS to store the results of this assessment run.
     * </p>
     */
    private String resultLocationFolder;
    /**
     * <p>
     * Encryption mode that you can specify to encrypt the results of this assessment run. If you don't specify this
     * request parameter, DMS stores the assessment run results without encryption. You can specify one of the options
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"SSE_S3"</code> – The server-side encryption provided as a default by Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"SSE_KMS"</code> – Key Management Service (KMS) encryption. This encryption can use either a custom KMS
     * encryption key that you specify or the default KMS encryption key that DMS provides.
     * </p>
     * </li>
     * </ul>
     */
    private String resultEncryptionMode;
    /**
     * <p>
     * ARN of a custom KMS encryption key that you specify when you set <code>ResultEncryptionMode</code> to
     * <code>"SSE_KMS</code>".
     * </p>
     */
    private String resultKmsKeyArn;
    /**
     * <p>
     * Unique name to identify the assessment run.
     * </p>
     */
    private String assessmentRunName;
    /**
     * <p>
     * Space-separated list of names for specific individual assessments that you want to include. These names come from
     * the default list of individual assessments that DMS supports for the associated migration task. This task is
     * specified by <code>ReplicationTaskArn</code>.
     * </p>
     * <note>
     * <p>
     * You can't set a value for <code>IncludeOnly</code> if you also set a value for <code>Exclude</code> in the API
     * operation.
     * </p>
     * <p>
     * To identify the names of the default individual assessments that DMS supports for the associated migration task,
     * run the <code>DescribeApplicableIndividualAssessments</code> operation using its own
     * <code>ReplicationTaskArn</code> request parameter.
     * </p>
     * </note>
     */
    private java.util.List<String> includeOnly;
    /**
     * <p>
     * Space-separated list of names for specific individual assessments that you want to exclude. These names come from
     * the default list of individual assessments that DMS supports for the associated migration task. This task is
     * specified by <code>ReplicationTaskArn</code>.
     * </p>
     * <note>
     * <p>
     * You can't set a value for <code>Exclude</code> if you also set a value for <code>IncludeOnly</code> in the API
     * operation.
     * </p>
     * <p>
     * To identify the names of the default individual assessments that DMS supports for the associated migration task,
     * run the <code>DescribeApplicableIndividualAssessments</code> operation using its own
     * <code>ReplicationTaskArn</code> request parameter.
     * </p>
     * </note>
     */
    private java.util.List<String> exclude;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the migration task associated with the premigration assessment run that you want to
     * start.
     * </p>
     * 
     * @param replicationTaskArn
     *        Amazon Resource Name (ARN) of the migration task associated with the premigration assessment run that you
     *        want to start.
     */

    public void setReplicationTaskArn(String replicationTaskArn) {
        this.replicationTaskArn = replicationTaskArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the migration task associated with the premigration assessment run that you want to
     * start.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the migration task associated with the premigration assessment run that you
     *         want to start.
     */

    public String getReplicationTaskArn() {
        return this.replicationTaskArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the migration task associated with the premigration assessment run that you want to
     * start.
     * </p>
     * 
     * @param replicationTaskArn
     *        Amazon Resource Name (ARN) of the migration task associated with the premigration assessment run that you
     *        want to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplicationTaskAssessmentRunRequest withReplicationTaskArn(String replicationTaskArn) {
        setReplicationTaskArn(replicationTaskArn);
        return this;
    }

    /**
     * <p>
     * ARN of the service role needed to start the assessment run. The role must allow the <code>iam:PassRole</code>
     * action.
     * </p>
     * 
     * @param serviceAccessRoleArn
     *        ARN of the service role needed to start the assessment run. The role must allow the
     *        <code>iam:PassRole</code> action.
     */

    public void setServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    /**
     * <p>
     * ARN of the service role needed to start the assessment run. The role must allow the <code>iam:PassRole</code>
     * action.
     * </p>
     * 
     * @return ARN of the service role needed to start the assessment run. The role must allow the
     *         <code>iam:PassRole</code> action.
     */

    public String getServiceAccessRoleArn() {
        return this.serviceAccessRoleArn;
    }

    /**
     * <p>
     * ARN of the service role needed to start the assessment run. The role must allow the <code>iam:PassRole</code>
     * action.
     * </p>
     * 
     * @param serviceAccessRoleArn
     *        ARN of the service role needed to start the assessment run. The role must allow the
     *        <code>iam:PassRole</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplicationTaskAssessmentRunRequest withServiceAccessRoleArn(String serviceAccessRoleArn) {
        setServiceAccessRoleArn(serviceAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * Amazon S3 bucket where you want DMS to store the results of this assessment run.
     * </p>
     * 
     * @param resultLocationBucket
     *        Amazon S3 bucket where you want DMS to store the results of this assessment run.
     */

    public void setResultLocationBucket(String resultLocationBucket) {
        this.resultLocationBucket = resultLocationBucket;
    }

    /**
     * <p>
     * Amazon S3 bucket where you want DMS to store the results of this assessment run.
     * </p>
     * 
     * @return Amazon S3 bucket where you want DMS to store the results of this assessment run.
     */

    public String getResultLocationBucket() {
        return this.resultLocationBucket;
    }

    /**
     * <p>
     * Amazon S3 bucket where you want DMS to store the results of this assessment run.
     * </p>
     * 
     * @param resultLocationBucket
     *        Amazon S3 bucket where you want DMS to store the results of this assessment run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplicationTaskAssessmentRunRequest withResultLocationBucket(String resultLocationBucket) {
        setResultLocationBucket(resultLocationBucket);
        return this;
    }

    /**
     * <p>
     * Folder within an Amazon S3 bucket where you want DMS to store the results of this assessment run.
     * </p>
     * 
     * @param resultLocationFolder
     *        Folder within an Amazon S3 bucket where you want DMS to store the results of this assessment run.
     */

    public void setResultLocationFolder(String resultLocationFolder) {
        this.resultLocationFolder = resultLocationFolder;
    }

    /**
     * <p>
     * Folder within an Amazon S3 bucket where you want DMS to store the results of this assessment run.
     * </p>
     * 
     * @return Folder within an Amazon S3 bucket where you want DMS to store the results of this assessment run.
     */

    public String getResultLocationFolder() {
        return this.resultLocationFolder;
    }

    /**
     * <p>
     * Folder within an Amazon S3 bucket where you want DMS to store the results of this assessment run.
     * </p>
     * 
     * @param resultLocationFolder
     *        Folder within an Amazon S3 bucket where you want DMS to store the results of this assessment run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplicationTaskAssessmentRunRequest withResultLocationFolder(String resultLocationFolder) {
        setResultLocationFolder(resultLocationFolder);
        return this;
    }

    /**
     * <p>
     * Encryption mode that you can specify to encrypt the results of this assessment run. If you don't specify this
     * request parameter, DMS stores the assessment run results without encryption. You can specify one of the options
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"SSE_S3"</code> – The server-side encryption provided as a default by Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"SSE_KMS"</code> – Key Management Service (KMS) encryption. This encryption can use either a custom KMS
     * encryption key that you specify or the default KMS encryption key that DMS provides.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resultEncryptionMode
     *        Encryption mode that you can specify to encrypt the results of this assessment run. If you don't specify
     *        this request parameter, DMS stores the assessment run results without encryption. You can specify one of
     *        the options following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"SSE_S3"</code> – The server-side encryption provided as a default by Amazon S3.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"SSE_KMS"</code> – Key Management Service (KMS) encryption. This encryption can use either a custom
     *        KMS encryption key that you specify or the default KMS encryption key that DMS provides.
     *        </p>
     *        </li>
     */

    public void setResultEncryptionMode(String resultEncryptionMode) {
        this.resultEncryptionMode = resultEncryptionMode;
    }

    /**
     * <p>
     * Encryption mode that you can specify to encrypt the results of this assessment run. If you don't specify this
     * request parameter, DMS stores the assessment run results without encryption. You can specify one of the options
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"SSE_S3"</code> – The server-side encryption provided as a default by Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"SSE_KMS"</code> – Key Management Service (KMS) encryption. This encryption can use either a custom KMS
     * encryption key that you specify or the default KMS encryption key that DMS provides.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Encryption mode that you can specify to encrypt the results of this assessment run. If you don't specify
     *         this request parameter, DMS stores the assessment run results without encryption. You can specify one of
     *         the options following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"SSE_S3"</code> – The server-side encryption provided as a default by Amazon S3.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"SSE_KMS"</code> – Key Management Service (KMS) encryption. This encryption can use either a custom
     *         KMS encryption key that you specify or the default KMS encryption key that DMS provides.
     *         </p>
     *         </li>
     */

    public String getResultEncryptionMode() {
        return this.resultEncryptionMode;
    }

    /**
     * <p>
     * Encryption mode that you can specify to encrypt the results of this assessment run. If you don't specify this
     * request parameter, DMS stores the assessment run results without encryption. You can specify one of the options
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"SSE_S3"</code> – The server-side encryption provided as a default by Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"SSE_KMS"</code> – Key Management Service (KMS) encryption. This encryption can use either a custom KMS
     * encryption key that you specify or the default KMS encryption key that DMS provides.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resultEncryptionMode
     *        Encryption mode that you can specify to encrypt the results of this assessment run. If you don't specify
     *        this request parameter, DMS stores the assessment run results without encryption. You can specify one of
     *        the options following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"SSE_S3"</code> – The server-side encryption provided as a default by Amazon S3.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"SSE_KMS"</code> – Key Management Service (KMS) encryption. This encryption can use either a custom
     *        KMS encryption key that you specify or the default KMS encryption key that DMS provides.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplicationTaskAssessmentRunRequest withResultEncryptionMode(String resultEncryptionMode) {
        setResultEncryptionMode(resultEncryptionMode);
        return this;
    }

    /**
     * <p>
     * ARN of a custom KMS encryption key that you specify when you set <code>ResultEncryptionMode</code> to
     * <code>"SSE_KMS</code>".
     * </p>
     * 
     * @param resultKmsKeyArn
     *        ARN of a custom KMS encryption key that you specify when you set <code>ResultEncryptionMode</code> to
     *        <code>"SSE_KMS</code>".
     */

    public void setResultKmsKeyArn(String resultKmsKeyArn) {
        this.resultKmsKeyArn = resultKmsKeyArn;
    }

    /**
     * <p>
     * ARN of a custom KMS encryption key that you specify when you set <code>ResultEncryptionMode</code> to
     * <code>"SSE_KMS</code>".
     * </p>
     * 
     * @return ARN of a custom KMS encryption key that you specify when you set <code>ResultEncryptionMode</code> to
     *         <code>"SSE_KMS</code>".
     */

    public String getResultKmsKeyArn() {
        return this.resultKmsKeyArn;
    }

    /**
     * <p>
     * ARN of a custom KMS encryption key that you specify when you set <code>ResultEncryptionMode</code> to
     * <code>"SSE_KMS</code>".
     * </p>
     * 
     * @param resultKmsKeyArn
     *        ARN of a custom KMS encryption key that you specify when you set <code>ResultEncryptionMode</code> to
     *        <code>"SSE_KMS</code>".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplicationTaskAssessmentRunRequest withResultKmsKeyArn(String resultKmsKeyArn) {
        setResultKmsKeyArn(resultKmsKeyArn);
        return this;
    }

    /**
     * <p>
     * Unique name to identify the assessment run.
     * </p>
     * 
     * @param assessmentRunName
     *        Unique name to identify the assessment run.
     */

    public void setAssessmentRunName(String assessmentRunName) {
        this.assessmentRunName = assessmentRunName;
    }

    /**
     * <p>
     * Unique name to identify the assessment run.
     * </p>
     * 
     * @return Unique name to identify the assessment run.
     */

    public String getAssessmentRunName() {
        return this.assessmentRunName;
    }

    /**
     * <p>
     * Unique name to identify the assessment run.
     * </p>
     * 
     * @param assessmentRunName
     *        Unique name to identify the assessment run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplicationTaskAssessmentRunRequest withAssessmentRunName(String assessmentRunName) {
        setAssessmentRunName(assessmentRunName);
        return this;
    }

    /**
     * <p>
     * Space-separated list of names for specific individual assessments that you want to include. These names come from
     * the default list of individual assessments that DMS supports for the associated migration task. This task is
     * specified by <code>ReplicationTaskArn</code>.
     * </p>
     * <note>
     * <p>
     * You can't set a value for <code>IncludeOnly</code> if you also set a value for <code>Exclude</code> in the API
     * operation.
     * </p>
     * <p>
     * To identify the names of the default individual assessments that DMS supports for the associated migration task,
     * run the <code>DescribeApplicableIndividualAssessments</code> operation using its own
     * <code>ReplicationTaskArn</code> request parameter.
     * </p>
     * </note>
     * 
     * @return Space-separated list of names for specific individual assessments that you want to include. These names
     *         come from the default list of individual assessments that DMS supports for the associated migration task.
     *         This task is specified by <code>ReplicationTaskArn</code>.</p> <note>
     *         <p>
     *         You can't set a value for <code>IncludeOnly</code> if you also set a value for <code>Exclude</code> in
     *         the API operation.
     *         </p>
     *         <p>
     *         To identify the names of the default individual assessments that DMS supports for the associated
     *         migration task, run the <code>DescribeApplicableIndividualAssessments</code> operation using its own
     *         <code>ReplicationTaskArn</code> request parameter.
     *         </p>
     */

    public java.util.List<String> getIncludeOnly() {
        return includeOnly;
    }

    /**
     * <p>
     * Space-separated list of names for specific individual assessments that you want to include. These names come from
     * the default list of individual assessments that DMS supports for the associated migration task. This task is
     * specified by <code>ReplicationTaskArn</code>.
     * </p>
     * <note>
     * <p>
     * You can't set a value for <code>IncludeOnly</code> if you also set a value for <code>Exclude</code> in the API
     * operation.
     * </p>
     * <p>
     * To identify the names of the default individual assessments that DMS supports for the associated migration task,
     * run the <code>DescribeApplicableIndividualAssessments</code> operation using its own
     * <code>ReplicationTaskArn</code> request parameter.
     * </p>
     * </note>
     * 
     * @param includeOnly
     *        Space-separated list of names for specific individual assessments that you want to include. These names
     *        come from the default list of individual assessments that DMS supports for the associated migration task.
     *        This task is specified by <code>ReplicationTaskArn</code>.</p> <note>
     *        <p>
     *        You can't set a value for <code>IncludeOnly</code> if you also set a value for <code>Exclude</code> in the
     *        API operation.
     *        </p>
     *        <p>
     *        To identify the names of the default individual assessments that DMS supports for the associated migration
     *        task, run the <code>DescribeApplicableIndividualAssessments</code> operation using its own
     *        <code>ReplicationTaskArn</code> request parameter.
     *        </p>
     */

    public void setIncludeOnly(java.util.Collection<String> includeOnly) {
        if (includeOnly == null) {
            this.includeOnly = null;
            return;
        }

        this.includeOnly = new java.util.ArrayList<String>(includeOnly);
    }

    /**
     * <p>
     * Space-separated list of names for specific individual assessments that you want to include. These names come from
     * the default list of individual assessments that DMS supports for the associated migration task. This task is
     * specified by <code>ReplicationTaskArn</code>.
     * </p>
     * <note>
     * <p>
     * You can't set a value for <code>IncludeOnly</code> if you also set a value for <code>Exclude</code> in the API
     * operation.
     * </p>
     * <p>
     * To identify the names of the default individual assessments that DMS supports for the associated migration task,
     * run the <code>DescribeApplicableIndividualAssessments</code> operation using its own
     * <code>ReplicationTaskArn</code> request parameter.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludeOnly(java.util.Collection)} or {@link #withIncludeOnly(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param includeOnly
     *        Space-separated list of names for specific individual assessments that you want to include. These names
     *        come from the default list of individual assessments that DMS supports for the associated migration task.
     *        This task is specified by <code>ReplicationTaskArn</code>.</p> <note>
     *        <p>
     *        You can't set a value for <code>IncludeOnly</code> if you also set a value for <code>Exclude</code> in the
     *        API operation.
     *        </p>
     *        <p>
     *        To identify the names of the default individual assessments that DMS supports for the associated migration
     *        task, run the <code>DescribeApplicableIndividualAssessments</code> operation using its own
     *        <code>ReplicationTaskArn</code> request parameter.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplicationTaskAssessmentRunRequest withIncludeOnly(String... includeOnly) {
        if (this.includeOnly == null) {
            setIncludeOnly(new java.util.ArrayList<String>(includeOnly.length));
        }
        for (String ele : includeOnly) {
            this.includeOnly.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Space-separated list of names for specific individual assessments that you want to include. These names come from
     * the default list of individual assessments that DMS supports for the associated migration task. This task is
     * specified by <code>ReplicationTaskArn</code>.
     * </p>
     * <note>
     * <p>
     * You can't set a value for <code>IncludeOnly</code> if you also set a value for <code>Exclude</code> in the API
     * operation.
     * </p>
     * <p>
     * To identify the names of the default individual assessments that DMS supports for the associated migration task,
     * run the <code>DescribeApplicableIndividualAssessments</code> operation using its own
     * <code>ReplicationTaskArn</code> request parameter.
     * </p>
     * </note>
     * 
     * @param includeOnly
     *        Space-separated list of names for specific individual assessments that you want to include. These names
     *        come from the default list of individual assessments that DMS supports for the associated migration task.
     *        This task is specified by <code>ReplicationTaskArn</code>.</p> <note>
     *        <p>
     *        You can't set a value for <code>IncludeOnly</code> if you also set a value for <code>Exclude</code> in the
     *        API operation.
     *        </p>
     *        <p>
     *        To identify the names of the default individual assessments that DMS supports for the associated migration
     *        task, run the <code>DescribeApplicableIndividualAssessments</code> operation using its own
     *        <code>ReplicationTaskArn</code> request parameter.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplicationTaskAssessmentRunRequest withIncludeOnly(java.util.Collection<String> includeOnly) {
        setIncludeOnly(includeOnly);
        return this;
    }

    /**
     * <p>
     * Space-separated list of names for specific individual assessments that you want to exclude. These names come from
     * the default list of individual assessments that DMS supports for the associated migration task. This task is
     * specified by <code>ReplicationTaskArn</code>.
     * </p>
     * <note>
     * <p>
     * You can't set a value for <code>Exclude</code> if you also set a value for <code>IncludeOnly</code> in the API
     * operation.
     * </p>
     * <p>
     * To identify the names of the default individual assessments that DMS supports for the associated migration task,
     * run the <code>DescribeApplicableIndividualAssessments</code> operation using its own
     * <code>ReplicationTaskArn</code> request parameter.
     * </p>
     * </note>
     * 
     * @return Space-separated list of names for specific individual assessments that you want to exclude. These names
     *         come from the default list of individual assessments that DMS supports for the associated migration task.
     *         This task is specified by <code>ReplicationTaskArn</code>.</p> <note>
     *         <p>
     *         You can't set a value for <code>Exclude</code> if you also set a value for <code>IncludeOnly</code> in
     *         the API operation.
     *         </p>
     *         <p>
     *         To identify the names of the default individual assessments that DMS supports for the associated
     *         migration task, run the <code>DescribeApplicableIndividualAssessments</code> operation using its own
     *         <code>ReplicationTaskArn</code> request parameter.
     *         </p>
     */

    public java.util.List<String> getExclude() {
        return exclude;
    }

    /**
     * <p>
     * Space-separated list of names for specific individual assessments that you want to exclude. These names come from
     * the default list of individual assessments that DMS supports for the associated migration task. This task is
     * specified by <code>ReplicationTaskArn</code>.
     * </p>
     * <note>
     * <p>
     * You can't set a value for <code>Exclude</code> if you also set a value for <code>IncludeOnly</code> in the API
     * operation.
     * </p>
     * <p>
     * To identify the names of the default individual assessments that DMS supports for the associated migration task,
     * run the <code>DescribeApplicableIndividualAssessments</code> operation using its own
     * <code>ReplicationTaskArn</code> request parameter.
     * </p>
     * </note>
     * 
     * @param exclude
     *        Space-separated list of names for specific individual assessments that you want to exclude. These names
     *        come from the default list of individual assessments that DMS supports for the associated migration task.
     *        This task is specified by <code>ReplicationTaskArn</code>.</p> <note>
     *        <p>
     *        You can't set a value for <code>Exclude</code> if you also set a value for <code>IncludeOnly</code> in the
     *        API operation.
     *        </p>
     *        <p>
     *        To identify the names of the default individual assessments that DMS supports for the associated migration
     *        task, run the <code>DescribeApplicableIndividualAssessments</code> operation using its own
     *        <code>ReplicationTaskArn</code> request parameter.
     *        </p>
     */

    public void setExclude(java.util.Collection<String> exclude) {
        if (exclude == null) {
            this.exclude = null;
            return;
        }

        this.exclude = new java.util.ArrayList<String>(exclude);
    }

    /**
     * <p>
     * Space-separated list of names for specific individual assessments that you want to exclude. These names come from
     * the default list of individual assessments that DMS supports for the associated migration task. This task is
     * specified by <code>ReplicationTaskArn</code>.
     * </p>
     * <note>
     * <p>
     * You can't set a value for <code>Exclude</code> if you also set a value for <code>IncludeOnly</code> in the API
     * operation.
     * </p>
     * <p>
     * To identify the names of the default individual assessments that DMS supports for the associated migration task,
     * run the <code>DescribeApplicableIndividualAssessments</code> operation using its own
     * <code>ReplicationTaskArn</code> request parameter.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclude(java.util.Collection)} or {@link #withExclude(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param exclude
     *        Space-separated list of names for specific individual assessments that you want to exclude. These names
     *        come from the default list of individual assessments that DMS supports for the associated migration task.
     *        This task is specified by <code>ReplicationTaskArn</code>.</p> <note>
     *        <p>
     *        You can't set a value for <code>Exclude</code> if you also set a value for <code>IncludeOnly</code> in the
     *        API operation.
     *        </p>
     *        <p>
     *        To identify the names of the default individual assessments that DMS supports for the associated migration
     *        task, run the <code>DescribeApplicableIndividualAssessments</code> operation using its own
     *        <code>ReplicationTaskArn</code> request parameter.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplicationTaskAssessmentRunRequest withExclude(String... exclude) {
        if (this.exclude == null) {
            setExclude(new java.util.ArrayList<String>(exclude.length));
        }
        for (String ele : exclude) {
            this.exclude.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Space-separated list of names for specific individual assessments that you want to exclude. These names come from
     * the default list of individual assessments that DMS supports for the associated migration task. This task is
     * specified by <code>ReplicationTaskArn</code>.
     * </p>
     * <note>
     * <p>
     * You can't set a value for <code>Exclude</code> if you also set a value for <code>IncludeOnly</code> in the API
     * operation.
     * </p>
     * <p>
     * To identify the names of the default individual assessments that DMS supports for the associated migration task,
     * run the <code>DescribeApplicableIndividualAssessments</code> operation using its own
     * <code>ReplicationTaskArn</code> request parameter.
     * </p>
     * </note>
     * 
     * @param exclude
     *        Space-separated list of names for specific individual assessments that you want to exclude. These names
     *        come from the default list of individual assessments that DMS supports for the associated migration task.
     *        This task is specified by <code>ReplicationTaskArn</code>.</p> <note>
     *        <p>
     *        You can't set a value for <code>Exclude</code> if you also set a value for <code>IncludeOnly</code> in the
     *        API operation.
     *        </p>
     *        <p>
     *        To identify the names of the default individual assessments that DMS supports for the associated migration
     *        task, run the <code>DescribeApplicableIndividualAssessments</code> operation using its own
     *        <code>ReplicationTaskArn</code> request parameter.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplicationTaskAssessmentRunRequest withExclude(java.util.Collection<String> exclude) {
        setExclude(exclude);
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
        if (getReplicationTaskArn() != null)
            sb.append("ReplicationTaskArn: ").append(getReplicationTaskArn()).append(",");
        if (getServiceAccessRoleArn() != null)
            sb.append("ServiceAccessRoleArn: ").append(getServiceAccessRoleArn()).append(",");
        if (getResultLocationBucket() != null)
            sb.append("ResultLocationBucket: ").append(getResultLocationBucket()).append(",");
        if (getResultLocationFolder() != null)
            sb.append("ResultLocationFolder: ").append(getResultLocationFolder()).append(",");
        if (getResultEncryptionMode() != null)
            sb.append("ResultEncryptionMode: ").append(getResultEncryptionMode()).append(",");
        if (getResultKmsKeyArn() != null)
            sb.append("ResultKmsKeyArn: ").append(getResultKmsKeyArn()).append(",");
        if (getAssessmentRunName() != null)
            sb.append("AssessmentRunName: ").append(getAssessmentRunName()).append(",");
        if (getIncludeOnly() != null)
            sb.append("IncludeOnly: ").append(getIncludeOnly()).append(",");
        if (getExclude() != null)
            sb.append("Exclude: ").append(getExclude());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartReplicationTaskAssessmentRunRequest == false)
            return false;
        StartReplicationTaskAssessmentRunRequest other = (StartReplicationTaskAssessmentRunRequest) obj;
        if (other.getReplicationTaskArn() == null ^ this.getReplicationTaskArn() == null)
            return false;
        if (other.getReplicationTaskArn() != null && other.getReplicationTaskArn().equals(this.getReplicationTaskArn()) == false)
            return false;
        if (other.getServiceAccessRoleArn() == null ^ this.getServiceAccessRoleArn() == null)
            return false;
        if (other.getServiceAccessRoleArn() != null && other.getServiceAccessRoleArn().equals(this.getServiceAccessRoleArn()) == false)
            return false;
        if (other.getResultLocationBucket() == null ^ this.getResultLocationBucket() == null)
            return false;
        if (other.getResultLocationBucket() != null && other.getResultLocationBucket().equals(this.getResultLocationBucket()) == false)
            return false;
        if (other.getResultLocationFolder() == null ^ this.getResultLocationFolder() == null)
            return false;
        if (other.getResultLocationFolder() != null && other.getResultLocationFolder().equals(this.getResultLocationFolder()) == false)
            return false;
        if (other.getResultEncryptionMode() == null ^ this.getResultEncryptionMode() == null)
            return false;
        if (other.getResultEncryptionMode() != null && other.getResultEncryptionMode().equals(this.getResultEncryptionMode()) == false)
            return false;
        if (other.getResultKmsKeyArn() == null ^ this.getResultKmsKeyArn() == null)
            return false;
        if (other.getResultKmsKeyArn() != null && other.getResultKmsKeyArn().equals(this.getResultKmsKeyArn()) == false)
            return false;
        if (other.getAssessmentRunName() == null ^ this.getAssessmentRunName() == null)
            return false;
        if (other.getAssessmentRunName() != null && other.getAssessmentRunName().equals(this.getAssessmentRunName()) == false)
            return false;
        if (other.getIncludeOnly() == null ^ this.getIncludeOnly() == null)
            return false;
        if (other.getIncludeOnly() != null && other.getIncludeOnly().equals(this.getIncludeOnly()) == false)
            return false;
        if (other.getExclude() == null ^ this.getExclude() == null)
            return false;
        if (other.getExclude() != null && other.getExclude().equals(this.getExclude()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationTaskArn() == null) ? 0 : getReplicationTaskArn().hashCode());
        hashCode = prime * hashCode + ((getServiceAccessRoleArn() == null) ? 0 : getServiceAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getResultLocationBucket() == null) ? 0 : getResultLocationBucket().hashCode());
        hashCode = prime * hashCode + ((getResultLocationFolder() == null) ? 0 : getResultLocationFolder().hashCode());
        hashCode = prime * hashCode + ((getResultEncryptionMode() == null) ? 0 : getResultEncryptionMode().hashCode());
        hashCode = prime * hashCode + ((getResultKmsKeyArn() == null) ? 0 : getResultKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getAssessmentRunName() == null) ? 0 : getAssessmentRunName().hashCode());
        hashCode = prime * hashCode + ((getIncludeOnly() == null) ? 0 : getIncludeOnly().hashCode());
        hashCode = prime * hashCode + ((getExclude() == null) ? 0 : getExclude().hashCode());
        return hashCode;
    }

    @Override
    public StartReplicationTaskAssessmentRunRequest clone() {
        return (StartReplicationTaskAssessmentRunRequest) super.clone();
    }

}
