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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the configuration information to connect to Slack as your data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/SlackConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlackConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the team in the Slack workspace. For example, <i>T0123456789</i>.
     * </p>
     * <p>
     * You can find your team ID in the URL of the main page of your Slack workspace. When you log in to Slack via a
     * browser, you are directed to the URL of the main page. For example,
     * <i>https://app.slack.com/client/<b>T0123456789</b>/...</i>.
     * </p>
     */
    private String teamId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to connect
     * to your Slack workspace team. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * slackToken—The user or bot token created in Slack. For more information on creating a token in Slack, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-slack.html#slack-authentication">Authentication
     * for a Slack data source</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String secretArn;
    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud to connect to your Slack. For more information, see
     * <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     * </p>
     */
    private DataSourceVpcConfiguration vpcConfiguration;
    /**
     * <p>
     * Specify whether to index public channels, private channels, group messages, and direct messages. You can specify
     * one or more of these options.
     * </p>
     */
    private java.util.List<String> slackEntityList;
    /**
     * <p>
     * <code>TRUE</code> to use the Slack change log to determine which documents require updating in the index.
     * Depending on the Slack change log's size, it may take longer for Amazon Kendra to use the change log than to scan
     * all of your documents in Slack.
     * </p>
     */
    private Boolean useChangeLog;
    /**
     * <p>
     * <code>TRUE</code> to index bot messages from your Slack workspace team.
     * </p>
     */
    private Boolean crawlBotMessage;
    /**
     * <p>
     * <code>TRUE</code> to exclude archived messages to index from your Slack workspace team.
     * </p>
     */
    private Boolean excludeArchived;
    /**
     * <p>
     * The date to start crawling your data from your Slack workspace team. The date must follow this format:
     * <code>yyyy-mm-dd</code>.
     * </p>
     */
    private String sinceCrawlDate;
    /**
     * <p>
     * The number of hours for change log to look back from when you last synchronized your data. You can look back up
     * to 7 days or 168 hours.
     * </p>
     * <p>
     * Change log updates your index only if new content was added since you last synced your data. Updated or deleted
     * content from before you last synced does not get updated in your index. To capture updated or deleted content
     * before you last synced, set the <code>LookBackPeriod</code> to the number of hours you want change log to look
     * back.
     * </p>
     */
    private Integer lookBackPeriod;
    /**
     * <p>
     * The list of private channel names from your Slack workspace team. You use this if you want to index specific
     * private channels, not all private channels. You can also use regular expression patterns to filter private
     * channels.
     * </p>
     */
    private java.util.List<String> privateChannelFilter;
    /**
     * <p>
     * The list of public channel names to index from your Slack workspace team. You use this if you want to index
     * specific public channels, not all public channels. You can also use regular expression patterns to filter public
     * channels.
     * </p>
     */
    private java.util.List<String> publicChannelFilter;
    /**
     * <p>
     * A list of regular expression patterns to include certain attached files in your Slack workspace team. Files that
     * match the patterns are included in the index. Files that don't match the patterns are excluded from the index. If
     * a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't
     * included in the index.
     * </p>
     */
    private java.util.List<String> inclusionPatterns;
    /**
     * <p>
     * A list of regular expression patterns to exclude certain attached files in your Slack workspace team. Files that
     * match the patterns are excluded from the index. Files that don’t match the patterns are included in the index. If
     * a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't
     * included in the index.
     * </p>
     */
    private java.util.List<String> exclusionPatterns;
    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map Slack data source attributes or field names
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Slack fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Slack
     * data source field names must exist in your Slack custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> fieldMappings;

    /**
     * <p>
     * The identifier of the team in the Slack workspace. For example, <i>T0123456789</i>.
     * </p>
     * <p>
     * You can find your team ID in the URL of the main page of your Slack workspace. When you log in to Slack via a
     * browser, you are directed to the URL of the main page. For example,
     * <i>https://app.slack.com/client/<b>T0123456789</b>/...</i>.
     * </p>
     * 
     * @param teamId
     *        The identifier of the team in the Slack workspace. For example, <i>T0123456789</i>.</p>
     *        <p>
     *        You can find your team ID in the URL of the main page of your Slack workspace. When you log in to Slack
     *        via a browser, you are directed to the URL of the main page. For example,
     *        <i>https://app.slack.com/client/<b>T0123456789</b>/...</i>.
     */

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    /**
     * <p>
     * The identifier of the team in the Slack workspace. For example, <i>T0123456789</i>.
     * </p>
     * <p>
     * You can find your team ID in the URL of the main page of your Slack workspace. When you log in to Slack via a
     * browser, you are directed to the URL of the main page. For example,
     * <i>https://app.slack.com/client/<b>T0123456789</b>/...</i>.
     * </p>
     * 
     * @return The identifier of the team in the Slack workspace. For example, <i>T0123456789</i>.</p>
     *         <p>
     *         You can find your team ID in the URL of the main page of your Slack workspace. When you log in to Slack
     *         via a browser, you are directed to the URL of the main page. For example,
     *         <i>https://app.slack.com/client/<b>T0123456789</b>/...</i>.
     */

    public String getTeamId() {
        return this.teamId;
    }

    /**
     * <p>
     * The identifier of the team in the Slack workspace. For example, <i>T0123456789</i>.
     * </p>
     * <p>
     * You can find your team ID in the URL of the main page of your Slack workspace. When you log in to Slack via a
     * browser, you are directed to the URL of the main page. For example,
     * <i>https://app.slack.com/client/<b>T0123456789</b>/...</i>.
     * </p>
     * 
     * @param teamId
     *        The identifier of the team in the Slack workspace. For example, <i>T0123456789</i>.</p>
     *        <p>
     *        You can find your team ID in the URL of the main page of your Slack workspace. When you log in to Slack
     *        via a browser, you are directed to the URL of the main page. For example,
     *        <i>https://app.slack.com/client/<b>T0123456789</b>/...</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackConfiguration withTeamId(String teamId) {
        setTeamId(teamId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to connect
     * to your Slack workspace team. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * slackToken—The user or bot token created in Slack. For more information on creating a token in Slack, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-slack.html#slack-authentication">Authentication
     * for a Slack data source</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to
     *        connect to your Slack workspace team. The secret must contain a JSON structure with the following
     *        keys:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        slackToken—The user or bot token created in Slack. For more information on creating a token in Slack, see
     *        <a href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-slack.html#slack-authentication">
     *        Authentication for a Slack data source</a>.
     *        </p>
     *        </li>
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to connect
     * to your Slack workspace team. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * slackToken—The user or bot token created in Slack. For more information on creating a token in Slack, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-slack.html#slack-authentication">Authentication
     * for a Slack data source</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to
     *         connect to your Slack workspace team. The secret must contain a JSON structure with the following
     *         keys:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         slackToken—The user or bot token created in Slack. For more information on creating a token in Slack, see
     *         <a href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-slack.html#slack-authentication">
     *         Authentication for a Slack data source</a>.
     *         </p>
     *         </li>
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to connect
     * to your Slack workspace team. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * slackToken—The user or bot token created in Slack. For more information on creating a token in Slack, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-slack.html#slack-authentication">Authentication
     * for a Slack data source</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to
     *        connect to your Slack workspace team. The secret must contain a JSON structure with the following
     *        keys:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        slackToken—The user or bot token created in Slack. For more information on creating a token in Slack, see
     *        <a href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-slack.html#slack-authentication">
     *        Authentication for a Slack data source</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackConfiguration withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud to connect to your Slack. For more information, see
     * <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     * </p>
     * 
     * @param vpcConfiguration
     *        Configuration information for an Amazon Virtual Private Cloud to connect to your Slack. For more
     *        information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring
     *        a VPC</a>.
     */

    public void setVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud to connect to your Slack. For more information, see
     * <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     * </p>
     * 
     * @return Configuration information for an Amazon Virtual Private Cloud to connect to your Slack. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     */

    public DataSourceVpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud to connect to your Slack. For more information, see
     * <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     * </p>
     * 
     * @param vpcConfiguration
     *        Configuration information for an Amazon Virtual Private Cloud to connect to your Slack. For more
     *        information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring
     *        a VPC</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackConfiguration withVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
        return this;
    }

    /**
     * <p>
     * Specify whether to index public channels, private channels, group messages, and direct messages. You can specify
     * one or more of these options.
     * </p>
     * 
     * @return Specify whether to index public channels, private channels, group messages, and direct messages. You can
     *         specify one or more of these options.
     * @see SlackEntity
     */

    public java.util.List<String> getSlackEntityList() {
        return slackEntityList;
    }

    /**
     * <p>
     * Specify whether to index public channels, private channels, group messages, and direct messages. You can specify
     * one or more of these options.
     * </p>
     * 
     * @param slackEntityList
     *        Specify whether to index public channels, private channels, group messages, and direct messages. You can
     *        specify one or more of these options.
     * @see SlackEntity
     */

    public void setSlackEntityList(java.util.Collection<String> slackEntityList) {
        if (slackEntityList == null) {
            this.slackEntityList = null;
            return;
        }

        this.slackEntityList = new java.util.ArrayList<String>(slackEntityList);
    }

    /**
     * <p>
     * Specify whether to index public channels, private channels, group messages, and direct messages. You can specify
     * one or more of these options.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSlackEntityList(java.util.Collection)} or {@link #withSlackEntityList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param slackEntityList
     *        Specify whether to index public channels, private channels, group messages, and direct messages. You can
     *        specify one or more of these options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SlackEntity
     */

    public SlackConfiguration withSlackEntityList(String... slackEntityList) {
        if (this.slackEntityList == null) {
            setSlackEntityList(new java.util.ArrayList<String>(slackEntityList.length));
        }
        for (String ele : slackEntityList) {
            this.slackEntityList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify whether to index public channels, private channels, group messages, and direct messages. You can specify
     * one or more of these options.
     * </p>
     * 
     * @param slackEntityList
     *        Specify whether to index public channels, private channels, group messages, and direct messages. You can
     *        specify one or more of these options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SlackEntity
     */

    public SlackConfiguration withSlackEntityList(java.util.Collection<String> slackEntityList) {
        setSlackEntityList(slackEntityList);
        return this;
    }

    /**
     * <p>
     * Specify whether to index public channels, private channels, group messages, and direct messages. You can specify
     * one or more of these options.
     * </p>
     * 
     * @param slackEntityList
     *        Specify whether to index public channels, private channels, group messages, and direct messages. You can
     *        specify one or more of these options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SlackEntity
     */

    public SlackConfiguration withSlackEntityList(SlackEntity... slackEntityList) {
        java.util.ArrayList<String> slackEntityListCopy = new java.util.ArrayList<String>(slackEntityList.length);
        for (SlackEntity value : slackEntityList) {
            slackEntityListCopy.add(value.toString());
        }
        if (getSlackEntityList() == null) {
            setSlackEntityList(slackEntityListCopy);
        } else {
            getSlackEntityList().addAll(slackEntityListCopy);
        }
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to use the Slack change log to determine which documents require updating in the index.
     * Depending on the Slack change log's size, it may take longer for Amazon Kendra to use the change log than to scan
     * all of your documents in Slack.
     * </p>
     * 
     * @param useChangeLog
     *        <code>TRUE</code> to use the Slack change log to determine which documents require updating in the index.
     *        Depending on the Slack change log's size, it may take longer for Amazon Kendra to use the change log than
     *        to scan all of your documents in Slack.
     */

    public void setUseChangeLog(Boolean useChangeLog) {
        this.useChangeLog = useChangeLog;
    }

    /**
     * <p>
     * <code>TRUE</code> to use the Slack change log to determine which documents require updating in the index.
     * Depending on the Slack change log's size, it may take longer for Amazon Kendra to use the change log than to scan
     * all of your documents in Slack.
     * </p>
     * 
     * @return <code>TRUE</code> to use the Slack change log to determine which documents require updating in the index.
     *         Depending on the Slack change log's size, it may take longer for Amazon Kendra to use the change log than
     *         to scan all of your documents in Slack.
     */

    public Boolean getUseChangeLog() {
        return this.useChangeLog;
    }

    /**
     * <p>
     * <code>TRUE</code> to use the Slack change log to determine which documents require updating in the index.
     * Depending on the Slack change log's size, it may take longer for Amazon Kendra to use the change log than to scan
     * all of your documents in Slack.
     * </p>
     * 
     * @param useChangeLog
     *        <code>TRUE</code> to use the Slack change log to determine which documents require updating in the index.
     *        Depending on the Slack change log's size, it may take longer for Amazon Kendra to use the change log than
     *        to scan all of your documents in Slack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackConfiguration withUseChangeLog(Boolean useChangeLog) {
        setUseChangeLog(useChangeLog);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to use the Slack change log to determine which documents require updating in the index.
     * Depending on the Slack change log's size, it may take longer for Amazon Kendra to use the change log than to scan
     * all of your documents in Slack.
     * </p>
     * 
     * @return <code>TRUE</code> to use the Slack change log to determine which documents require updating in the index.
     *         Depending on the Slack change log's size, it may take longer for Amazon Kendra to use the change log than
     *         to scan all of your documents in Slack.
     */

    public Boolean isUseChangeLog() {
        return this.useChangeLog;
    }

    /**
     * <p>
     * <code>TRUE</code> to index bot messages from your Slack workspace team.
     * </p>
     * 
     * @param crawlBotMessage
     *        <code>TRUE</code> to index bot messages from your Slack workspace team.
     */

    public void setCrawlBotMessage(Boolean crawlBotMessage) {
        this.crawlBotMessage = crawlBotMessage;
    }

    /**
     * <p>
     * <code>TRUE</code> to index bot messages from your Slack workspace team.
     * </p>
     * 
     * @return <code>TRUE</code> to index bot messages from your Slack workspace team.
     */

    public Boolean getCrawlBotMessage() {
        return this.crawlBotMessage;
    }

    /**
     * <p>
     * <code>TRUE</code> to index bot messages from your Slack workspace team.
     * </p>
     * 
     * @param crawlBotMessage
     *        <code>TRUE</code> to index bot messages from your Slack workspace team.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackConfiguration withCrawlBotMessage(Boolean crawlBotMessage) {
        setCrawlBotMessage(crawlBotMessage);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to index bot messages from your Slack workspace team.
     * </p>
     * 
     * @return <code>TRUE</code> to index bot messages from your Slack workspace team.
     */

    public Boolean isCrawlBotMessage() {
        return this.crawlBotMessage;
    }

    /**
     * <p>
     * <code>TRUE</code> to exclude archived messages to index from your Slack workspace team.
     * </p>
     * 
     * @param excludeArchived
     *        <code>TRUE</code> to exclude archived messages to index from your Slack workspace team.
     */

    public void setExcludeArchived(Boolean excludeArchived) {
        this.excludeArchived = excludeArchived;
    }

    /**
     * <p>
     * <code>TRUE</code> to exclude archived messages to index from your Slack workspace team.
     * </p>
     * 
     * @return <code>TRUE</code> to exclude archived messages to index from your Slack workspace team.
     */

    public Boolean getExcludeArchived() {
        return this.excludeArchived;
    }

    /**
     * <p>
     * <code>TRUE</code> to exclude archived messages to index from your Slack workspace team.
     * </p>
     * 
     * @param excludeArchived
     *        <code>TRUE</code> to exclude archived messages to index from your Slack workspace team.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackConfiguration withExcludeArchived(Boolean excludeArchived) {
        setExcludeArchived(excludeArchived);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to exclude archived messages to index from your Slack workspace team.
     * </p>
     * 
     * @return <code>TRUE</code> to exclude archived messages to index from your Slack workspace team.
     */

    public Boolean isExcludeArchived() {
        return this.excludeArchived;
    }

    /**
     * <p>
     * The date to start crawling your data from your Slack workspace team. The date must follow this format:
     * <code>yyyy-mm-dd</code>.
     * </p>
     * 
     * @param sinceCrawlDate
     *        The date to start crawling your data from your Slack workspace team. The date must follow this format:
     *        <code>yyyy-mm-dd</code>.
     */

    public void setSinceCrawlDate(String sinceCrawlDate) {
        this.sinceCrawlDate = sinceCrawlDate;
    }

    /**
     * <p>
     * The date to start crawling your data from your Slack workspace team. The date must follow this format:
     * <code>yyyy-mm-dd</code>.
     * </p>
     * 
     * @return The date to start crawling your data from your Slack workspace team. The date must follow this format:
     *         <code>yyyy-mm-dd</code>.
     */

    public String getSinceCrawlDate() {
        return this.sinceCrawlDate;
    }

    /**
     * <p>
     * The date to start crawling your data from your Slack workspace team. The date must follow this format:
     * <code>yyyy-mm-dd</code>.
     * </p>
     * 
     * @param sinceCrawlDate
     *        The date to start crawling your data from your Slack workspace team. The date must follow this format:
     *        <code>yyyy-mm-dd</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackConfiguration withSinceCrawlDate(String sinceCrawlDate) {
        setSinceCrawlDate(sinceCrawlDate);
        return this;
    }

    /**
     * <p>
     * The number of hours for change log to look back from when you last synchronized your data. You can look back up
     * to 7 days or 168 hours.
     * </p>
     * <p>
     * Change log updates your index only if new content was added since you last synced your data. Updated or deleted
     * content from before you last synced does not get updated in your index. To capture updated or deleted content
     * before you last synced, set the <code>LookBackPeriod</code> to the number of hours you want change log to look
     * back.
     * </p>
     * 
     * @param lookBackPeriod
     *        The number of hours for change log to look back from when you last synchronized your data. You can look
     *        back up to 7 days or 168 hours.</p>
     *        <p>
     *        Change log updates your index only if new content was added since you last synced your data. Updated or
     *        deleted content from before you last synced does not get updated in your index. To capture updated or
     *        deleted content before you last synced, set the <code>LookBackPeriod</code> to the number of hours you
     *        want change log to look back.
     */

    public void setLookBackPeriod(Integer lookBackPeriod) {
        this.lookBackPeriod = lookBackPeriod;
    }

    /**
     * <p>
     * The number of hours for change log to look back from when you last synchronized your data. You can look back up
     * to 7 days or 168 hours.
     * </p>
     * <p>
     * Change log updates your index only if new content was added since you last synced your data. Updated or deleted
     * content from before you last synced does not get updated in your index. To capture updated or deleted content
     * before you last synced, set the <code>LookBackPeriod</code> to the number of hours you want change log to look
     * back.
     * </p>
     * 
     * @return The number of hours for change log to look back from when you last synchronized your data. You can look
     *         back up to 7 days or 168 hours.</p>
     *         <p>
     *         Change log updates your index only if new content was added since you last synced your data. Updated or
     *         deleted content from before you last synced does not get updated in your index. To capture updated or
     *         deleted content before you last synced, set the <code>LookBackPeriod</code> to the number of hours you
     *         want change log to look back.
     */

    public Integer getLookBackPeriod() {
        return this.lookBackPeriod;
    }

    /**
     * <p>
     * The number of hours for change log to look back from when you last synchronized your data. You can look back up
     * to 7 days or 168 hours.
     * </p>
     * <p>
     * Change log updates your index only if new content was added since you last synced your data. Updated or deleted
     * content from before you last synced does not get updated in your index. To capture updated or deleted content
     * before you last synced, set the <code>LookBackPeriod</code> to the number of hours you want change log to look
     * back.
     * </p>
     * 
     * @param lookBackPeriod
     *        The number of hours for change log to look back from when you last synchronized your data. You can look
     *        back up to 7 days or 168 hours.</p>
     *        <p>
     *        Change log updates your index only if new content was added since you last synced your data. Updated or
     *        deleted content from before you last synced does not get updated in your index. To capture updated or
     *        deleted content before you last synced, set the <code>LookBackPeriod</code> to the number of hours you
     *        want change log to look back.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackConfiguration withLookBackPeriod(Integer lookBackPeriod) {
        setLookBackPeriod(lookBackPeriod);
        return this;
    }

    /**
     * <p>
     * The list of private channel names from your Slack workspace team. You use this if you want to index specific
     * private channels, not all private channels. You can also use regular expression patterns to filter private
     * channels.
     * </p>
     * 
     * @return The list of private channel names from your Slack workspace team. You use this if you want to index
     *         specific private channels, not all private channels. You can also use regular expression patterns to
     *         filter private channels.
     */

    public java.util.List<String> getPrivateChannelFilter() {
        return privateChannelFilter;
    }

    /**
     * <p>
     * The list of private channel names from your Slack workspace team. You use this if you want to index specific
     * private channels, not all private channels. You can also use regular expression patterns to filter private
     * channels.
     * </p>
     * 
     * @param privateChannelFilter
     *        The list of private channel names from your Slack workspace team. You use this if you want to index
     *        specific private channels, not all private channels. You can also use regular expression patterns to
     *        filter private channels.
     */

    public void setPrivateChannelFilter(java.util.Collection<String> privateChannelFilter) {
        if (privateChannelFilter == null) {
            this.privateChannelFilter = null;
            return;
        }

        this.privateChannelFilter = new java.util.ArrayList<String>(privateChannelFilter);
    }

    /**
     * <p>
     * The list of private channel names from your Slack workspace team. You use this if you want to index specific
     * private channels, not all private channels. You can also use regular expression patterns to filter private
     * channels.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrivateChannelFilter(java.util.Collection)} or {@link #withPrivateChannelFilter(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param privateChannelFilter
     *        The list of private channel names from your Slack workspace team. You use this if you want to index
     *        specific private channels, not all private channels. You can also use regular expression patterns to
     *        filter private channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackConfiguration withPrivateChannelFilter(String... privateChannelFilter) {
        if (this.privateChannelFilter == null) {
            setPrivateChannelFilter(new java.util.ArrayList<String>(privateChannelFilter.length));
        }
        for (String ele : privateChannelFilter) {
            this.privateChannelFilter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of private channel names from your Slack workspace team. You use this if you want to index specific
     * private channels, not all private channels. You can also use regular expression patterns to filter private
     * channels.
     * </p>
     * 
     * @param privateChannelFilter
     *        The list of private channel names from your Slack workspace team. You use this if you want to index
     *        specific private channels, not all private channels. You can also use regular expression patterns to
     *        filter private channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackConfiguration withPrivateChannelFilter(java.util.Collection<String> privateChannelFilter) {
        setPrivateChannelFilter(privateChannelFilter);
        return this;
    }

    /**
     * <p>
     * The list of public channel names to index from your Slack workspace team. You use this if you want to index
     * specific public channels, not all public channels. You can also use regular expression patterns to filter public
     * channels.
     * </p>
     * 
     * @return The list of public channel names to index from your Slack workspace team. You use this if you want to
     *         index specific public channels, not all public channels. You can also use regular expression patterns to
     *         filter public channels.
     */

    public java.util.List<String> getPublicChannelFilter() {
        return publicChannelFilter;
    }

    /**
     * <p>
     * The list of public channel names to index from your Slack workspace team. You use this if you want to index
     * specific public channels, not all public channels. You can also use regular expression patterns to filter public
     * channels.
     * </p>
     * 
     * @param publicChannelFilter
     *        The list of public channel names to index from your Slack workspace team. You use this if you want to
     *        index specific public channels, not all public channels. You can also use regular expression patterns to
     *        filter public channels.
     */

    public void setPublicChannelFilter(java.util.Collection<String> publicChannelFilter) {
        if (publicChannelFilter == null) {
            this.publicChannelFilter = null;
            return;
        }

        this.publicChannelFilter = new java.util.ArrayList<String>(publicChannelFilter);
    }

    /**
     * <p>
     * The list of public channel names to index from your Slack workspace team. You use this if you want to index
     * specific public channels, not all public channels. You can also use regular expression patterns to filter public
     * channels.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPublicChannelFilter(java.util.Collection)} or {@link #withPublicChannelFilter(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param publicChannelFilter
     *        The list of public channel names to index from your Slack workspace team. You use this if you want to
     *        index specific public channels, not all public channels. You can also use regular expression patterns to
     *        filter public channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackConfiguration withPublicChannelFilter(String... publicChannelFilter) {
        if (this.publicChannelFilter == null) {
            setPublicChannelFilter(new java.util.ArrayList<String>(publicChannelFilter.length));
        }
        for (String ele : publicChannelFilter) {
            this.publicChannelFilter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of public channel names to index from your Slack workspace team. You use this if you want to index
     * specific public channels, not all public channels. You can also use regular expression patterns to filter public
     * channels.
     * </p>
     * 
     * @param publicChannelFilter
     *        The list of public channel names to index from your Slack workspace team. You use this if you want to
     *        index specific public channels, not all public channels. You can also use regular expression patterns to
     *        filter public channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackConfiguration withPublicChannelFilter(java.util.Collection<String> publicChannelFilter) {
        setPublicChannelFilter(publicChannelFilter);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain attached files in your Slack workspace team. Files that
     * match the patterns are included in the index. Files that don't match the patterns are excluded from the index. If
     * a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't
     * included in the index.
     * </p>
     * 
     * @return A list of regular expression patterns to include certain attached files in your Slack workspace team.
     *         Files that match the patterns are included in the index. Files that don't match the patterns are excluded
     *         from the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *         precedence and the file isn't included in the index.
     */

    public java.util.List<String> getInclusionPatterns() {
        return inclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain attached files in your Slack workspace team. Files that
     * match the patterns are included in the index. Files that don't match the patterns are excluded from the index. If
     * a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't
     * included in the index.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain attached files in your Slack workspace team.
     *        Files that match the patterns are included in the index. Files that don't match the patterns are excluded
     *        from the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *        precedence and the file isn't included in the index.
     */

    public void setInclusionPatterns(java.util.Collection<String> inclusionPatterns) {
        if (inclusionPatterns == null) {
            this.inclusionPatterns = null;
            return;
        }

        this.inclusionPatterns = new java.util.ArrayList<String>(inclusionPatterns);
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain attached files in your Slack workspace team. Files that
     * match the patterns are included in the index. Files that don't match the patterns are excluded from the index. If
     * a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't
     * included in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclusionPatterns(java.util.Collection)} or {@link #withInclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain attached files in your Slack workspace team.
     *        Files that match the patterns are included in the index. Files that don't match the patterns are excluded
     *        from the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *        precedence and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackConfiguration withInclusionPatterns(String... inclusionPatterns) {
        if (this.inclusionPatterns == null) {
            setInclusionPatterns(new java.util.ArrayList<String>(inclusionPatterns.length));
        }
        for (String ele : inclusionPatterns) {
            this.inclusionPatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain attached files in your Slack workspace team. Files that
     * match the patterns are included in the index. Files that don't match the patterns are excluded from the index. If
     * a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't
     * included in the index.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain attached files in your Slack workspace team.
     *        Files that match the patterns are included in the index. Files that don't match the patterns are excluded
     *        from the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *        precedence and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackConfiguration withInclusionPatterns(java.util.Collection<String> inclusionPatterns) {
        setInclusionPatterns(inclusionPatterns);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain attached files in your Slack workspace team. Files that
     * match the patterns are excluded from the index. Files that don’t match the patterns are included in the index. If
     * a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't
     * included in the index.
     * </p>
     * 
     * @return A list of regular expression patterns to exclude certain attached files in your Slack workspace team.
     *         Files that match the patterns are excluded from the index. Files that don’t match the patterns are
     *         included in the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern
     *         takes precedence and the file isn't included in the index.
     */

    public java.util.List<String> getExclusionPatterns() {
        return exclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain attached files in your Slack workspace team. Files that
     * match the patterns are excluded from the index. Files that don’t match the patterns are included in the index. If
     * a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't
     * included in the index.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain attached files in your Slack workspace team.
     *        Files that match the patterns are excluded from the index. Files that don’t match the patterns are
     *        included in the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern
     *        takes precedence and the file isn't included in the index.
     */

    public void setExclusionPatterns(java.util.Collection<String> exclusionPatterns) {
        if (exclusionPatterns == null) {
            this.exclusionPatterns = null;
            return;
        }

        this.exclusionPatterns = new java.util.ArrayList<String>(exclusionPatterns);
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain attached files in your Slack workspace team. Files that
     * match the patterns are excluded from the index. Files that don’t match the patterns are included in the index. If
     * a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't
     * included in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclusionPatterns(java.util.Collection)} or {@link #withExclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain attached files in your Slack workspace team.
     *        Files that match the patterns are excluded from the index. Files that don’t match the patterns are
     *        included in the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern
     *        takes precedence and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackConfiguration withExclusionPatterns(String... exclusionPatterns) {
        if (this.exclusionPatterns == null) {
            setExclusionPatterns(new java.util.ArrayList<String>(exclusionPatterns.length));
        }
        for (String ele : exclusionPatterns) {
            this.exclusionPatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain attached files in your Slack workspace team. Files that
     * match the patterns are excluded from the index. Files that don’t match the patterns are included in the index. If
     * a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't
     * included in the index.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain attached files in your Slack workspace team.
     *        Files that match the patterns are excluded from the index. Files that don’t match the patterns are
     *        included in the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern
     *        takes precedence and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackConfiguration withExclusionPatterns(java.util.Collection<String> exclusionPatterns) {
        setExclusionPatterns(exclusionPatterns);
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map Slack data source attributes or field names
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Slack fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Slack
     * data source field names must exist in your Slack custom metadata.
     * </p>
     * 
     * @return A list of <code>DataSourceToIndexFieldMapping</code> objects that map Slack data source attributes or
     *         field names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     *         API before you map to Slack fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>.
     *         The Slack data source field names must exist in your Slack custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return fieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map Slack data source attributes or field names
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Slack fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Slack
     * data source field names must exist in your Slack custom metadata.
     * </p>
     * 
     * @param fieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map Slack data source attributes or
     *        field names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     *        API before you map to Slack fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Slack data source field names must exist in your Slack custom metadata.
     */

    public void setFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        if (fieldMappings == null) {
            this.fieldMappings = null;
            return;
        }

        this.fieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(fieldMappings);
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map Slack data source attributes or field names
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Slack fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Slack
     * data source field names must exist in your Slack custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldMappings(java.util.Collection)} or {@link #withFieldMappings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param fieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map Slack data source attributes or
     *        field names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     *        API before you map to Slack fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Slack data source field names must exist in your Slack custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackConfiguration withFieldMappings(DataSourceToIndexFieldMapping... fieldMappings) {
        if (this.fieldMappings == null) {
            setFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(fieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : fieldMappings) {
            this.fieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map Slack data source attributes or field names
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Slack fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Slack
     * data source field names must exist in your Slack custom metadata.
     * </p>
     * 
     * @param fieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map Slack data source attributes or
     *        field names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     *        API before you map to Slack fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Slack data source field names must exist in your Slack custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackConfiguration withFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        setFieldMappings(fieldMappings);
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
        if (getTeamId() != null)
            sb.append("TeamId: ").append(getTeamId()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration()).append(",");
        if (getSlackEntityList() != null)
            sb.append("SlackEntityList: ").append(getSlackEntityList()).append(",");
        if (getUseChangeLog() != null)
            sb.append("UseChangeLog: ").append(getUseChangeLog()).append(",");
        if (getCrawlBotMessage() != null)
            sb.append("CrawlBotMessage: ").append(getCrawlBotMessage()).append(",");
        if (getExcludeArchived() != null)
            sb.append("ExcludeArchived: ").append(getExcludeArchived()).append(",");
        if (getSinceCrawlDate() != null)
            sb.append("SinceCrawlDate: ").append(getSinceCrawlDate()).append(",");
        if (getLookBackPeriod() != null)
            sb.append("LookBackPeriod: ").append(getLookBackPeriod()).append(",");
        if (getPrivateChannelFilter() != null)
            sb.append("PrivateChannelFilter: ").append(getPrivateChannelFilter()).append(",");
        if (getPublicChannelFilter() != null)
            sb.append("PublicChannelFilter: ").append(getPublicChannelFilter()).append(",");
        if (getInclusionPatterns() != null)
            sb.append("InclusionPatterns: ").append(getInclusionPatterns()).append(",");
        if (getExclusionPatterns() != null)
            sb.append("ExclusionPatterns: ").append(getExclusionPatterns()).append(",");
        if (getFieldMappings() != null)
            sb.append("FieldMappings: ").append(getFieldMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SlackConfiguration == false)
            return false;
        SlackConfiguration other = (SlackConfiguration) obj;
        if (other.getTeamId() == null ^ this.getTeamId() == null)
            return false;
        if (other.getTeamId() != null && other.getTeamId().equals(this.getTeamId()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
            return false;
        if (other.getSlackEntityList() == null ^ this.getSlackEntityList() == null)
            return false;
        if (other.getSlackEntityList() != null && other.getSlackEntityList().equals(this.getSlackEntityList()) == false)
            return false;
        if (other.getUseChangeLog() == null ^ this.getUseChangeLog() == null)
            return false;
        if (other.getUseChangeLog() != null && other.getUseChangeLog().equals(this.getUseChangeLog()) == false)
            return false;
        if (other.getCrawlBotMessage() == null ^ this.getCrawlBotMessage() == null)
            return false;
        if (other.getCrawlBotMessage() != null && other.getCrawlBotMessage().equals(this.getCrawlBotMessage()) == false)
            return false;
        if (other.getExcludeArchived() == null ^ this.getExcludeArchived() == null)
            return false;
        if (other.getExcludeArchived() != null && other.getExcludeArchived().equals(this.getExcludeArchived()) == false)
            return false;
        if (other.getSinceCrawlDate() == null ^ this.getSinceCrawlDate() == null)
            return false;
        if (other.getSinceCrawlDate() != null && other.getSinceCrawlDate().equals(this.getSinceCrawlDate()) == false)
            return false;
        if (other.getLookBackPeriod() == null ^ this.getLookBackPeriod() == null)
            return false;
        if (other.getLookBackPeriod() != null && other.getLookBackPeriod().equals(this.getLookBackPeriod()) == false)
            return false;
        if (other.getPrivateChannelFilter() == null ^ this.getPrivateChannelFilter() == null)
            return false;
        if (other.getPrivateChannelFilter() != null && other.getPrivateChannelFilter().equals(this.getPrivateChannelFilter()) == false)
            return false;
        if (other.getPublicChannelFilter() == null ^ this.getPublicChannelFilter() == null)
            return false;
        if (other.getPublicChannelFilter() != null && other.getPublicChannelFilter().equals(this.getPublicChannelFilter()) == false)
            return false;
        if (other.getInclusionPatterns() == null ^ this.getInclusionPatterns() == null)
            return false;
        if (other.getInclusionPatterns() != null && other.getInclusionPatterns().equals(this.getInclusionPatterns()) == false)
            return false;
        if (other.getExclusionPatterns() == null ^ this.getExclusionPatterns() == null)
            return false;
        if (other.getExclusionPatterns() != null && other.getExclusionPatterns().equals(this.getExclusionPatterns()) == false)
            return false;
        if (other.getFieldMappings() == null ^ this.getFieldMappings() == null)
            return false;
        if (other.getFieldMappings() != null && other.getFieldMappings().equals(this.getFieldMappings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTeamId() == null) ? 0 : getTeamId().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSlackEntityList() == null) ? 0 : getSlackEntityList().hashCode());
        hashCode = prime * hashCode + ((getUseChangeLog() == null) ? 0 : getUseChangeLog().hashCode());
        hashCode = prime * hashCode + ((getCrawlBotMessage() == null) ? 0 : getCrawlBotMessage().hashCode());
        hashCode = prime * hashCode + ((getExcludeArchived() == null) ? 0 : getExcludeArchived().hashCode());
        hashCode = prime * hashCode + ((getSinceCrawlDate() == null) ? 0 : getSinceCrawlDate().hashCode());
        hashCode = prime * hashCode + ((getLookBackPeriod() == null) ? 0 : getLookBackPeriod().hashCode());
        hashCode = prime * hashCode + ((getPrivateChannelFilter() == null) ? 0 : getPrivateChannelFilter().hashCode());
        hashCode = prime * hashCode + ((getPublicChannelFilter() == null) ? 0 : getPublicChannelFilter().hashCode());
        hashCode = prime * hashCode + ((getInclusionPatterns() == null) ? 0 : getInclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getExclusionPatterns() == null) ? 0 : getExclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getFieldMappings() == null) ? 0 : getFieldMappings().hashCode());
        return hashCode;
    }

    @Override
    public SlackConfiguration clone() {
        try {
            return (SlackConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.SlackConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
