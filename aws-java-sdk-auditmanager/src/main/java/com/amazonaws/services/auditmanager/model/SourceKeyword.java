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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A keyword that relates to the control data source.
 * </p>
 * <p>
 * For manual evidence, this keyword indicates if the manual evidence is a file or text.
 * </p>
 * <p>
 * For automated evidence, this keyword identifies a specific CloudTrail event, Config rule, Security Hub control, or
 * Amazon Web Services API name.
 * </p>
 * <p>
 * To learn more about the supported keywords that you can use when mapping a control data source, see the following
 * pages in the <i>Audit Manager User Guide</i>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-config.html">Config rules
 * supported by Audit Manager</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-ash.html">Security Hub
 * controls supported by Audit Manager</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-api.html">API calls
 * supported by Audit Manager</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-cloudtrail.html">CloudTrail
 * event names supported by Audit Manager</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/SourceKeyword" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceKeyword implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The input method for the keyword.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SELECT_FROM_LIST</code> is used when mapping a data source for automated evidence.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When <code>keywordInputType</code> is <code>SELECT_FROM_LIST</code>, a keyword must be selected to collect
     * automated evidence. For example, this keyword can be a CloudTrail event name, a rule name for Config, a Security
     * Hub control, or the name of an Amazon Web Services API call.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_FILE</code> and <code>INPUT_TEXT</code> are only used when mapping a data source for manual
     * evidence.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When <code>keywordInputType</code> is <code>UPLOAD_FILE</code>, a file must be uploaded as manual evidence.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>keywordInputType</code> is <code>INPUT_TEXT</code>, text must be entered as manual evidence.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String keywordInputType;
    /**
     * <p>
     * The value of the keyword that's used when mapping a control data source. For example, this can be a CloudTrail
     * event name, a rule name for Config, a Security Hub control, or the name of an Amazon Web Services API call.
     * </p>
     * <p>
     * If you’re mapping a data source to a rule in Config, the <code>keywordValue</code> that you specify depends on
     * the type of rule:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">managed
     * rules</a>, you can use the rule identifier as the <code>keywordValue</code>. You can find the rule identifier
     * from the <a href="https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html">list
     * of Config managed rules</a>. For some rules, the rule identifier is different from the rule name. For example,
     * the rule name <code>restricted-ssh</code> has the following rule identifier: <code>INCOMING_SSH_DISABLED</code>.
     * Make sure to use the rule identifier, not the rule name.
     * </p>
     * <p>
     * Keyword example for managed rules:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Managed rule name: <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-acl-prohibited.html"
     * >s3-bucket-acl-prohibited</a>
     * </p>
     * <p>
     * <code>keywordValue</code>: <code>S3_BUCKET_ACL_PROHIBITED</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For <a href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html">custom
     * rules</a>, you form the <code>keywordValue</code> by adding the <code>Custom_</code> prefix to the rule name.
     * This prefix distinguishes the custom rule from a managed rule.
     * </p>
     * <p>
     * Keyword example for custom rules:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Custom rule name: my-custom-config-rule
     * </p>
     * <p>
     * <code>keywordValue</code>: <code>Custom_my-custom-config-rule</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/service-linked-awsconfig-rules.html">service
     * -linked rules</a>, you form the <code>keywordValue</code> by adding the <code>Custom_</code> prefix to the rule
     * name. In addition, you remove the suffix ID that appears at the end of the rule name.
     * </p>
     * <p>
     * Keyword examples for service-linked rules:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Service-linked rule name: CustomRuleForAccount-conformance-pack-szsm1uv0w
     * </p>
     * <p>
     * <code>keywordValue</code>: <code>Custom_CustomRuleForAccount-conformance-pack</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Service-linked rule name: OrgConfigRule-s3-bucket-versioning-enabled-dbgzf8ba
     * </p>
     * <p>
     * <code>keywordValue</code>: <code>Custom_OrgConfigRule-s3-bucket-versioning-enabled</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <important>
     * <p>
     * The <code>keywordValue</code> is case sensitive. If you enter a value incorrectly, Audit Manager might not
     * recognize the data source mapping. As a result, you might not successfully collect evidence from that data source
     * as intended.
     * </p>
     * <p>
     * Keep in mind the following requirements, depending on the data source type that you're using.
     * </p>
     * <ol>
     * <li>
     * <p>
     * For Config:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For managed rules, make sure that the <code>keywordValue</code> is the rule identifier in
     * <code>ALL_CAPS_WITH_UNDERSCORES</code>. For example, <code>CLOUDWATCH_LOG_GROUP_ENCRYPTED</code>. For accuracy,
     * we recommend that you reference the list of <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-config.html">supported
     * Config managed rules</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For custom rules, make sure that the <code>keywordValue</code> has the <code>Custom_</code> prefix followed by
     * the custom rule name. The format of the custom rule name itself may vary. For accuracy, we recommend that you
     * visit the <a href="https://console.aws.amazon.com/config/">Config console</a> to verify your custom rule name.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Security Hub: The format varies for Security Hub control names. For accuracy, we recommend that you reference
     * the list of <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-ash.html">supported
     * Security Hub controls</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Web Services API calls: Make sure that the <code>keywordValue</code> is written as
     * <code>serviceprefix_ActionName</code>. For example, <code>iam_ListGroups</code>. For accuracy, we recommend that
     * you reference the list of <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-api.html">supported API
     * calls</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For CloudTrail: Make sure that the <code>keywordValue</code> is written as <code>serviceprefix_ActionName</code>.
     * For example, <code>cloudtrail_StartLogging</code>. For accuracy, we recommend that you review the Amazon Web
     * Service prefix and action names in the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html"
     * >Service Authorization Reference</a>.
     * </p>
     * </li>
     * </ol>
     * </important>
     */
    private String keywordValue;

    /**
     * <p>
     * The input method for the keyword.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SELECT_FROM_LIST</code> is used when mapping a data source for automated evidence.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When <code>keywordInputType</code> is <code>SELECT_FROM_LIST</code>, a keyword must be selected to collect
     * automated evidence. For example, this keyword can be a CloudTrail event name, a rule name for Config, a Security
     * Hub control, or the name of an Amazon Web Services API call.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_FILE</code> and <code>INPUT_TEXT</code> are only used when mapping a data source for manual
     * evidence.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When <code>keywordInputType</code> is <code>UPLOAD_FILE</code>, a file must be uploaded as manual evidence.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>keywordInputType</code> is <code>INPUT_TEXT</code>, text must be entered as manual evidence.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param keywordInputType
     *        The input method for the keyword. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SELECT_FROM_LIST</code> is used when mapping a data source for automated evidence.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        When <code>keywordInputType</code> is <code>SELECT_FROM_LIST</code>, a keyword must be selected to collect
     *        automated evidence. For example, this keyword can be a CloudTrail event name, a rule name for Config, a
     *        Security Hub control, or the name of an Amazon Web Services API call.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPLOAD_FILE</code> and <code>INPUT_TEXT</code> are only used when mapping a data source for manual
     *        evidence.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        When <code>keywordInputType</code> is <code>UPLOAD_FILE</code>, a file must be uploaded as manual
     *        evidence.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When <code>keywordInputType</code> is <code>INPUT_TEXT</code>, text must be entered as manual evidence.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @see KeywordInputType
     */

    public void setKeywordInputType(String keywordInputType) {
        this.keywordInputType = keywordInputType;
    }

    /**
     * <p>
     * The input method for the keyword.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SELECT_FROM_LIST</code> is used when mapping a data source for automated evidence.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When <code>keywordInputType</code> is <code>SELECT_FROM_LIST</code>, a keyword must be selected to collect
     * automated evidence. For example, this keyword can be a CloudTrail event name, a rule name for Config, a Security
     * Hub control, or the name of an Amazon Web Services API call.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_FILE</code> and <code>INPUT_TEXT</code> are only used when mapping a data source for manual
     * evidence.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When <code>keywordInputType</code> is <code>UPLOAD_FILE</code>, a file must be uploaded as manual evidence.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>keywordInputType</code> is <code>INPUT_TEXT</code>, text must be entered as manual evidence.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The input method for the keyword. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SELECT_FROM_LIST</code> is used when mapping a data source for automated evidence.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         When <code>keywordInputType</code> is <code>SELECT_FROM_LIST</code>, a keyword must be selected to
     *         collect automated evidence. For example, this keyword can be a CloudTrail event name, a rule name for
     *         Config, a Security Hub control, or the name of an Amazon Web Services API call.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPLOAD_FILE</code> and <code>INPUT_TEXT</code> are only used when mapping a data source for manual
     *         evidence.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         When <code>keywordInputType</code> is <code>UPLOAD_FILE</code>, a file must be uploaded as manual
     *         evidence.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When <code>keywordInputType</code> is <code>INPUT_TEXT</code>, text must be entered as manual evidence.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @see KeywordInputType
     */

    public String getKeywordInputType() {
        return this.keywordInputType;
    }

    /**
     * <p>
     * The input method for the keyword.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SELECT_FROM_LIST</code> is used when mapping a data source for automated evidence.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When <code>keywordInputType</code> is <code>SELECT_FROM_LIST</code>, a keyword must be selected to collect
     * automated evidence. For example, this keyword can be a CloudTrail event name, a rule name for Config, a Security
     * Hub control, or the name of an Amazon Web Services API call.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_FILE</code> and <code>INPUT_TEXT</code> are only used when mapping a data source for manual
     * evidence.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When <code>keywordInputType</code> is <code>UPLOAD_FILE</code>, a file must be uploaded as manual evidence.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>keywordInputType</code> is <code>INPUT_TEXT</code>, text must be entered as manual evidence.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param keywordInputType
     *        The input method for the keyword. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SELECT_FROM_LIST</code> is used when mapping a data source for automated evidence.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        When <code>keywordInputType</code> is <code>SELECT_FROM_LIST</code>, a keyword must be selected to collect
     *        automated evidence. For example, this keyword can be a CloudTrail event name, a rule name for Config, a
     *        Security Hub control, or the name of an Amazon Web Services API call.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPLOAD_FILE</code> and <code>INPUT_TEXT</code> are only used when mapping a data source for manual
     *        evidence.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        When <code>keywordInputType</code> is <code>UPLOAD_FILE</code>, a file must be uploaded as manual
     *        evidence.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When <code>keywordInputType</code> is <code>INPUT_TEXT</code>, text must be entered as manual evidence.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeywordInputType
     */

    public SourceKeyword withKeywordInputType(String keywordInputType) {
        setKeywordInputType(keywordInputType);
        return this;
    }

    /**
     * <p>
     * The input method for the keyword.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SELECT_FROM_LIST</code> is used when mapping a data source for automated evidence.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When <code>keywordInputType</code> is <code>SELECT_FROM_LIST</code>, a keyword must be selected to collect
     * automated evidence. For example, this keyword can be a CloudTrail event name, a rule name for Config, a Security
     * Hub control, or the name of an Amazon Web Services API call.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_FILE</code> and <code>INPUT_TEXT</code> are only used when mapping a data source for manual
     * evidence.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When <code>keywordInputType</code> is <code>UPLOAD_FILE</code>, a file must be uploaded as manual evidence.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>keywordInputType</code> is <code>INPUT_TEXT</code>, text must be entered as manual evidence.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param keywordInputType
     *        The input method for the keyword. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SELECT_FROM_LIST</code> is used when mapping a data source for automated evidence.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        When <code>keywordInputType</code> is <code>SELECT_FROM_LIST</code>, a keyword must be selected to collect
     *        automated evidence. For example, this keyword can be a CloudTrail event name, a rule name for Config, a
     *        Security Hub control, or the name of an Amazon Web Services API call.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPLOAD_FILE</code> and <code>INPUT_TEXT</code> are only used when mapping a data source for manual
     *        evidence.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        When <code>keywordInputType</code> is <code>UPLOAD_FILE</code>, a file must be uploaded as manual
     *        evidence.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When <code>keywordInputType</code> is <code>INPUT_TEXT</code>, text must be entered as manual evidence.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeywordInputType
     */

    public SourceKeyword withKeywordInputType(KeywordInputType keywordInputType) {
        this.keywordInputType = keywordInputType.toString();
        return this;
    }

    /**
     * <p>
     * The value of the keyword that's used when mapping a control data source. For example, this can be a CloudTrail
     * event name, a rule name for Config, a Security Hub control, or the name of an Amazon Web Services API call.
     * </p>
     * <p>
     * If you’re mapping a data source to a rule in Config, the <code>keywordValue</code> that you specify depends on
     * the type of rule:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">managed
     * rules</a>, you can use the rule identifier as the <code>keywordValue</code>. You can find the rule identifier
     * from the <a href="https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html">list
     * of Config managed rules</a>. For some rules, the rule identifier is different from the rule name. For example,
     * the rule name <code>restricted-ssh</code> has the following rule identifier: <code>INCOMING_SSH_DISABLED</code>.
     * Make sure to use the rule identifier, not the rule name.
     * </p>
     * <p>
     * Keyword example for managed rules:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Managed rule name: <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-acl-prohibited.html"
     * >s3-bucket-acl-prohibited</a>
     * </p>
     * <p>
     * <code>keywordValue</code>: <code>S3_BUCKET_ACL_PROHIBITED</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For <a href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html">custom
     * rules</a>, you form the <code>keywordValue</code> by adding the <code>Custom_</code> prefix to the rule name.
     * This prefix distinguishes the custom rule from a managed rule.
     * </p>
     * <p>
     * Keyword example for custom rules:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Custom rule name: my-custom-config-rule
     * </p>
     * <p>
     * <code>keywordValue</code>: <code>Custom_my-custom-config-rule</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/service-linked-awsconfig-rules.html">service
     * -linked rules</a>, you form the <code>keywordValue</code> by adding the <code>Custom_</code> prefix to the rule
     * name. In addition, you remove the suffix ID that appears at the end of the rule name.
     * </p>
     * <p>
     * Keyword examples for service-linked rules:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Service-linked rule name: CustomRuleForAccount-conformance-pack-szsm1uv0w
     * </p>
     * <p>
     * <code>keywordValue</code>: <code>Custom_CustomRuleForAccount-conformance-pack</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Service-linked rule name: OrgConfigRule-s3-bucket-versioning-enabled-dbgzf8ba
     * </p>
     * <p>
     * <code>keywordValue</code>: <code>Custom_OrgConfigRule-s3-bucket-versioning-enabled</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <important>
     * <p>
     * The <code>keywordValue</code> is case sensitive. If you enter a value incorrectly, Audit Manager might not
     * recognize the data source mapping. As a result, you might not successfully collect evidence from that data source
     * as intended.
     * </p>
     * <p>
     * Keep in mind the following requirements, depending on the data source type that you're using.
     * </p>
     * <ol>
     * <li>
     * <p>
     * For Config:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For managed rules, make sure that the <code>keywordValue</code> is the rule identifier in
     * <code>ALL_CAPS_WITH_UNDERSCORES</code>. For example, <code>CLOUDWATCH_LOG_GROUP_ENCRYPTED</code>. For accuracy,
     * we recommend that you reference the list of <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-config.html">supported
     * Config managed rules</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For custom rules, make sure that the <code>keywordValue</code> has the <code>Custom_</code> prefix followed by
     * the custom rule name. The format of the custom rule name itself may vary. For accuracy, we recommend that you
     * visit the <a href="https://console.aws.amazon.com/config/">Config console</a> to verify your custom rule name.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Security Hub: The format varies for Security Hub control names. For accuracy, we recommend that you reference
     * the list of <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-ash.html">supported
     * Security Hub controls</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Web Services API calls: Make sure that the <code>keywordValue</code> is written as
     * <code>serviceprefix_ActionName</code>. For example, <code>iam_ListGroups</code>. For accuracy, we recommend that
     * you reference the list of <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-api.html">supported API
     * calls</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For CloudTrail: Make sure that the <code>keywordValue</code> is written as <code>serviceprefix_ActionName</code>.
     * For example, <code>cloudtrail_StartLogging</code>. For accuracy, we recommend that you review the Amazon Web
     * Service prefix and action names in the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html"
     * >Service Authorization Reference</a>.
     * </p>
     * </li>
     * </ol>
     * </important>
     * 
     * @param keywordValue
     *        The value of the keyword that's used when mapping a control data source. For example, this can be a
     *        CloudTrail event name, a rule name for Config, a Security Hub control, or the name of an Amazon Web
     *        Services API call. </p>
     *        <p>
     *        If you’re mapping a data source to a rule in Config, the <code>keywordValue</code> that you specify
     *        depends on the type of rule:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html"
     *        >managed rules</a>, you can use the rule identifier as the <code>keywordValue</code>. You can find the
     *        rule identifier from the <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html">list of
     *        Config managed rules</a>. For some rules, the rule identifier is different from the rule name. For
     *        example, the rule name <code>restricted-ssh</code> has the following rule identifier:
     *        <code>INCOMING_SSH_DISABLED</code>. Make sure to use the rule identifier, not the rule name.
     *        </p>
     *        <p>
     *        Keyword example for managed rules:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Managed rule name: <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-acl-prohibited.html"
     *        >s3-bucket-acl-prohibited</a>
     *        </p>
     *        <p>
     *        <code>keywordValue</code>: <code>S3_BUCKET_ACL_PROHIBITED</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For <a href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html">
     *        custom rules</a>, you form the <code>keywordValue</code> by adding the <code>Custom_</code> prefix to the
     *        rule name. This prefix distinguishes the custom rule from a managed rule.
     *        </p>
     *        <p>
     *        Keyword example for custom rules:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Custom rule name: my-custom-config-rule
     *        </p>
     *        <p>
     *        <code>keywordValue</code>: <code>Custom_my-custom-config-rule</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/service-linked-awsconfig-rules.html">
     *        service-linked rules</a>, you form the <code>keywordValue</code> by adding the <code>Custom_</code> prefix
     *        to the rule name. In addition, you remove the suffix ID that appears at the end of the rule name.
     *        </p>
     *        <p>
     *        Keyword examples for service-linked rules:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Service-linked rule name: CustomRuleForAccount-conformance-pack-szsm1uv0w
     *        </p>
     *        <p>
     *        <code>keywordValue</code>: <code>Custom_CustomRuleForAccount-conformance-pack</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Service-linked rule name: OrgConfigRule-s3-bucket-versioning-enabled-dbgzf8ba
     *        </p>
     *        <p>
     *        <code>keywordValue</code>: <code>Custom_OrgConfigRule-s3-bucket-versioning-enabled</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        The <code>keywordValue</code> is case sensitive. If you enter a value incorrectly, Audit Manager might not
     *        recognize the data source mapping. As a result, you might not successfully collect evidence from that data
     *        source as intended.
     *        </p>
     *        <p>
     *        Keep in mind the following requirements, depending on the data source type that you're using.
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        For Config:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For managed rules, make sure that the <code>keywordValue</code> is the rule identifier in
     *        <code>ALL_CAPS_WITH_UNDERSCORES</code>. For example, <code>CLOUDWATCH_LOG_GROUP_ENCRYPTED</code>. For
     *        accuracy, we recommend that you reference the list of <a
     *        href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-config.html"
     *        >supported Config managed rules</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For custom rules, make sure that the <code>keywordValue</code> has the <code>Custom_</code> prefix
     *        followed by the custom rule name. The format of the custom rule name itself may vary. For accuracy, we
     *        recommend that you visit the <a href="https://console.aws.amazon.com/config/">Config console</a> to verify
     *        your custom rule name.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For Security Hub: The format varies for Security Hub control names. For accuracy, we recommend that you
     *        reference the list of <a
     *        href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-ash.html">supported
     *        Security Hub controls</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Amazon Web Services API calls: Make sure that the <code>keywordValue</code> is written as
     *        <code>serviceprefix_ActionName</code>. For example, <code>iam_ListGroups</code>. For accuracy, we
     *        recommend that you reference the list of <a
     *        href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-api.html">supported
     *        API calls</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For CloudTrail: Make sure that the <code>keywordValue</code> is written as
     *        <code>serviceprefix_ActionName</code>. For example, <code>cloudtrail_StartLogging</code>. For accuracy, we
     *        recommend that you review the Amazon Web Service prefix and action names in the <a href=
     *        "https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html"
     *        >Service Authorization Reference</a>.
     *        </p>
     *        </li>
     *        </ol>
     */

    public void setKeywordValue(String keywordValue) {
        this.keywordValue = keywordValue;
    }

    /**
     * <p>
     * The value of the keyword that's used when mapping a control data source. For example, this can be a CloudTrail
     * event name, a rule name for Config, a Security Hub control, or the name of an Amazon Web Services API call.
     * </p>
     * <p>
     * If you’re mapping a data source to a rule in Config, the <code>keywordValue</code> that you specify depends on
     * the type of rule:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">managed
     * rules</a>, you can use the rule identifier as the <code>keywordValue</code>. You can find the rule identifier
     * from the <a href="https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html">list
     * of Config managed rules</a>. For some rules, the rule identifier is different from the rule name. For example,
     * the rule name <code>restricted-ssh</code> has the following rule identifier: <code>INCOMING_SSH_DISABLED</code>.
     * Make sure to use the rule identifier, not the rule name.
     * </p>
     * <p>
     * Keyword example for managed rules:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Managed rule name: <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-acl-prohibited.html"
     * >s3-bucket-acl-prohibited</a>
     * </p>
     * <p>
     * <code>keywordValue</code>: <code>S3_BUCKET_ACL_PROHIBITED</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For <a href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html">custom
     * rules</a>, you form the <code>keywordValue</code> by adding the <code>Custom_</code> prefix to the rule name.
     * This prefix distinguishes the custom rule from a managed rule.
     * </p>
     * <p>
     * Keyword example for custom rules:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Custom rule name: my-custom-config-rule
     * </p>
     * <p>
     * <code>keywordValue</code>: <code>Custom_my-custom-config-rule</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/service-linked-awsconfig-rules.html">service
     * -linked rules</a>, you form the <code>keywordValue</code> by adding the <code>Custom_</code> prefix to the rule
     * name. In addition, you remove the suffix ID that appears at the end of the rule name.
     * </p>
     * <p>
     * Keyword examples for service-linked rules:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Service-linked rule name: CustomRuleForAccount-conformance-pack-szsm1uv0w
     * </p>
     * <p>
     * <code>keywordValue</code>: <code>Custom_CustomRuleForAccount-conformance-pack</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Service-linked rule name: OrgConfigRule-s3-bucket-versioning-enabled-dbgzf8ba
     * </p>
     * <p>
     * <code>keywordValue</code>: <code>Custom_OrgConfigRule-s3-bucket-versioning-enabled</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <important>
     * <p>
     * The <code>keywordValue</code> is case sensitive. If you enter a value incorrectly, Audit Manager might not
     * recognize the data source mapping. As a result, you might not successfully collect evidence from that data source
     * as intended.
     * </p>
     * <p>
     * Keep in mind the following requirements, depending on the data source type that you're using.
     * </p>
     * <ol>
     * <li>
     * <p>
     * For Config:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For managed rules, make sure that the <code>keywordValue</code> is the rule identifier in
     * <code>ALL_CAPS_WITH_UNDERSCORES</code>. For example, <code>CLOUDWATCH_LOG_GROUP_ENCRYPTED</code>. For accuracy,
     * we recommend that you reference the list of <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-config.html">supported
     * Config managed rules</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For custom rules, make sure that the <code>keywordValue</code> has the <code>Custom_</code> prefix followed by
     * the custom rule name. The format of the custom rule name itself may vary. For accuracy, we recommend that you
     * visit the <a href="https://console.aws.amazon.com/config/">Config console</a> to verify your custom rule name.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Security Hub: The format varies for Security Hub control names. For accuracy, we recommend that you reference
     * the list of <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-ash.html">supported
     * Security Hub controls</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Web Services API calls: Make sure that the <code>keywordValue</code> is written as
     * <code>serviceprefix_ActionName</code>. For example, <code>iam_ListGroups</code>. For accuracy, we recommend that
     * you reference the list of <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-api.html">supported API
     * calls</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For CloudTrail: Make sure that the <code>keywordValue</code> is written as <code>serviceprefix_ActionName</code>.
     * For example, <code>cloudtrail_StartLogging</code>. For accuracy, we recommend that you review the Amazon Web
     * Service prefix and action names in the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html"
     * >Service Authorization Reference</a>.
     * </p>
     * </li>
     * </ol>
     * </important>
     * 
     * @return The value of the keyword that's used when mapping a control data source. For example, this can be a
     *         CloudTrail event name, a rule name for Config, a Security Hub control, or the name of an Amazon Web
     *         Services API call. </p>
     *         <p>
     *         If you’re mapping a data source to a rule in Config, the <code>keywordValue</code> that you specify
     *         depends on the type of rule:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For <a
     *         href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html"
     *         >managed rules</a>, you can use the rule identifier as the <code>keywordValue</code>. You can find the
     *         rule identifier from the <a
     *         href="https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html">list of
     *         Config managed rules</a>. For some rules, the rule identifier is different from the rule name. For
     *         example, the rule name <code>restricted-ssh</code> has the following rule identifier:
     *         <code>INCOMING_SSH_DISABLED</code>. Make sure to use the rule identifier, not the rule name.
     *         </p>
     *         <p>
     *         Keyword example for managed rules:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Managed rule name: <a
     *         href="https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-acl-prohibited.html"
     *         >s3-bucket-acl-prohibited</a>
     *         </p>
     *         <p>
     *         <code>keywordValue</code>: <code>S3_BUCKET_ACL_PROHIBITED</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         For <a
     *         href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html">custom
     *         rules</a>, you form the <code>keywordValue</code> by adding the <code>Custom_</code> prefix to the rule
     *         name. This prefix distinguishes the custom rule from a managed rule.
     *         </p>
     *         <p>
     *         Keyword example for custom rules:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Custom rule name: my-custom-config-rule
     *         </p>
     *         <p>
     *         <code>keywordValue</code>: <code>Custom_my-custom-config-rule</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         For <a
     *         href="https://docs.aws.amazon.com/config/latest/developerguide/service-linked-awsconfig-rules.html"
     *         >service-linked rules</a>, you form the <code>keywordValue</code> by adding the <code>Custom_</code>
     *         prefix to the rule name. In addition, you remove the suffix ID that appears at the end of the rule name.
     *         </p>
     *         <p>
     *         Keyword examples for service-linked rules:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Service-linked rule name: CustomRuleForAccount-conformance-pack-szsm1uv0w
     *         </p>
     *         <p>
     *         <code>keywordValue</code>: <code>Custom_CustomRuleForAccount-conformance-pack</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Service-linked rule name: OrgConfigRule-s3-bucket-versioning-enabled-dbgzf8ba
     *         </p>
     *         <p>
     *         <code>keywordValue</code>: <code>Custom_OrgConfigRule-s3-bucket-versioning-enabled</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <important>
     *         <p>
     *         The <code>keywordValue</code> is case sensitive. If you enter a value incorrectly, Audit Manager might
     *         not recognize the data source mapping. As a result, you might not successfully collect evidence from that
     *         data source as intended.
     *         </p>
     *         <p>
     *         Keep in mind the following requirements, depending on the data source type that you're using.
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         For Config:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For managed rules, make sure that the <code>keywordValue</code> is the rule identifier in
     *         <code>ALL_CAPS_WITH_UNDERSCORES</code>. For example, <code>CLOUDWATCH_LOG_GROUP_ENCRYPTED</code>. For
     *         accuracy, we recommend that you reference the list of <a
     *         href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-config.html"
     *         >supported Config managed rules</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For custom rules, make sure that the <code>keywordValue</code> has the <code>Custom_</code> prefix
     *         followed by the custom rule name. The format of the custom rule name itself may vary. For accuracy, we
     *         recommend that you visit the <a href="https://console.aws.amazon.com/config/">Config console</a> to
     *         verify your custom rule name.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         For Security Hub: The format varies for Security Hub control names. For accuracy, we recommend that you
     *         reference the list of <a
     *         href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-ash.html">supported
     *         Security Hub controls</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For Amazon Web Services API calls: Make sure that the <code>keywordValue</code> is written as
     *         <code>serviceprefix_ActionName</code>. For example, <code>iam_ListGroups</code>. For accuracy, we
     *         recommend that you reference the list of <a
     *         href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-api.html">supported
     *         API calls</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For CloudTrail: Make sure that the <code>keywordValue</code> is written as
     *         <code>serviceprefix_ActionName</code>. For example, <code>cloudtrail_StartLogging</code>. For accuracy,
     *         we recommend that you review the Amazon Web Service prefix and action names in the <a href=
     *         "https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html"
     *         >Service Authorization Reference</a>.
     *         </p>
     *         </li>
     *         </ol>
     */

    public String getKeywordValue() {
        return this.keywordValue;
    }

    /**
     * <p>
     * The value of the keyword that's used when mapping a control data source. For example, this can be a CloudTrail
     * event name, a rule name for Config, a Security Hub control, or the name of an Amazon Web Services API call.
     * </p>
     * <p>
     * If you’re mapping a data source to a rule in Config, the <code>keywordValue</code> that you specify depends on
     * the type of rule:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">managed
     * rules</a>, you can use the rule identifier as the <code>keywordValue</code>. You can find the rule identifier
     * from the <a href="https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html">list
     * of Config managed rules</a>. For some rules, the rule identifier is different from the rule name. For example,
     * the rule name <code>restricted-ssh</code> has the following rule identifier: <code>INCOMING_SSH_DISABLED</code>.
     * Make sure to use the rule identifier, not the rule name.
     * </p>
     * <p>
     * Keyword example for managed rules:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Managed rule name: <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-acl-prohibited.html"
     * >s3-bucket-acl-prohibited</a>
     * </p>
     * <p>
     * <code>keywordValue</code>: <code>S3_BUCKET_ACL_PROHIBITED</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For <a href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html">custom
     * rules</a>, you form the <code>keywordValue</code> by adding the <code>Custom_</code> prefix to the rule name.
     * This prefix distinguishes the custom rule from a managed rule.
     * </p>
     * <p>
     * Keyword example for custom rules:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Custom rule name: my-custom-config-rule
     * </p>
     * <p>
     * <code>keywordValue</code>: <code>Custom_my-custom-config-rule</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/service-linked-awsconfig-rules.html">service
     * -linked rules</a>, you form the <code>keywordValue</code> by adding the <code>Custom_</code> prefix to the rule
     * name. In addition, you remove the suffix ID that appears at the end of the rule name.
     * </p>
     * <p>
     * Keyword examples for service-linked rules:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Service-linked rule name: CustomRuleForAccount-conformance-pack-szsm1uv0w
     * </p>
     * <p>
     * <code>keywordValue</code>: <code>Custom_CustomRuleForAccount-conformance-pack</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Service-linked rule name: OrgConfigRule-s3-bucket-versioning-enabled-dbgzf8ba
     * </p>
     * <p>
     * <code>keywordValue</code>: <code>Custom_OrgConfigRule-s3-bucket-versioning-enabled</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <important>
     * <p>
     * The <code>keywordValue</code> is case sensitive. If you enter a value incorrectly, Audit Manager might not
     * recognize the data source mapping. As a result, you might not successfully collect evidence from that data source
     * as intended.
     * </p>
     * <p>
     * Keep in mind the following requirements, depending on the data source type that you're using.
     * </p>
     * <ol>
     * <li>
     * <p>
     * For Config:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For managed rules, make sure that the <code>keywordValue</code> is the rule identifier in
     * <code>ALL_CAPS_WITH_UNDERSCORES</code>. For example, <code>CLOUDWATCH_LOG_GROUP_ENCRYPTED</code>. For accuracy,
     * we recommend that you reference the list of <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-config.html">supported
     * Config managed rules</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For custom rules, make sure that the <code>keywordValue</code> has the <code>Custom_</code> prefix followed by
     * the custom rule name. The format of the custom rule name itself may vary. For accuracy, we recommend that you
     * visit the <a href="https://console.aws.amazon.com/config/">Config console</a> to verify your custom rule name.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Security Hub: The format varies for Security Hub control names. For accuracy, we recommend that you reference
     * the list of <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-ash.html">supported
     * Security Hub controls</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Web Services API calls: Make sure that the <code>keywordValue</code> is written as
     * <code>serviceprefix_ActionName</code>. For example, <code>iam_ListGroups</code>. For accuracy, we recommend that
     * you reference the list of <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-api.html">supported API
     * calls</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For CloudTrail: Make sure that the <code>keywordValue</code> is written as <code>serviceprefix_ActionName</code>.
     * For example, <code>cloudtrail_StartLogging</code>. For accuracy, we recommend that you review the Amazon Web
     * Service prefix and action names in the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html"
     * >Service Authorization Reference</a>.
     * </p>
     * </li>
     * </ol>
     * </important>
     * 
     * @param keywordValue
     *        The value of the keyword that's used when mapping a control data source. For example, this can be a
     *        CloudTrail event name, a rule name for Config, a Security Hub control, or the name of an Amazon Web
     *        Services API call. </p>
     *        <p>
     *        If you’re mapping a data source to a rule in Config, the <code>keywordValue</code> that you specify
     *        depends on the type of rule:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html"
     *        >managed rules</a>, you can use the rule identifier as the <code>keywordValue</code>. You can find the
     *        rule identifier from the <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html">list of
     *        Config managed rules</a>. For some rules, the rule identifier is different from the rule name. For
     *        example, the rule name <code>restricted-ssh</code> has the following rule identifier:
     *        <code>INCOMING_SSH_DISABLED</code>. Make sure to use the rule identifier, not the rule name.
     *        </p>
     *        <p>
     *        Keyword example for managed rules:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Managed rule name: <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-acl-prohibited.html"
     *        >s3-bucket-acl-prohibited</a>
     *        </p>
     *        <p>
     *        <code>keywordValue</code>: <code>S3_BUCKET_ACL_PROHIBITED</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For <a href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html">
     *        custom rules</a>, you form the <code>keywordValue</code> by adding the <code>Custom_</code> prefix to the
     *        rule name. This prefix distinguishes the custom rule from a managed rule.
     *        </p>
     *        <p>
     *        Keyword example for custom rules:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Custom rule name: my-custom-config-rule
     *        </p>
     *        <p>
     *        <code>keywordValue</code>: <code>Custom_my-custom-config-rule</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/service-linked-awsconfig-rules.html">
     *        service-linked rules</a>, you form the <code>keywordValue</code> by adding the <code>Custom_</code> prefix
     *        to the rule name. In addition, you remove the suffix ID that appears at the end of the rule name.
     *        </p>
     *        <p>
     *        Keyword examples for service-linked rules:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Service-linked rule name: CustomRuleForAccount-conformance-pack-szsm1uv0w
     *        </p>
     *        <p>
     *        <code>keywordValue</code>: <code>Custom_CustomRuleForAccount-conformance-pack</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Service-linked rule name: OrgConfigRule-s3-bucket-versioning-enabled-dbgzf8ba
     *        </p>
     *        <p>
     *        <code>keywordValue</code>: <code>Custom_OrgConfigRule-s3-bucket-versioning-enabled</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        The <code>keywordValue</code> is case sensitive. If you enter a value incorrectly, Audit Manager might not
     *        recognize the data source mapping. As a result, you might not successfully collect evidence from that data
     *        source as intended.
     *        </p>
     *        <p>
     *        Keep in mind the following requirements, depending on the data source type that you're using.
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        For Config:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For managed rules, make sure that the <code>keywordValue</code> is the rule identifier in
     *        <code>ALL_CAPS_WITH_UNDERSCORES</code>. For example, <code>CLOUDWATCH_LOG_GROUP_ENCRYPTED</code>. For
     *        accuracy, we recommend that you reference the list of <a
     *        href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-config.html"
     *        >supported Config managed rules</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For custom rules, make sure that the <code>keywordValue</code> has the <code>Custom_</code> prefix
     *        followed by the custom rule name. The format of the custom rule name itself may vary. For accuracy, we
     *        recommend that you visit the <a href="https://console.aws.amazon.com/config/">Config console</a> to verify
     *        your custom rule name.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For Security Hub: The format varies for Security Hub control names. For accuracy, we recommend that you
     *        reference the list of <a
     *        href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-ash.html">supported
     *        Security Hub controls</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Amazon Web Services API calls: Make sure that the <code>keywordValue</code> is written as
     *        <code>serviceprefix_ActionName</code>. For example, <code>iam_ListGroups</code>. For accuracy, we
     *        recommend that you reference the list of <a
     *        href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-api.html">supported
     *        API calls</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For CloudTrail: Make sure that the <code>keywordValue</code> is written as
     *        <code>serviceprefix_ActionName</code>. For example, <code>cloudtrail_StartLogging</code>. For accuracy, we
     *        recommend that you review the Amazon Web Service prefix and action names in the <a href=
     *        "https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html"
     *        >Service Authorization Reference</a>.
     *        </p>
     *        </li>
     *        </ol>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceKeyword withKeywordValue(String keywordValue) {
        setKeywordValue(keywordValue);
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
        if (getKeywordInputType() != null)
            sb.append("KeywordInputType: ").append(getKeywordInputType()).append(",");
        if (getKeywordValue() != null)
            sb.append("KeywordValue: ").append(getKeywordValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceKeyword == false)
            return false;
        SourceKeyword other = (SourceKeyword) obj;
        if (other.getKeywordInputType() == null ^ this.getKeywordInputType() == null)
            return false;
        if (other.getKeywordInputType() != null && other.getKeywordInputType().equals(this.getKeywordInputType()) == false)
            return false;
        if (other.getKeywordValue() == null ^ this.getKeywordValue() == null)
            return false;
        if (other.getKeywordValue() != null && other.getKeywordValue().equals(this.getKeywordValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeywordInputType() == null) ? 0 : getKeywordInputType().hashCode());
        hashCode = prime * hashCode + ((getKeywordValue() == null) ? 0 : getKeywordValue().hashCode());
        return hashCode;
    }

    @Override
    public SourceKeyword clone() {
        try {
            return (SourceKeyword) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.SourceKeywordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
