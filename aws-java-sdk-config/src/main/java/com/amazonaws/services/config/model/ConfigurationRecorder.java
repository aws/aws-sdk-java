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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Records configuration changes to your specified resource types. For more information about the configuration
 * recorder, see <a href="https://docs.aws.amazon.com/config/latest/developerguide/stop-start-recorder.html">
 * <b>Managing the Configuration Recorder</b> </a> in the <i>Config Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ConfigurationRecorder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurationRecorder implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the configuration recorder. Config automatically assigns the name of "default" when creating the
     * configuration recorder.
     * </p>
     * <note>
     * <p>
     * You cannot change the name of the configuration recorder after it has been created. To change the configuration
     * recorder name, you must delete it and create a new configuration recorder with a new name.
     * </p>
     * </note>
     */
    private String name;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the IAM role assumed by Config and used by the configuration recorder.
     * </p>
     * <note>
     * <p>
     * While the API model does not require this field, the server will reject a request without a defined
     * <code>roleARN</code> for the configuration recorder.
     * </p>
     * </note> <note>
     * <p>
     * <b>Pre-existing Config role</b>
     * </p>
     * <p>
     * If you have used an Amazon Web Services service that uses Config, such as Security Hub or Control Tower, and an
     * Config role has already been created, make sure that the IAM role that you use when setting up Config keeps the
     * same minimum permissions as the already created Config role. You must do this so that the other Amazon Web
     * Services service continues to run as expected.
     * </p>
     * <p>
     * For example, if Control Tower has an IAM role that allows Config to read Amazon Simple Storage Service (Amazon
     * S3) objects, make sure that the same permissions are granted within the IAM role you use when setting up Config.
     * Otherwise, it may interfere with how Control Tower operates. For more information about IAM roles for Config, see
     * <a href="https://docs.aws.amazon.com/config/latest/developerguide/security-iam.html"> <b>Identity and Access
     * Management for Config</b> </a> in the <i>Config Developer Guide</i>.
     * </p>
     * </note>
     */
    private String roleARN;
    /**
     * <p>
     * Specifies which resource types Config records for configuration changes.
     * </p>
     * <note>
     * <p>
     * <b> High Number of Config Evaluations</b>
     * </p>
     * <p>
     * You may notice increased activity in your account during your initial month recording with Config when compared
     * to subsequent months. During the initial bootstrapping process, Config runs evaluations on all the resources in
     * your account that you have selected for Config to record.
     * </p>
     * <p>
     * If you are running ephemeral workloads, you may see increased activity from Config as it records configuration
     * changes associated with creating and deleting these temporary resources. An <i>ephemeral workload</i> is a
     * temporary use of computing resources that are loaded and run when needed. Examples include Amazon Elastic Compute
     * Cloud (Amazon EC2) Spot Instances, Amazon EMR jobs, and Auto Scaling. If you want to avoid the increased activity
     * from running ephemeral workloads, you can run these types of workloads in a separate account with Config turned
     * off to avoid increased configuration recording and rule evaluations.
     * </p>
     * </note>
     */
    private RecordingGroup recordingGroup;
    /**
     * <p>
     * Specifies the default recording frequency that Config uses to record configuration changes. Config supports
     * <i>Continuous recording</i> and <i>Daily recording</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Continuous recording allows you to record configuration changes continuously whenever a change occurs.
     * </p>
     * </li>
     * <li>
     * <p>
     * Daily recording allows you to receive a configuration item (CI) representing the most recent state of your
     * resources over the last 24-hour period, only if it’s different from the previous CI recorded.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Firewall Manager depends on continuous recording to monitor your resources. If you are using Firewall Manager, it
     * is recommended that you set the recording frequency to Continuous.
     * </p>
     * </note>
     * <p>
     * You can also override the recording frequency for specific resource types.
     * </p>
     */
    private RecordingMode recordingMode;

    /**
     * <p>
     * The name of the configuration recorder. Config automatically assigns the name of "default" when creating the
     * configuration recorder.
     * </p>
     * <note>
     * <p>
     * You cannot change the name of the configuration recorder after it has been created. To change the configuration
     * recorder name, you must delete it and create a new configuration recorder with a new name.
     * </p>
     * </note>
     * 
     * @param name
     *        The name of the configuration recorder. Config automatically assigns the name of "default" when creating
     *        the configuration recorder.</p> <note>
     *        <p>
     *        You cannot change the name of the configuration recorder after it has been created. To change the
     *        configuration recorder name, you must delete it and create a new configuration recorder with a new name.
     *        </p>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the configuration recorder. Config automatically assigns the name of "default" when creating the
     * configuration recorder.
     * </p>
     * <note>
     * <p>
     * You cannot change the name of the configuration recorder after it has been created. To change the configuration
     * recorder name, you must delete it and create a new configuration recorder with a new name.
     * </p>
     * </note>
     * 
     * @return The name of the configuration recorder. Config automatically assigns the name of "default" when creating
     *         the configuration recorder.</p> <note>
     *         <p>
     *         You cannot change the name of the configuration recorder after it has been created. To change the
     *         configuration recorder name, you must delete it and create a new configuration recorder with a new name.
     *         </p>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the configuration recorder. Config automatically assigns the name of "default" when creating the
     * configuration recorder.
     * </p>
     * <note>
     * <p>
     * You cannot change the name of the configuration recorder after it has been created. To change the configuration
     * recorder name, you must delete it and create a new configuration recorder with a new name.
     * </p>
     * </note>
     * 
     * @param name
     *        The name of the configuration recorder. Config automatically assigns the name of "default" when creating
     *        the configuration recorder.</p> <note>
     *        <p>
     *        You cannot change the name of the configuration recorder after it has been created. To change the
     *        configuration recorder name, you must delete it and create a new configuration recorder with a new name.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationRecorder withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the IAM role assumed by Config and used by the configuration recorder.
     * </p>
     * <note>
     * <p>
     * While the API model does not require this field, the server will reject a request without a defined
     * <code>roleARN</code> for the configuration recorder.
     * </p>
     * </note> <note>
     * <p>
     * <b>Pre-existing Config role</b>
     * </p>
     * <p>
     * If you have used an Amazon Web Services service that uses Config, such as Security Hub or Control Tower, and an
     * Config role has already been created, make sure that the IAM role that you use when setting up Config keeps the
     * same minimum permissions as the already created Config role. You must do this so that the other Amazon Web
     * Services service continues to run as expected.
     * </p>
     * <p>
     * For example, if Control Tower has an IAM role that allows Config to read Amazon Simple Storage Service (Amazon
     * S3) objects, make sure that the same permissions are granted within the IAM role you use when setting up Config.
     * Otherwise, it may interfere with how Control Tower operates. For more information about IAM roles for Config, see
     * <a href="https://docs.aws.amazon.com/config/latest/developerguide/security-iam.html"> <b>Identity and Access
     * Management for Config</b> </a> in the <i>Config Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param roleARN
     *        Amazon Resource Name (ARN) of the IAM role assumed by Config and used by the configuration recorder.</p>
     *        <note>
     *        <p>
     *        While the API model does not require this field, the server will reject a request without a defined
     *        <code>roleARN</code> for the configuration recorder.
     *        </p>
     *        </note> <note>
     *        <p>
     *        <b>Pre-existing Config role</b>
     *        </p>
     *        <p>
     *        If you have used an Amazon Web Services service that uses Config, such as Security Hub or Control Tower,
     *        and an Config role has already been created, make sure that the IAM role that you use when setting up
     *        Config keeps the same minimum permissions as the already created Config role. You must do this so that the
     *        other Amazon Web Services service continues to run as expected.
     *        </p>
     *        <p>
     *        For example, if Control Tower has an IAM role that allows Config to read Amazon Simple Storage Service
     *        (Amazon S3) objects, make sure that the same permissions are granted within the IAM role you use when
     *        setting up Config. Otherwise, it may interfere with how Control Tower operates. For more information about
     *        IAM roles for Config, see <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/security-iam.html"> <b>Identity and Access
     *        Management for Config</b> </a> in the <i>Config Developer Guide</i>.
     *        </p>
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the IAM role assumed by Config and used by the configuration recorder.
     * </p>
     * <note>
     * <p>
     * While the API model does not require this field, the server will reject a request without a defined
     * <code>roleARN</code> for the configuration recorder.
     * </p>
     * </note> <note>
     * <p>
     * <b>Pre-existing Config role</b>
     * </p>
     * <p>
     * If you have used an Amazon Web Services service that uses Config, such as Security Hub or Control Tower, and an
     * Config role has already been created, make sure that the IAM role that you use when setting up Config keeps the
     * same minimum permissions as the already created Config role. You must do this so that the other Amazon Web
     * Services service continues to run as expected.
     * </p>
     * <p>
     * For example, if Control Tower has an IAM role that allows Config to read Amazon Simple Storage Service (Amazon
     * S3) objects, make sure that the same permissions are granted within the IAM role you use when setting up Config.
     * Otherwise, it may interfere with how Control Tower operates. For more information about IAM roles for Config, see
     * <a href="https://docs.aws.amazon.com/config/latest/developerguide/security-iam.html"> <b>Identity and Access
     * Management for Config</b> </a> in the <i>Config Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @return Amazon Resource Name (ARN) of the IAM role assumed by Config and used by the configuration recorder.</p>
     *         <note>
     *         <p>
     *         While the API model does not require this field, the server will reject a request without a defined
     *         <code>roleARN</code> for the configuration recorder.
     *         </p>
     *         </note> <note>
     *         <p>
     *         <b>Pre-existing Config role</b>
     *         </p>
     *         <p>
     *         If you have used an Amazon Web Services service that uses Config, such as Security Hub or Control Tower,
     *         and an Config role has already been created, make sure that the IAM role that you use when setting up
     *         Config keeps the same minimum permissions as the already created Config role. You must do this so that
     *         the other Amazon Web Services service continues to run as expected.
     *         </p>
     *         <p>
     *         For example, if Control Tower has an IAM role that allows Config to read Amazon Simple Storage Service
     *         (Amazon S3) objects, make sure that the same permissions are granted within the IAM role you use when
     *         setting up Config. Otherwise, it may interfere with how Control Tower operates. For more information
     *         about IAM roles for Config, see <a
     *         href="https://docs.aws.amazon.com/config/latest/developerguide/security-iam.html"> <b>Identity and Access
     *         Management for Config</b> </a> in the <i>Config Developer Guide</i>.
     *         </p>
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the IAM role assumed by Config and used by the configuration recorder.
     * </p>
     * <note>
     * <p>
     * While the API model does not require this field, the server will reject a request without a defined
     * <code>roleARN</code> for the configuration recorder.
     * </p>
     * </note> <note>
     * <p>
     * <b>Pre-existing Config role</b>
     * </p>
     * <p>
     * If you have used an Amazon Web Services service that uses Config, such as Security Hub or Control Tower, and an
     * Config role has already been created, make sure that the IAM role that you use when setting up Config keeps the
     * same minimum permissions as the already created Config role. You must do this so that the other Amazon Web
     * Services service continues to run as expected.
     * </p>
     * <p>
     * For example, if Control Tower has an IAM role that allows Config to read Amazon Simple Storage Service (Amazon
     * S3) objects, make sure that the same permissions are granted within the IAM role you use when setting up Config.
     * Otherwise, it may interfere with how Control Tower operates. For more information about IAM roles for Config, see
     * <a href="https://docs.aws.amazon.com/config/latest/developerguide/security-iam.html"> <b>Identity and Access
     * Management for Config</b> </a> in the <i>Config Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param roleARN
     *        Amazon Resource Name (ARN) of the IAM role assumed by Config and used by the configuration recorder.</p>
     *        <note>
     *        <p>
     *        While the API model does not require this field, the server will reject a request without a defined
     *        <code>roleARN</code> for the configuration recorder.
     *        </p>
     *        </note> <note>
     *        <p>
     *        <b>Pre-existing Config role</b>
     *        </p>
     *        <p>
     *        If you have used an Amazon Web Services service that uses Config, such as Security Hub or Control Tower,
     *        and an Config role has already been created, make sure that the IAM role that you use when setting up
     *        Config keeps the same minimum permissions as the already created Config role. You must do this so that the
     *        other Amazon Web Services service continues to run as expected.
     *        </p>
     *        <p>
     *        For example, if Control Tower has an IAM role that allows Config to read Amazon Simple Storage Service
     *        (Amazon S3) objects, make sure that the same permissions are granted within the IAM role you use when
     *        setting up Config. Otherwise, it may interfere with how Control Tower operates. For more information about
     *        IAM roles for Config, see <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/security-iam.html"> <b>Identity and Access
     *        Management for Config</b> </a> in the <i>Config Developer Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationRecorder withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * Specifies which resource types Config records for configuration changes.
     * </p>
     * <note>
     * <p>
     * <b> High Number of Config Evaluations</b>
     * </p>
     * <p>
     * You may notice increased activity in your account during your initial month recording with Config when compared
     * to subsequent months. During the initial bootstrapping process, Config runs evaluations on all the resources in
     * your account that you have selected for Config to record.
     * </p>
     * <p>
     * If you are running ephemeral workloads, you may see increased activity from Config as it records configuration
     * changes associated with creating and deleting these temporary resources. An <i>ephemeral workload</i> is a
     * temporary use of computing resources that are loaded and run when needed. Examples include Amazon Elastic Compute
     * Cloud (Amazon EC2) Spot Instances, Amazon EMR jobs, and Auto Scaling. If you want to avoid the increased activity
     * from running ephemeral workloads, you can run these types of workloads in a separate account with Config turned
     * off to avoid increased configuration recording and rule evaluations.
     * </p>
     * </note>
     * 
     * @param recordingGroup
     *        Specifies which resource types Config records for configuration changes.</p> <note>
     *        <p>
     *        <b> High Number of Config Evaluations</b>
     *        </p>
     *        <p>
     *        You may notice increased activity in your account during your initial month recording with Config when
     *        compared to subsequent months. During the initial bootstrapping process, Config runs evaluations on all
     *        the resources in your account that you have selected for Config to record.
     *        </p>
     *        <p>
     *        If you are running ephemeral workloads, you may see increased activity from Config as it records
     *        configuration changes associated with creating and deleting these temporary resources. An <i>ephemeral
     *        workload</i> is a temporary use of computing resources that are loaded and run when needed. Examples
     *        include Amazon Elastic Compute Cloud (Amazon EC2) Spot Instances, Amazon EMR jobs, and Auto Scaling. If
     *        you want to avoid the increased activity from running ephemeral workloads, you can run these types of
     *        workloads in a separate account with Config turned off to avoid increased configuration recording and rule
     *        evaluations.
     *        </p>
     */

    public void setRecordingGroup(RecordingGroup recordingGroup) {
        this.recordingGroup = recordingGroup;
    }

    /**
     * <p>
     * Specifies which resource types Config records for configuration changes.
     * </p>
     * <note>
     * <p>
     * <b> High Number of Config Evaluations</b>
     * </p>
     * <p>
     * You may notice increased activity in your account during your initial month recording with Config when compared
     * to subsequent months. During the initial bootstrapping process, Config runs evaluations on all the resources in
     * your account that you have selected for Config to record.
     * </p>
     * <p>
     * If you are running ephemeral workloads, you may see increased activity from Config as it records configuration
     * changes associated with creating and deleting these temporary resources. An <i>ephemeral workload</i> is a
     * temporary use of computing resources that are loaded and run when needed. Examples include Amazon Elastic Compute
     * Cloud (Amazon EC2) Spot Instances, Amazon EMR jobs, and Auto Scaling. If you want to avoid the increased activity
     * from running ephemeral workloads, you can run these types of workloads in a separate account with Config turned
     * off to avoid increased configuration recording and rule evaluations.
     * </p>
     * </note>
     * 
     * @return Specifies which resource types Config records for configuration changes.</p> <note>
     *         <p>
     *         <b> High Number of Config Evaluations</b>
     *         </p>
     *         <p>
     *         You may notice increased activity in your account during your initial month recording with Config when
     *         compared to subsequent months. During the initial bootstrapping process, Config runs evaluations on all
     *         the resources in your account that you have selected for Config to record.
     *         </p>
     *         <p>
     *         If you are running ephemeral workloads, you may see increased activity from Config as it records
     *         configuration changes associated with creating and deleting these temporary resources. An <i>ephemeral
     *         workload</i> is a temporary use of computing resources that are loaded and run when needed. Examples
     *         include Amazon Elastic Compute Cloud (Amazon EC2) Spot Instances, Amazon EMR jobs, and Auto Scaling. If
     *         you want to avoid the increased activity from running ephemeral workloads, you can run these types of
     *         workloads in a separate account with Config turned off to avoid increased configuration recording and
     *         rule evaluations.
     *         </p>
     */

    public RecordingGroup getRecordingGroup() {
        return this.recordingGroup;
    }

    /**
     * <p>
     * Specifies which resource types Config records for configuration changes.
     * </p>
     * <note>
     * <p>
     * <b> High Number of Config Evaluations</b>
     * </p>
     * <p>
     * You may notice increased activity in your account during your initial month recording with Config when compared
     * to subsequent months. During the initial bootstrapping process, Config runs evaluations on all the resources in
     * your account that you have selected for Config to record.
     * </p>
     * <p>
     * If you are running ephemeral workloads, you may see increased activity from Config as it records configuration
     * changes associated with creating and deleting these temporary resources. An <i>ephemeral workload</i> is a
     * temporary use of computing resources that are loaded and run when needed. Examples include Amazon Elastic Compute
     * Cloud (Amazon EC2) Spot Instances, Amazon EMR jobs, and Auto Scaling. If you want to avoid the increased activity
     * from running ephemeral workloads, you can run these types of workloads in a separate account with Config turned
     * off to avoid increased configuration recording and rule evaluations.
     * </p>
     * </note>
     * 
     * @param recordingGroup
     *        Specifies which resource types Config records for configuration changes.</p> <note>
     *        <p>
     *        <b> High Number of Config Evaluations</b>
     *        </p>
     *        <p>
     *        You may notice increased activity in your account during your initial month recording with Config when
     *        compared to subsequent months. During the initial bootstrapping process, Config runs evaluations on all
     *        the resources in your account that you have selected for Config to record.
     *        </p>
     *        <p>
     *        If you are running ephemeral workloads, you may see increased activity from Config as it records
     *        configuration changes associated with creating and deleting these temporary resources. An <i>ephemeral
     *        workload</i> is a temporary use of computing resources that are loaded and run when needed. Examples
     *        include Amazon Elastic Compute Cloud (Amazon EC2) Spot Instances, Amazon EMR jobs, and Auto Scaling. If
     *        you want to avoid the increased activity from running ephemeral workloads, you can run these types of
     *        workloads in a separate account with Config turned off to avoid increased configuration recording and rule
     *        evaluations.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationRecorder withRecordingGroup(RecordingGroup recordingGroup) {
        setRecordingGroup(recordingGroup);
        return this;
    }

    /**
     * <p>
     * Specifies the default recording frequency that Config uses to record configuration changes. Config supports
     * <i>Continuous recording</i> and <i>Daily recording</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Continuous recording allows you to record configuration changes continuously whenever a change occurs.
     * </p>
     * </li>
     * <li>
     * <p>
     * Daily recording allows you to receive a configuration item (CI) representing the most recent state of your
     * resources over the last 24-hour period, only if it’s different from the previous CI recorded.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Firewall Manager depends on continuous recording to monitor your resources. If you are using Firewall Manager, it
     * is recommended that you set the recording frequency to Continuous.
     * </p>
     * </note>
     * <p>
     * You can also override the recording frequency for specific resource types.
     * </p>
     * 
     * @param recordingMode
     *        Specifies the default recording frequency that Config uses to record configuration changes. Config
     *        supports <i>Continuous recording</i> and <i>Daily recording</i>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Continuous recording allows you to record configuration changes continuously whenever a change occurs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Daily recording allows you to receive a configuration item (CI) representing the most recent state of your
     *        resources over the last 24-hour period, only if it’s different from the previous CI recorded.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Firewall Manager depends on continuous recording to monitor your resources. If you are using Firewall
     *        Manager, it is recommended that you set the recording frequency to Continuous.
     *        </p>
     *        </note>
     *        <p>
     *        You can also override the recording frequency for specific resource types.
     */

    public void setRecordingMode(RecordingMode recordingMode) {
        this.recordingMode = recordingMode;
    }

    /**
     * <p>
     * Specifies the default recording frequency that Config uses to record configuration changes. Config supports
     * <i>Continuous recording</i> and <i>Daily recording</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Continuous recording allows you to record configuration changes continuously whenever a change occurs.
     * </p>
     * </li>
     * <li>
     * <p>
     * Daily recording allows you to receive a configuration item (CI) representing the most recent state of your
     * resources over the last 24-hour period, only if it’s different from the previous CI recorded.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Firewall Manager depends on continuous recording to monitor your resources. If you are using Firewall Manager, it
     * is recommended that you set the recording frequency to Continuous.
     * </p>
     * </note>
     * <p>
     * You can also override the recording frequency for specific resource types.
     * </p>
     * 
     * @return Specifies the default recording frequency that Config uses to record configuration changes. Config
     *         supports <i>Continuous recording</i> and <i>Daily recording</i>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Continuous recording allows you to record configuration changes continuously whenever a change occurs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Daily recording allows you to receive a configuration item (CI) representing the most recent state of
     *         your resources over the last 24-hour period, only if it’s different from the previous CI recorded.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         Firewall Manager depends on continuous recording to monitor your resources. If you are using Firewall
     *         Manager, it is recommended that you set the recording frequency to Continuous.
     *         </p>
     *         </note>
     *         <p>
     *         You can also override the recording frequency for specific resource types.
     */

    public RecordingMode getRecordingMode() {
        return this.recordingMode;
    }

    /**
     * <p>
     * Specifies the default recording frequency that Config uses to record configuration changes. Config supports
     * <i>Continuous recording</i> and <i>Daily recording</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Continuous recording allows you to record configuration changes continuously whenever a change occurs.
     * </p>
     * </li>
     * <li>
     * <p>
     * Daily recording allows you to receive a configuration item (CI) representing the most recent state of your
     * resources over the last 24-hour period, only if it’s different from the previous CI recorded.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Firewall Manager depends on continuous recording to monitor your resources. If you are using Firewall Manager, it
     * is recommended that you set the recording frequency to Continuous.
     * </p>
     * </note>
     * <p>
     * You can also override the recording frequency for specific resource types.
     * </p>
     * 
     * @param recordingMode
     *        Specifies the default recording frequency that Config uses to record configuration changes. Config
     *        supports <i>Continuous recording</i> and <i>Daily recording</i>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Continuous recording allows you to record configuration changes continuously whenever a change occurs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Daily recording allows you to receive a configuration item (CI) representing the most recent state of your
     *        resources over the last 24-hour period, only if it’s different from the previous CI recorded.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Firewall Manager depends on continuous recording to monitor your resources. If you are using Firewall
     *        Manager, it is recommended that you set the recording frequency to Continuous.
     *        </p>
     *        </note>
     *        <p>
     *        You can also override the recording frequency for specific resource types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationRecorder withRecordingMode(RecordingMode recordingMode) {
        setRecordingMode(recordingMode);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getRecordingGroup() != null)
            sb.append("RecordingGroup: ").append(getRecordingGroup()).append(",");
        if (getRecordingMode() != null)
            sb.append("RecordingMode: ").append(getRecordingMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigurationRecorder == false)
            return false;
        ConfigurationRecorder other = (ConfigurationRecorder) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getRecordingGroup() == null ^ this.getRecordingGroup() == null)
            return false;
        if (other.getRecordingGroup() != null && other.getRecordingGroup().equals(this.getRecordingGroup()) == false)
            return false;
        if (other.getRecordingMode() == null ^ this.getRecordingMode() == null)
            return false;
        if (other.getRecordingMode() != null && other.getRecordingMode().equals(this.getRecordingMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getRecordingGroup() == null) ? 0 : getRecordingGroup().hashCode());
        hashCode = prime * hashCode + ((getRecordingMode() == null) ? 0 : getRecordingMode().hashCode());
        return hashCode;
    }

    @Override
    public ConfigurationRecorder clone() {
        try {
            return (ConfigurationRecorder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ConfigurationRecorderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
