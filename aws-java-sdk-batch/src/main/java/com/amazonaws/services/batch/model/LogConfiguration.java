/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Log configuration options to send to a custom log driver for the container.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/LogConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The log driver to use for the container. The valid values listed for this parameter are log drivers that the
     * Amazon ECS container agent can communicate with by default.
     * </p>
     * <p>
     * The supported log drivers are <code>awslogs</code>, <code>fluentd</code>, <code>gelf</code>,
     * <code>json-file</code>, <code>journald</code>, <code>logentries</code>, <code>syslog</code>, and
     * <code>splunk</code>.
     * </p>
     * <note>
     * <p>
     * Jobs running on Fargate resources are restricted to the <code>awslogs</code> and <code>splunk</code> log drivers.
     * </p>
     * </note>
     * <dl>
     * <dt>awslogs</dt>
     * <dd>
     * <p>
     * Specifies the Amazon CloudWatch Logs logging driver. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/using_awslogs.html">Using the awslogs Log Driver</a> in
     * the <i>AWS Batch User Guide</i> and <a href="https://docs.docker.com/config/containers/logging/awslogs/">Amazon
     * CloudWatch Logs logging driver</a> in the Docker documentation.
     * </p>
     * </dd>
     * <dt>fluentd</dt>
     * <dd>
     * <p>
     * Specifies the Fluentd logging driver. For more information, including usage and options, see <a
     * href="https://docs.docker.com/config/containers/logging/fluentd/">Fluentd logging driver</a> in the Docker
     * documentation.
     * </p>
     * </dd>
     * <dt>gelf</dt>
     * <dd>
     * <p>
     * Specifies the Graylog Extended Format (GELF) logging driver. For more information, including usage and options,
     * see <a href="https://docs.docker.com/config/containers/logging/gelf/">Graylog Extended Format logging driver</a>
     * in the Docker documentation.
     * </p>
     * </dd>
     * <dt>journald</dt>
     * <dd>
     * <p>
     * Specifies the journald logging driver. For more information, including usage and options, see <a
     * href="https://docs.docker.com/config/containers/logging/journald/">Journald logging driver</a> in the Docker
     * documentation.
     * </p>
     * </dd>
     * <dt>json-file</dt>
     * <dd>
     * <p>
     * Specifies the JSON file logging driver. For more information, including usage and options, see <a
     * href="https://docs.docker.com/config/containers/logging/json-file/">JSON File logging driver</a> in the Docker
     * documentation.
     * </p>
     * </dd>
     * <dt>splunk</dt>
     * <dd>
     * <p>
     * Specifies the Splunk logging driver. For more information, including usage and options, see <a
     * href="https://docs.docker.com/config/containers/logging/splunk/">Splunk logging driver</a> in the Docker
     * documentation.
     * </p>
     * </dd>
     * <dt>syslog</dt>
     * <dd>
     * <p>
     * Specifies the syslog logging driver. For more information, including usage and options, see <a
     * href="https://docs.docker.com/config/containers/logging/syslog/">Syslog logging driver</a> in the Docker
     * documentation.
     * </p>
     * </dd>
     * </dl>
     * <note>
     * <p>
     * If you have a custom driver that isn't listed earlier that you want to work with the Amazon ECS container agent,
     * you can fork the Amazon ECS container agent project that is <a
     * href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a> and customize it to work with that driver.
     * We encourage you to submit pull requests for changes that you want to have included. However, Amazon Web Services
     * doesn't currently support running modified copies of this software.
     * </p>
     * </note>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log into your container instance and run the following
     * command: <code>sudo docker version | grep "Server API version"</code>
     * </p>
     */
    private String logDriver;
    /**
     * <p>
     * The configuration options to send to the log driver. This parameter requires version 1.19 of the Docker Remote
     * API or greater on your container instance. To check the Docker Remote API version on your container instance, log
     * into your container instance and run the following command:
     * <code>sudo docker version | grep "Server API version"</code>
     * </p>
     */
    private java.util.Map<String, String> options;
    /**
     * <p>
     * The secrets to pass to the log configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html">Specifying Sensitive
     * Data</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     */
    private java.util.List<Secret> secretOptions;

    /**
     * <p>
     * The log driver to use for the container. The valid values listed for this parameter are log drivers that the
     * Amazon ECS container agent can communicate with by default.
     * </p>
     * <p>
     * The supported log drivers are <code>awslogs</code>, <code>fluentd</code>, <code>gelf</code>,
     * <code>json-file</code>, <code>journald</code>, <code>logentries</code>, <code>syslog</code>, and
     * <code>splunk</code>.
     * </p>
     * <note>
     * <p>
     * Jobs running on Fargate resources are restricted to the <code>awslogs</code> and <code>splunk</code> log drivers.
     * </p>
     * </note>
     * <dl>
     * <dt>awslogs</dt>
     * <dd>
     * <p>
     * Specifies the Amazon CloudWatch Logs logging driver. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/using_awslogs.html">Using the awslogs Log Driver</a> in
     * the <i>AWS Batch User Guide</i> and <a href="https://docs.docker.com/config/containers/logging/awslogs/">Amazon
     * CloudWatch Logs logging driver</a> in the Docker documentation.
     * </p>
     * </dd>
     * <dt>fluentd</dt>
     * <dd>
     * <p>
     * Specifies the Fluentd logging driver. For more information, including usage and options, see <a
     * href="https://docs.docker.com/config/containers/logging/fluentd/">Fluentd logging driver</a> in the Docker
     * documentation.
     * </p>
     * </dd>
     * <dt>gelf</dt>
     * <dd>
     * <p>
     * Specifies the Graylog Extended Format (GELF) logging driver. For more information, including usage and options,
     * see <a href="https://docs.docker.com/config/containers/logging/gelf/">Graylog Extended Format logging driver</a>
     * in the Docker documentation.
     * </p>
     * </dd>
     * <dt>journald</dt>
     * <dd>
     * <p>
     * Specifies the journald logging driver. For more information, including usage and options, see <a
     * href="https://docs.docker.com/config/containers/logging/journald/">Journald logging driver</a> in the Docker
     * documentation.
     * </p>
     * </dd>
     * <dt>json-file</dt>
     * <dd>
     * <p>
     * Specifies the JSON file logging driver. For more information, including usage and options, see <a
     * href="https://docs.docker.com/config/containers/logging/json-file/">JSON File logging driver</a> in the Docker
     * documentation.
     * </p>
     * </dd>
     * <dt>splunk</dt>
     * <dd>
     * <p>
     * Specifies the Splunk logging driver. For more information, including usage and options, see <a
     * href="https://docs.docker.com/config/containers/logging/splunk/">Splunk logging driver</a> in the Docker
     * documentation.
     * </p>
     * </dd>
     * <dt>syslog</dt>
     * <dd>
     * <p>
     * Specifies the syslog logging driver. For more information, including usage and options, see <a
     * href="https://docs.docker.com/config/containers/logging/syslog/">Syslog logging driver</a> in the Docker
     * documentation.
     * </p>
     * </dd>
     * </dl>
     * <note>
     * <p>
     * If you have a custom driver that isn't listed earlier that you want to work with the Amazon ECS container agent,
     * you can fork the Amazon ECS container agent project that is <a
     * href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a> and customize it to work with that driver.
     * We encourage you to submit pull requests for changes that you want to have included. However, Amazon Web Services
     * doesn't currently support running modified copies of this software.
     * </p>
     * </note>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log into your container instance and run the following
     * command: <code>sudo docker version | grep "Server API version"</code>
     * </p>
     * 
     * @param logDriver
     *        The log driver to use for the container. The valid values listed for this parameter are log drivers that
     *        the Amazon ECS container agent can communicate with by default.</p>
     *        <p>
     *        The supported log drivers are <code>awslogs</code>, <code>fluentd</code>, <code>gelf</code>,
     *        <code>json-file</code>, <code>journald</code>, <code>logentries</code>, <code>syslog</code>, and
     *        <code>splunk</code>.
     *        </p>
     *        <note>
     *        <p>
     *        Jobs running on Fargate resources are restricted to the <code>awslogs</code> and <code>splunk</code> log
     *        drivers.
     *        </p>
     *        </note>
     *        <dl>
     *        <dt>awslogs</dt>
     *        <dd>
     *        <p>
     *        Specifies the Amazon CloudWatch Logs logging driver. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/using_awslogs.html">Using the awslogs Log
     *        Driver</a> in the <i>AWS Batch User Guide</i> and <a
     *        href="https://docs.docker.com/config/containers/logging/awslogs/">Amazon CloudWatch Logs logging
     *        driver</a> in the Docker documentation.
     *        </p>
     *        </dd>
     *        <dt>fluentd</dt>
     *        <dd>
     *        <p>
     *        Specifies the Fluentd logging driver. For more information, including usage and options, see <a
     *        href="https://docs.docker.com/config/containers/logging/fluentd/">Fluentd logging driver</a> in the Docker
     *        documentation.
     *        </p>
     *        </dd>
     *        <dt>gelf</dt>
     *        <dd>
     *        <p>
     *        Specifies the Graylog Extended Format (GELF) logging driver. For more information, including usage and
     *        options, see <a href="https://docs.docker.com/config/containers/logging/gelf/">Graylog Extended Format
     *        logging driver</a> in the Docker documentation.
     *        </p>
     *        </dd>
     *        <dt>journald</dt>
     *        <dd>
     *        <p>
     *        Specifies the journald logging driver. For more information, including usage and options, see <a
     *        href="https://docs.docker.com/config/containers/logging/journald/">Journald logging driver</a> in the
     *        Docker documentation.
     *        </p>
     *        </dd>
     *        <dt>json-file</dt>
     *        <dd>
     *        <p>
     *        Specifies the JSON file logging driver. For more information, including usage and options, see <a
     *        href="https://docs.docker.com/config/containers/logging/json-file/">JSON File logging driver</a> in the
     *        Docker documentation.
     *        </p>
     *        </dd>
     *        <dt>splunk</dt>
     *        <dd>
     *        <p>
     *        Specifies the Splunk logging driver. For more information, including usage and options, see <a
     *        href="https://docs.docker.com/config/containers/logging/splunk/">Splunk logging driver</a> in the Docker
     *        documentation.
     *        </p>
     *        </dd>
     *        <dt>syslog</dt>
     *        <dd>
     *        <p>
     *        Specifies the syslog logging driver. For more information, including usage and options, see <a
     *        href="https://docs.docker.com/config/containers/logging/syslog/">Syslog logging driver</a> in the Docker
     *        documentation.
     *        </p>
     *        </dd>
     *        </dl>
     *        <note>
     *        <p>
     *        If you have a custom driver that isn't listed earlier that you want to work with the Amazon ECS container
     *        agent, you can fork the Amazon ECS container agent project that is <a
     *        href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a> and customize it to work with that
     *        driver. We encourage you to submit pull requests for changes that you want to have included. However,
     *        Amazon Web Services doesn't currently support running modified copies of this software.
     *        </p>
     *        </note>
     *        <p>
     *        This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To
     *        check the Docker Remote API version on your container instance, log into your container instance and run
     *        the following command: <code>sudo docker version | grep "Server API version"</code>
     * @see LogDriver
     */

    public void setLogDriver(String logDriver) {
        this.logDriver = logDriver;
    }

    /**
     * <p>
     * The log driver to use for the container. The valid values listed for this parameter are log drivers that the
     * Amazon ECS container agent can communicate with by default.
     * </p>
     * <p>
     * The supported log drivers are <code>awslogs</code>, <code>fluentd</code>, <code>gelf</code>,
     * <code>json-file</code>, <code>journald</code>, <code>logentries</code>, <code>syslog</code>, and
     * <code>splunk</code>.
     * </p>
     * <note>
     * <p>
     * Jobs running on Fargate resources are restricted to the <code>awslogs</code> and <code>splunk</code> log drivers.
     * </p>
     * </note>
     * <dl>
     * <dt>awslogs</dt>
     * <dd>
     * <p>
     * Specifies the Amazon CloudWatch Logs logging driver. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/using_awslogs.html">Using the awslogs Log Driver</a> in
     * the <i>AWS Batch User Guide</i> and <a href="https://docs.docker.com/config/containers/logging/awslogs/">Amazon
     * CloudWatch Logs logging driver</a> in the Docker documentation.
     * </p>
     * </dd>
     * <dt>fluentd</dt>
     * <dd>
     * <p>
     * Specifies the Fluentd logging driver. For more information, including usage and options, see <a
     * href="https://docs.docker.com/config/containers/logging/fluentd/">Fluentd logging driver</a> in the Docker
     * documentation.
     * </p>
     * </dd>
     * <dt>gelf</dt>
     * <dd>
     * <p>
     * Specifies the Graylog Extended Format (GELF) logging driver. For more information, including usage and options,
     * see <a href="https://docs.docker.com/config/containers/logging/gelf/">Graylog Extended Format logging driver</a>
     * in the Docker documentation.
     * </p>
     * </dd>
     * <dt>journald</dt>
     * <dd>
     * <p>
     * Specifies the journald logging driver. For more information, including usage and options, see <a
     * href="https://docs.docker.com/config/containers/logging/journald/">Journald logging driver</a> in the Docker
     * documentation.
     * </p>
     * </dd>
     * <dt>json-file</dt>
     * <dd>
     * <p>
     * Specifies the JSON file logging driver. For more information, including usage and options, see <a
     * href="https://docs.docker.com/config/containers/logging/json-file/">JSON File logging driver</a> in the Docker
     * documentation.
     * </p>
     * </dd>
     * <dt>splunk</dt>
     * <dd>
     * <p>
     * Specifies the Splunk logging driver. For more information, including usage and options, see <a
     * href="https://docs.docker.com/config/containers/logging/splunk/">Splunk logging driver</a> in the Docker
     * documentation.
     * </p>
     * </dd>
     * <dt>syslog</dt>
     * <dd>
     * <p>
     * Specifies the syslog logging driver. For more information, including usage and options, see <a
     * href="https://docs.docker.com/config/containers/logging/syslog/">Syslog logging driver</a> in the Docker
     * documentation.
     * </p>
     * </dd>
     * </dl>
     * <note>
     * <p>
     * If you have a custom driver that isn't listed earlier that you want to work with the Amazon ECS container agent,
     * you can fork the Amazon ECS container agent project that is <a
     * href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a> and customize it to work with that driver.
     * We encourage you to submit pull requests for changes that you want to have included. However, Amazon Web Services
     * doesn't currently support running modified copies of this software.
     * </p>
     * </note>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log into your container instance and run the following
     * command: <code>sudo docker version | grep "Server API version"</code>
     * </p>
     * 
     * @return The log driver to use for the container. The valid values listed for this parameter are log drivers that
     *         the Amazon ECS container agent can communicate with by default.</p>
     *         <p>
     *         The supported log drivers are <code>awslogs</code>, <code>fluentd</code>, <code>gelf</code>,
     *         <code>json-file</code>, <code>journald</code>, <code>logentries</code>, <code>syslog</code>, and
     *         <code>splunk</code>.
     *         </p>
     *         <note>
     *         <p>
     *         Jobs running on Fargate resources are restricted to the <code>awslogs</code> and <code>splunk</code> log
     *         drivers.
     *         </p>
     *         </note>
     *         <dl>
     *         <dt>awslogs</dt>
     *         <dd>
     *         <p>
     *         Specifies the Amazon CloudWatch Logs logging driver. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/using_awslogs.html">Using the awslogs Log
     *         Driver</a> in the <i>AWS Batch User Guide</i> and <a
     *         href="https://docs.docker.com/config/containers/logging/awslogs/">Amazon CloudWatch Logs logging
     *         driver</a> in the Docker documentation.
     *         </p>
     *         </dd>
     *         <dt>fluentd</dt>
     *         <dd>
     *         <p>
     *         Specifies the Fluentd logging driver. For more information, including usage and options, see <a
     *         href="https://docs.docker.com/config/containers/logging/fluentd/">Fluentd logging driver</a> in the
     *         Docker documentation.
     *         </p>
     *         </dd>
     *         <dt>gelf</dt>
     *         <dd>
     *         <p>
     *         Specifies the Graylog Extended Format (GELF) logging driver. For more information, including usage and
     *         options, see <a href="https://docs.docker.com/config/containers/logging/gelf/">Graylog Extended Format
     *         logging driver</a> in the Docker documentation.
     *         </p>
     *         </dd>
     *         <dt>journald</dt>
     *         <dd>
     *         <p>
     *         Specifies the journald logging driver. For more information, including usage and options, see <a
     *         href="https://docs.docker.com/config/containers/logging/journald/">Journald logging driver</a> in the
     *         Docker documentation.
     *         </p>
     *         </dd>
     *         <dt>json-file</dt>
     *         <dd>
     *         <p>
     *         Specifies the JSON file logging driver. For more information, including usage and options, see <a
     *         href="https://docs.docker.com/config/containers/logging/json-file/">JSON File logging driver</a> in the
     *         Docker documentation.
     *         </p>
     *         </dd>
     *         <dt>splunk</dt>
     *         <dd>
     *         <p>
     *         Specifies the Splunk logging driver. For more information, including usage and options, see <a
     *         href="https://docs.docker.com/config/containers/logging/splunk/">Splunk logging driver</a> in the Docker
     *         documentation.
     *         </p>
     *         </dd>
     *         <dt>syslog</dt>
     *         <dd>
     *         <p>
     *         Specifies the syslog logging driver. For more information, including usage and options, see <a
     *         href="https://docs.docker.com/config/containers/logging/syslog/">Syslog logging driver</a> in the Docker
     *         documentation.
     *         </p>
     *         </dd>
     *         </dl>
     *         <note>
     *         <p>
     *         If you have a custom driver that isn't listed earlier that you want to work with the Amazon ECS container
     *         agent, you can fork the Amazon ECS container agent project that is <a
     *         href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a> and customize it to work with that
     *         driver. We encourage you to submit pull requests for changes that you want to have included. However,
     *         Amazon Web Services doesn't currently support running modified copies of this software.
     *         </p>
     *         </note>
     *         <p>
     *         This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To
     *         check the Docker Remote API version on your container instance, log into your container instance and run
     *         the following command: <code>sudo docker version | grep "Server API version"</code>
     * @see LogDriver
     */

    public String getLogDriver() {
        return this.logDriver;
    }

    /**
     * <p>
     * The log driver to use for the container. The valid values listed for this parameter are log drivers that the
     * Amazon ECS container agent can communicate with by default.
     * </p>
     * <p>
     * The supported log drivers are <code>awslogs</code>, <code>fluentd</code>, <code>gelf</code>,
     * <code>json-file</code>, <code>journald</code>, <code>logentries</code>, <code>syslog</code>, and
     * <code>splunk</code>.
     * </p>
     * <note>
     * <p>
     * Jobs running on Fargate resources are restricted to the <code>awslogs</code> and <code>splunk</code> log drivers.
     * </p>
     * </note>
     * <dl>
     * <dt>awslogs</dt>
     * <dd>
     * <p>
     * Specifies the Amazon CloudWatch Logs logging driver. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/using_awslogs.html">Using the awslogs Log Driver</a> in
     * the <i>AWS Batch User Guide</i> and <a href="https://docs.docker.com/config/containers/logging/awslogs/">Amazon
     * CloudWatch Logs logging driver</a> in the Docker documentation.
     * </p>
     * </dd>
     * <dt>fluentd</dt>
     * <dd>
     * <p>
     * Specifies the Fluentd logging driver. For more information, including usage and options, see <a
     * href="https://docs.docker.com/config/containers/logging/fluentd/">Fluentd logging driver</a> in the Docker
     * documentation.
     * </p>
     * </dd>
     * <dt>gelf</dt>
     * <dd>
     * <p>
     * Specifies the Graylog Extended Format (GELF) logging driver. For more information, including usage and options,
     * see <a href="https://docs.docker.com/config/containers/logging/gelf/">Graylog Extended Format logging driver</a>
     * in the Docker documentation.
     * </p>
     * </dd>
     * <dt>journald</dt>
     * <dd>
     * <p>
     * Specifies the journald logging driver. For more information, including usage and options, see <a
     * href="https://docs.docker.com/config/containers/logging/journald/">Journald logging driver</a> in the Docker
     * documentation.
     * </p>
     * </dd>
     * <dt>json-file</dt>
     * <dd>
     * <p>
     * Specifies the JSON file logging driver. For more information, including usage and options, see <a
     * href="https://docs.docker.com/config/containers/logging/json-file/">JSON File logging driver</a> in the Docker
     * documentation.
     * </p>
     * </dd>
     * <dt>splunk</dt>
     * <dd>
     * <p>
     * Specifies the Splunk logging driver. For more information, including usage and options, see <a
     * href="https://docs.docker.com/config/containers/logging/splunk/">Splunk logging driver</a> in the Docker
     * documentation.
     * </p>
     * </dd>
     * <dt>syslog</dt>
     * <dd>
     * <p>
     * Specifies the syslog logging driver. For more information, including usage and options, see <a
     * href="https://docs.docker.com/config/containers/logging/syslog/">Syslog logging driver</a> in the Docker
     * documentation.
     * </p>
     * </dd>
     * </dl>
     * <note>
     * <p>
     * If you have a custom driver that isn't listed earlier that you want to work with the Amazon ECS container agent,
     * you can fork the Amazon ECS container agent project that is <a
     * href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a> and customize it to work with that driver.
     * We encourage you to submit pull requests for changes that you want to have included. However, Amazon Web Services
     * doesn't currently support running modified copies of this software.
     * </p>
     * </note>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log into your container instance and run the following
     * command: <code>sudo docker version | grep "Server API version"</code>
     * </p>
     * 
     * @param logDriver
     *        The log driver to use for the container. The valid values listed for this parameter are log drivers that
     *        the Amazon ECS container agent can communicate with by default.</p>
     *        <p>
     *        The supported log drivers are <code>awslogs</code>, <code>fluentd</code>, <code>gelf</code>,
     *        <code>json-file</code>, <code>journald</code>, <code>logentries</code>, <code>syslog</code>, and
     *        <code>splunk</code>.
     *        </p>
     *        <note>
     *        <p>
     *        Jobs running on Fargate resources are restricted to the <code>awslogs</code> and <code>splunk</code> log
     *        drivers.
     *        </p>
     *        </note>
     *        <dl>
     *        <dt>awslogs</dt>
     *        <dd>
     *        <p>
     *        Specifies the Amazon CloudWatch Logs logging driver. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/using_awslogs.html">Using the awslogs Log
     *        Driver</a> in the <i>AWS Batch User Guide</i> and <a
     *        href="https://docs.docker.com/config/containers/logging/awslogs/">Amazon CloudWatch Logs logging
     *        driver</a> in the Docker documentation.
     *        </p>
     *        </dd>
     *        <dt>fluentd</dt>
     *        <dd>
     *        <p>
     *        Specifies the Fluentd logging driver. For more information, including usage and options, see <a
     *        href="https://docs.docker.com/config/containers/logging/fluentd/">Fluentd logging driver</a> in the Docker
     *        documentation.
     *        </p>
     *        </dd>
     *        <dt>gelf</dt>
     *        <dd>
     *        <p>
     *        Specifies the Graylog Extended Format (GELF) logging driver. For more information, including usage and
     *        options, see <a href="https://docs.docker.com/config/containers/logging/gelf/">Graylog Extended Format
     *        logging driver</a> in the Docker documentation.
     *        </p>
     *        </dd>
     *        <dt>journald</dt>
     *        <dd>
     *        <p>
     *        Specifies the journald logging driver. For more information, including usage and options, see <a
     *        href="https://docs.docker.com/config/containers/logging/journald/">Journald logging driver</a> in the
     *        Docker documentation.
     *        </p>
     *        </dd>
     *        <dt>json-file</dt>
     *        <dd>
     *        <p>
     *        Specifies the JSON file logging driver. For more information, including usage and options, see <a
     *        href="https://docs.docker.com/config/containers/logging/json-file/">JSON File logging driver</a> in the
     *        Docker documentation.
     *        </p>
     *        </dd>
     *        <dt>splunk</dt>
     *        <dd>
     *        <p>
     *        Specifies the Splunk logging driver. For more information, including usage and options, see <a
     *        href="https://docs.docker.com/config/containers/logging/splunk/">Splunk logging driver</a> in the Docker
     *        documentation.
     *        </p>
     *        </dd>
     *        <dt>syslog</dt>
     *        <dd>
     *        <p>
     *        Specifies the syslog logging driver. For more information, including usage and options, see <a
     *        href="https://docs.docker.com/config/containers/logging/syslog/">Syslog logging driver</a> in the Docker
     *        documentation.
     *        </p>
     *        </dd>
     *        </dl>
     *        <note>
     *        <p>
     *        If you have a custom driver that isn't listed earlier that you want to work with the Amazon ECS container
     *        agent, you can fork the Amazon ECS container agent project that is <a
     *        href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a> and customize it to work with that
     *        driver. We encourage you to submit pull requests for changes that you want to have included. However,
     *        Amazon Web Services doesn't currently support running modified copies of this software.
     *        </p>
     *        </note>
     *        <p>
     *        This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To
     *        check the Docker Remote API version on your container instance, log into your container instance and run
     *        the following command: <code>sudo docker version | grep "Server API version"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogDriver
     */

    public LogConfiguration withLogDriver(String logDriver) {
        setLogDriver(logDriver);
        return this;
    }

    /**
     * <p>
     * The log driver to use for the container. The valid values listed for this parameter are log drivers that the
     * Amazon ECS container agent can communicate with by default.
     * </p>
     * <p>
     * The supported log drivers are <code>awslogs</code>, <code>fluentd</code>, <code>gelf</code>,
     * <code>json-file</code>, <code>journald</code>, <code>logentries</code>, <code>syslog</code>, and
     * <code>splunk</code>.
     * </p>
     * <note>
     * <p>
     * Jobs running on Fargate resources are restricted to the <code>awslogs</code> and <code>splunk</code> log drivers.
     * </p>
     * </note>
     * <dl>
     * <dt>awslogs</dt>
     * <dd>
     * <p>
     * Specifies the Amazon CloudWatch Logs logging driver. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/using_awslogs.html">Using the awslogs Log Driver</a> in
     * the <i>AWS Batch User Guide</i> and <a href="https://docs.docker.com/config/containers/logging/awslogs/">Amazon
     * CloudWatch Logs logging driver</a> in the Docker documentation.
     * </p>
     * </dd>
     * <dt>fluentd</dt>
     * <dd>
     * <p>
     * Specifies the Fluentd logging driver. For more information, including usage and options, see <a
     * href="https://docs.docker.com/config/containers/logging/fluentd/">Fluentd logging driver</a> in the Docker
     * documentation.
     * </p>
     * </dd>
     * <dt>gelf</dt>
     * <dd>
     * <p>
     * Specifies the Graylog Extended Format (GELF) logging driver. For more information, including usage and options,
     * see <a href="https://docs.docker.com/config/containers/logging/gelf/">Graylog Extended Format logging driver</a>
     * in the Docker documentation.
     * </p>
     * </dd>
     * <dt>journald</dt>
     * <dd>
     * <p>
     * Specifies the journald logging driver. For more information, including usage and options, see <a
     * href="https://docs.docker.com/config/containers/logging/journald/">Journald logging driver</a> in the Docker
     * documentation.
     * </p>
     * </dd>
     * <dt>json-file</dt>
     * <dd>
     * <p>
     * Specifies the JSON file logging driver. For more information, including usage and options, see <a
     * href="https://docs.docker.com/config/containers/logging/json-file/">JSON File logging driver</a> in the Docker
     * documentation.
     * </p>
     * </dd>
     * <dt>splunk</dt>
     * <dd>
     * <p>
     * Specifies the Splunk logging driver. For more information, including usage and options, see <a
     * href="https://docs.docker.com/config/containers/logging/splunk/">Splunk logging driver</a> in the Docker
     * documentation.
     * </p>
     * </dd>
     * <dt>syslog</dt>
     * <dd>
     * <p>
     * Specifies the syslog logging driver. For more information, including usage and options, see <a
     * href="https://docs.docker.com/config/containers/logging/syslog/">Syslog logging driver</a> in the Docker
     * documentation.
     * </p>
     * </dd>
     * </dl>
     * <note>
     * <p>
     * If you have a custom driver that isn't listed earlier that you want to work with the Amazon ECS container agent,
     * you can fork the Amazon ECS container agent project that is <a
     * href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a> and customize it to work with that driver.
     * We encourage you to submit pull requests for changes that you want to have included. However, Amazon Web Services
     * doesn't currently support running modified copies of this software.
     * </p>
     * </note>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log into your container instance and run the following
     * command: <code>sudo docker version | grep "Server API version"</code>
     * </p>
     * 
     * @param logDriver
     *        The log driver to use for the container. The valid values listed for this parameter are log drivers that
     *        the Amazon ECS container agent can communicate with by default.</p>
     *        <p>
     *        The supported log drivers are <code>awslogs</code>, <code>fluentd</code>, <code>gelf</code>,
     *        <code>json-file</code>, <code>journald</code>, <code>logentries</code>, <code>syslog</code>, and
     *        <code>splunk</code>.
     *        </p>
     *        <note>
     *        <p>
     *        Jobs running on Fargate resources are restricted to the <code>awslogs</code> and <code>splunk</code> log
     *        drivers.
     *        </p>
     *        </note>
     *        <dl>
     *        <dt>awslogs</dt>
     *        <dd>
     *        <p>
     *        Specifies the Amazon CloudWatch Logs logging driver. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/using_awslogs.html">Using the awslogs Log
     *        Driver</a> in the <i>AWS Batch User Guide</i> and <a
     *        href="https://docs.docker.com/config/containers/logging/awslogs/">Amazon CloudWatch Logs logging
     *        driver</a> in the Docker documentation.
     *        </p>
     *        </dd>
     *        <dt>fluentd</dt>
     *        <dd>
     *        <p>
     *        Specifies the Fluentd logging driver. For more information, including usage and options, see <a
     *        href="https://docs.docker.com/config/containers/logging/fluentd/">Fluentd logging driver</a> in the Docker
     *        documentation.
     *        </p>
     *        </dd>
     *        <dt>gelf</dt>
     *        <dd>
     *        <p>
     *        Specifies the Graylog Extended Format (GELF) logging driver. For more information, including usage and
     *        options, see <a href="https://docs.docker.com/config/containers/logging/gelf/">Graylog Extended Format
     *        logging driver</a> in the Docker documentation.
     *        </p>
     *        </dd>
     *        <dt>journald</dt>
     *        <dd>
     *        <p>
     *        Specifies the journald logging driver. For more information, including usage and options, see <a
     *        href="https://docs.docker.com/config/containers/logging/journald/">Journald logging driver</a> in the
     *        Docker documentation.
     *        </p>
     *        </dd>
     *        <dt>json-file</dt>
     *        <dd>
     *        <p>
     *        Specifies the JSON file logging driver. For more information, including usage and options, see <a
     *        href="https://docs.docker.com/config/containers/logging/json-file/">JSON File logging driver</a> in the
     *        Docker documentation.
     *        </p>
     *        </dd>
     *        <dt>splunk</dt>
     *        <dd>
     *        <p>
     *        Specifies the Splunk logging driver. For more information, including usage and options, see <a
     *        href="https://docs.docker.com/config/containers/logging/splunk/">Splunk logging driver</a> in the Docker
     *        documentation.
     *        </p>
     *        </dd>
     *        <dt>syslog</dt>
     *        <dd>
     *        <p>
     *        Specifies the syslog logging driver. For more information, including usage and options, see <a
     *        href="https://docs.docker.com/config/containers/logging/syslog/">Syslog logging driver</a> in the Docker
     *        documentation.
     *        </p>
     *        </dd>
     *        </dl>
     *        <note>
     *        <p>
     *        If you have a custom driver that isn't listed earlier that you want to work with the Amazon ECS container
     *        agent, you can fork the Amazon ECS container agent project that is <a
     *        href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a> and customize it to work with that
     *        driver. We encourage you to submit pull requests for changes that you want to have included. However,
     *        Amazon Web Services doesn't currently support running modified copies of this software.
     *        </p>
     *        </note>
     *        <p>
     *        This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To
     *        check the Docker Remote API version on your container instance, log into your container instance and run
     *        the following command: <code>sudo docker version | grep "Server API version"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogDriver
     */

    public LogConfiguration withLogDriver(LogDriver logDriver) {
        this.logDriver = logDriver.toString();
        return this;
    }

    /**
     * <p>
     * The configuration options to send to the log driver. This parameter requires version 1.19 of the Docker Remote
     * API or greater on your container instance. To check the Docker Remote API version on your container instance, log
     * into your container instance and run the following command:
     * <code>sudo docker version | grep "Server API version"</code>
     * </p>
     * 
     * @return The configuration options to send to the log driver. This parameter requires version 1.19 of the Docker
     *         Remote API or greater on your container instance. To check the Docker Remote API version on your
     *         container instance, log into your container instance and run the following command:
     *         <code>sudo docker version | grep "Server API version"</code>
     */

    public java.util.Map<String, String> getOptions() {
        return options;
    }

    /**
     * <p>
     * The configuration options to send to the log driver. This parameter requires version 1.19 of the Docker Remote
     * API or greater on your container instance. To check the Docker Remote API version on your container instance, log
     * into your container instance and run the following command:
     * <code>sudo docker version | grep "Server API version"</code>
     * </p>
     * 
     * @param options
     *        The configuration options to send to the log driver. This parameter requires version 1.19 of the Docker
     *        Remote API or greater on your container instance. To check the Docker Remote API version on your container
     *        instance, log into your container instance and run the following command:
     *        <code>sudo docker version | grep "Server API version"</code>
     */

    public void setOptions(java.util.Map<String, String> options) {
        this.options = options;
    }

    /**
     * <p>
     * The configuration options to send to the log driver. This parameter requires version 1.19 of the Docker Remote
     * API or greater on your container instance. To check the Docker Remote API version on your container instance, log
     * into your container instance and run the following command:
     * <code>sudo docker version | grep "Server API version"</code>
     * </p>
     * 
     * @param options
     *        The configuration options to send to the log driver. This parameter requires version 1.19 of the Docker
     *        Remote API or greater on your container instance. To check the Docker Remote API version on your container
     *        instance, log into your container instance and run the following command:
     *        <code>sudo docker version | grep "Server API version"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogConfiguration withOptions(java.util.Map<String, String> options) {
        setOptions(options);
        return this;
    }

    /**
     * Add a single Options entry
     *
     * @see LogConfiguration#withOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public LogConfiguration addOptionsEntry(String key, String value) {
        if (null == this.options) {
            this.options = new java.util.HashMap<String, String>();
        }
        if (this.options.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.options.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Options.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogConfiguration clearOptionsEntries() {
        this.options = null;
        return this;
    }

    /**
     * <p>
     * The secrets to pass to the log configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html">Specifying Sensitive
     * Data</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @return The secrets to pass to the log configuration. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html">Specifying
     *         Sensitive Data</a> in the <i>AWS Batch User Guide</i>.
     */

    public java.util.List<Secret> getSecretOptions() {
        return secretOptions;
    }

    /**
     * <p>
     * The secrets to pass to the log configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html">Specifying Sensitive
     * Data</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @param secretOptions
     *        The secrets to pass to the log configuration. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html">Specifying
     *        Sensitive Data</a> in the <i>AWS Batch User Guide</i>.
     */

    public void setSecretOptions(java.util.Collection<Secret> secretOptions) {
        if (secretOptions == null) {
            this.secretOptions = null;
            return;
        }

        this.secretOptions = new java.util.ArrayList<Secret>(secretOptions);
    }

    /**
     * <p>
     * The secrets to pass to the log configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html">Specifying Sensitive
     * Data</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecretOptions(java.util.Collection)} or {@link #withSecretOptions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param secretOptions
     *        The secrets to pass to the log configuration. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html">Specifying
     *        Sensitive Data</a> in the <i>AWS Batch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogConfiguration withSecretOptions(Secret... secretOptions) {
        if (this.secretOptions == null) {
            setSecretOptions(new java.util.ArrayList<Secret>(secretOptions.length));
        }
        for (Secret ele : secretOptions) {
            this.secretOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The secrets to pass to the log configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html">Specifying Sensitive
     * Data</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @param secretOptions
     *        The secrets to pass to the log configuration. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html">Specifying
     *        Sensitive Data</a> in the <i>AWS Batch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogConfiguration withSecretOptions(java.util.Collection<Secret> secretOptions) {
        setSecretOptions(secretOptions);
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
        if (getLogDriver() != null)
            sb.append("LogDriver: ").append(getLogDriver()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getSecretOptions() != null)
            sb.append("SecretOptions: ").append(getSecretOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogConfiguration == false)
            return false;
        LogConfiguration other = (LogConfiguration) obj;
        if (other.getLogDriver() == null ^ this.getLogDriver() == null)
            return false;
        if (other.getLogDriver() != null && other.getLogDriver().equals(this.getLogDriver()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getSecretOptions() == null ^ this.getSecretOptions() == null)
            return false;
        if (other.getSecretOptions() != null && other.getSecretOptions().equals(this.getSecretOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogDriver() == null) ? 0 : getLogDriver().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getSecretOptions() == null) ? 0 : getSecretOptions().hashCode());
        return hashCode;
    }

    @Override
    public LogConfiguration clone() {
        try {
            return (LogConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.LogConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
