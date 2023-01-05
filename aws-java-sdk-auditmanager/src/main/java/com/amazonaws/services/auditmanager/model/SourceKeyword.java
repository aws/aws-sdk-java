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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The keyword to search for in CloudTrail logs, Config rules, Security Hub checks, and Amazon Web Services API names.
 * </p>
 * <p>
 * To learn more about the supported keywords that you can use when mapping a control data source, see the following
 * pages in the <i>Audit Manager User Guide</i>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-ash.html">Config rules
 * supported by Audit Manager</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/audit-manager/latest/userguide/control-data-sources-config.html">Security Hub
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
     * of Config managed rules</a>.
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
     * This prefix distinguishes the rule from a managed rule.
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
     */
    private String keywordValue;

    /**
     * <p>
     * The input method for the keyword.
     * </p>
     * 
     * @param keywordInputType
     *        The input method for the keyword.
     * @see KeywordInputType
     */

    public void setKeywordInputType(String keywordInputType) {
        this.keywordInputType = keywordInputType;
    }

    /**
     * <p>
     * The input method for the keyword.
     * </p>
     * 
     * @return The input method for the keyword.
     * @see KeywordInputType
     */

    public String getKeywordInputType() {
        return this.keywordInputType;
    }

    /**
     * <p>
     * The input method for the keyword.
     * </p>
     * 
     * @param keywordInputType
     *        The input method for the keyword.
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
     * 
     * @param keywordInputType
     *        The input method for the keyword.
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
     * of Config managed rules</a>.
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
     * This prefix distinguishes the rule from a managed rule.
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
     *        Config managed rules</a>.
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
     *        rule name. This prefix distinguishes the rule from a managed rule.
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
     * of Config managed rules</a>.
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
     * This prefix distinguishes the rule from a managed rule.
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
     *         Config managed rules</a>.
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
     *         name. This prefix distinguishes the rule from a managed rule.
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
     * of Config managed rules</a>.
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
     * This prefix distinguishes the rule from a managed rule.
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
     *        Config managed rules</a>.
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
     *        rule name. This prefix distinguishes the rule from a managed rule.
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
