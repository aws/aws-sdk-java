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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details for the pod.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/EksPodPropertiesDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EksPodPropertiesDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the service account that's used to run the pod. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/service-accounts.html">Kubernetes service accounts</a> and
     * <a href="https://docs.aws.amazon.com/eks/latest/userguide/associate-service-account-role.html">Configure a
     * Kubernetes service account to assume an IAM role</a> in the <i>Amazon EKS User Guide</i> and <a
     * href="https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/">Configure service
     * accounts for pods</a> in the <i>Kubernetes documentation</i>.
     * </p>
     */
    private String serviceAccountName;
    /**
     * <p>
     * Indicates if the pod uses the hosts' network IP address. The default value is <code>true</code>. Setting this to
     * <code>false</code> enables the Kubernetes pod networking model. Most Batch workloads are egress-only and don't
     * require the overhead of IP allocation for each pod for incoming connections. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#host-namespaces">Host namespaces</a> and
     * <a href="https://kubernetes.io/docs/concepts/workloads/pods/#pod-networking">Pod networking</a> in the
     * <i>Kubernetes documentation</i>.
     * </p>
     */
    private Boolean hostNetwork;
    /**
     * <p>
     * The DNS policy for the pod. The default value is <code>ClusterFirst</code>. If the <code>hostNetwork</code>
     * parameter is not specified, the default is <code>ClusterFirstWithHostNet</code>. <code>ClusterFirst</code>
     * indicates that any DNS query that does not match the configured cluster domain suffix is forwarded to the
     * upstream nameserver inherited from the node. If no value was specified for <code>dnsPolicy</code> in the <a
     * href="https://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html"
     * >RegisterJobDefinition</a> API operation, then no value will be returned for <code>dnsPolicy</code> by either of
     * <a href="https://docs.aws.amazon.com/batch/latest/APIReference/API_DescribeJobDefinitions.html">
     * DescribeJobDefinitions</a> or <a
     * href="https://docs.aws.amazon.com/batch/latest/APIReference/API_DescribeJobs.html">DescribeJobs</a> API
     * operations. The pod spec setting will contain either <code>ClusterFirst</code> or
     * <code>ClusterFirstWithHostNet</code>, depending on the value of the <code>hostNetwork</code> parameter. For more
     * information, see <a
     * href="https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy">Pod's DNS
     * policy</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * <p>
     * Valid values: <code>Default</code> | <code>ClusterFirst</code> | <code>ClusterFirstWithHostNet</code>
     * </p>
     */
    private String dnsPolicy;
    /**
     * <p>
     * The properties of the container that's used on the Amazon EKS pod.
     * </p>
     */
    private java.util.List<EksContainerDetail> containers;
    /**
     * <p>
     * Specifies the volumes for a job definition using Amazon EKS resources.
     * </p>
     */
    private java.util.List<EksVolume> volumes;
    /**
     * <p>
     * The name of the pod for this job.
     * </p>
     */
    private String podName;
    /**
     * <p>
     * The name of the node for this job.
     * </p>
     */
    private String nodeName;

    /**
     * <p>
     * The name of the service account that's used to run the pod. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/service-accounts.html">Kubernetes service accounts</a> and
     * <a href="https://docs.aws.amazon.com/eks/latest/userguide/associate-service-account-role.html">Configure a
     * Kubernetes service account to assume an IAM role</a> in the <i>Amazon EKS User Guide</i> and <a
     * href="https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/">Configure service
     * accounts for pods</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param serviceAccountName
     *        The name of the service account that's used to run the pod. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/service-accounts.html">Kubernetes service
     *        accounts</a> and <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/associate-service-account-role.html">Configure a
     *        Kubernetes service account to assume an IAM role</a> in the <i>Amazon EKS User Guide</i> and <a
     *        href="https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/">Configure
     *        service accounts for pods</a> in the <i>Kubernetes documentation</i>.
     */

    public void setServiceAccountName(String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
    }

    /**
     * <p>
     * The name of the service account that's used to run the pod. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/service-accounts.html">Kubernetes service accounts</a> and
     * <a href="https://docs.aws.amazon.com/eks/latest/userguide/associate-service-account-role.html">Configure a
     * Kubernetes service account to assume an IAM role</a> in the <i>Amazon EKS User Guide</i> and <a
     * href="https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/">Configure service
     * accounts for pods</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @return The name of the service account that's used to run the pod. For more information, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/service-accounts.html">Kubernetes service
     *         accounts</a> and <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/associate-service-account-role.html">Configure a
     *         Kubernetes service account to assume an IAM role</a> in the <i>Amazon EKS User Guide</i> and <a
     *         href="https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/">Configure
     *         service accounts for pods</a> in the <i>Kubernetes documentation</i>.
     */

    public String getServiceAccountName() {
        return this.serviceAccountName;
    }

    /**
     * <p>
     * The name of the service account that's used to run the pod. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/service-accounts.html">Kubernetes service accounts</a> and
     * <a href="https://docs.aws.amazon.com/eks/latest/userguide/associate-service-account-role.html">Configure a
     * Kubernetes service account to assume an IAM role</a> in the <i>Amazon EKS User Guide</i> and <a
     * href="https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/">Configure service
     * accounts for pods</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param serviceAccountName
     *        The name of the service account that's used to run the pod. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/service-accounts.html">Kubernetes service
     *        accounts</a> and <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/associate-service-account-role.html">Configure a
     *        Kubernetes service account to assume an IAM role</a> in the <i>Amazon EKS User Guide</i> and <a
     *        href="https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/">Configure
     *        service accounts for pods</a> in the <i>Kubernetes documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksPodPropertiesDetail withServiceAccountName(String serviceAccountName) {
        setServiceAccountName(serviceAccountName);
        return this;
    }

    /**
     * <p>
     * Indicates if the pod uses the hosts' network IP address. The default value is <code>true</code>. Setting this to
     * <code>false</code> enables the Kubernetes pod networking model. Most Batch workloads are egress-only and don't
     * require the overhead of IP allocation for each pod for incoming connections. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#host-namespaces">Host namespaces</a> and
     * <a href="https://kubernetes.io/docs/concepts/workloads/pods/#pod-networking">Pod networking</a> in the
     * <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param hostNetwork
     *        Indicates if the pod uses the hosts' network IP address. The default value is <code>true</code>. Setting
     *        this to <code>false</code> enables the Kubernetes pod networking model. Most Batch workloads are
     *        egress-only and don't require the overhead of IP allocation for each pod for incoming connections. For
     *        more information, see <a
     *        href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#host-namespaces">Host
     *        namespaces</a> and <a href="https://kubernetes.io/docs/concepts/workloads/pods/#pod-networking">Pod
     *        networking</a> in the <i>Kubernetes documentation</i>.
     */

    public void setHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
    }

    /**
     * <p>
     * Indicates if the pod uses the hosts' network IP address. The default value is <code>true</code>. Setting this to
     * <code>false</code> enables the Kubernetes pod networking model. Most Batch workloads are egress-only and don't
     * require the overhead of IP allocation for each pod for incoming connections. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#host-namespaces">Host namespaces</a> and
     * <a href="https://kubernetes.io/docs/concepts/workloads/pods/#pod-networking">Pod networking</a> in the
     * <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @return Indicates if the pod uses the hosts' network IP address. The default value is <code>true</code>. Setting
     *         this to <code>false</code> enables the Kubernetes pod networking model. Most Batch workloads are
     *         egress-only and don't require the overhead of IP allocation for each pod for incoming connections. For
     *         more information, see <a
     *         href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#host-namespaces">Host
     *         namespaces</a> and <a href="https://kubernetes.io/docs/concepts/workloads/pods/#pod-networking">Pod
     *         networking</a> in the <i>Kubernetes documentation</i>.
     */

    public Boolean getHostNetwork() {
        return this.hostNetwork;
    }

    /**
     * <p>
     * Indicates if the pod uses the hosts' network IP address. The default value is <code>true</code>. Setting this to
     * <code>false</code> enables the Kubernetes pod networking model. Most Batch workloads are egress-only and don't
     * require the overhead of IP allocation for each pod for incoming connections. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#host-namespaces">Host namespaces</a> and
     * <a href="https://kubernetes.io/docs/concepts/workloads/pods/#pod-networking">Pod networking</a> in the
     * <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param hostNetwork
     *        Indicates if the pod uses the hosts' network IP address. The default value is <code>true</code>. Setting
     *        this to <code>false</code> enables the Kubernetes pod networking model. Most Batch workloads are
     *        egress-only and don't require the overhead of IP allocation for each pod for incoming connections. For
     *        more information, see <a
     *        href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#host-namespaces">Host
     *        namespaces</a> and <a href="https://kubernetes.io/docs/concepts/workloads/pods/#pod-networking">Pod
     *        networking</a> in the <i>Kubernetes documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksPodPropertiesDetail withHostNetwork(Boolean hostNetwork) {
        setHostNetwork(hostNetwork);
        return this;
    }

    /**
     * <p>
     * Indicates if the pod uses the hosts' network IP address. The default value is <code>true</code>. Setting this to
     * <code>false</code> enables the Kubernetes pod networking model. Most Batch workloads are egress-only and don't
     * require the overhead of IP allocation for each pod for incoming connections. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#host-namespaces">Host namespaces</a> and
     * <a href="https://kubernetes.io/docs/concepts/workloads/pods/#pod-networking">Pod networking</a> in the
     * <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @return Indicates if the pod uses the hosts' network IP address. The default value is <code>true</code>. Setting
     *         this to <code>false</code> enables the Kubernetes pod networking model. Most Batch workloads are
     *         egress-only and don't require the overhead of IP allocation for each pod for incoming connections. For
     *         more information, see <a
     *         href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#host-namespaces">Host
     *         namespaces</a> and <a href="https://kubernetes.io/docs/concepts/workloads/pods/#pod-networking">Pod
     *         networking</a> in the <i>Kubernetes documentation</i>.
     */

    public Boolean isHostNetwork() {
        return this.hostNetwork;
    }

    /**
     * <p>
     * The DNS policy for the pod. The default value is <code>ClusterFirst</code>. If the <code>hostNetwork</code>
     * parameter is not specified, the default is <code>ClusterFirstWithHostNet</code>. <code>ClusterFirst</code>
     * indicates that any DNS query that does not match the configured cluster domain suffix is forwarded to the
     * upstream nameserver inherited from the node. If no value was specified for <code>dnsPolicy</code> in the <a
     * href="https://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html"
     * >RegisterJobDefinition</a> API operation, then no value will be returned for <code>dnsPolicy</code> by either of
     * <a href="https://docs.aws.amazon.com/batch/latest/APIReference/API_DescribeJobDefinitions.html">
     * DescribeJobDefinitions</a> or <a
     * href="https://docs.aws.amazon.com/batch/latest/APIReference/API_DescribeJobs.html">DescribeJobs</a> API
     * operations. The pod spec setting will contain either <code>ClusterFirst</code> or
     * <code>ClusterFirstWithHostNet</code>, depending on the value of the <code>hostNetwork</code> parameter. For more
     * information, see <a
     * href="https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy">Pod's DNS
     * policy</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * <p>
     * Valid values: <code>Default</code> | <code>ClusterFirst</code> | <code>ClusterFirstWithHostNet</code>
     * </p>
     * 
     * @param dnsPolicy
     *        The DNS policy for the pod. The default value is <code>ClusterFirst</code>. If the
     *        <code>hostNetwork</code> parameter is not specified, the default is <code>ClusterFirstWithHostNet</code>.
     *        <code>ClusterFirst</code> indicates that any DNS query that does not match the configured cluster domain
     *        suffix is forwarded to the upstream nameserver inherited from the node. If no value was specified for
     *        <code>dnsPolicy</code> in the <a
     *        href="https://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html"
     *        >RegisterJobDefinition</a> API operation, then no value will be returned for <code>dnsPolicy</code> by
     *        either of <a href="https://docs.aws.amazon.com/batch/latest/APIReference/API_DescribeJobDefinitions.html">
     *        DescribeJobDefinitions</a> or <a
     *        href="https://docs.aws.amazon.com/batch/latest/APIReference/API_DescribeJobs.html">DescribeJobs</a> API
     *        operations. The pod spec setting will contain either <code>ClusterFirst</code> or
     *        <code>ClusterFirstWithHostNet</code>, depending on the value of the <code>hostNetwork</code> parameter.
     *        For more information, see <a
     *        href="https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy">Pod's DNS
     *        policy</a> in the <i>Kubernetes documentation</i>.</p>
     *        <p>
     *        Valid values: <code>Default</code> | <code>ClusterFirst</code> | <code>ClusterFirstWithHostNet</code>
     */

    public void setDnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
    }

    /**
     * <p>
     * The DNS policy for the pod. The default value is <code>ClusterFirst</code>. If the <code>hostNetwork</code>
     * parameter is not specified, the default is <code>ClusterFirstWithHostNet</code>. <code>ClusterFirst</code>
     * indicates that any DNS query that does not match the configured cluster domain suffix is forwarded to the
     * upstream nameserver inherited from the node. If no value was specified for <code>dnsPolicy</code> in the <a
     * href="https://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html"
     * >RegisterJobDefinition</a> API operation, then no value will be returned for <code>dnsPolicy</code> by either of
     * <a href="https://docs.aws.amazon.com/batch/latest/APIReference/API_DescribeJobDefinitions.html">
     * DescribeJobDefinitions</a> or <a
     * href="https://docs.aws.amazon.com/batch/latest/APIReference/API_DescribeJobs.html">DescribeJobs</a> API
     * operations. The pod spec setting will contain either <code>ClusterFirst</code> or
     * <code>ClusterFirstWithHostNet</code>, depending on the value of the <code>hostNetwork</code> parameter. For more
     * information, see <a
     * href="https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy">Pod's DNS
     * policy</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * <p>
     * Valid values: <code>Default</code> | <code>ClusterFirst</code> | <code>ClusterFirstWithHostNet</code>
     * </p>
     * 
     * @return The DNS policy for the pod. The default value is <code>ClusterFirst</code>. If the
     *         <code>hostNetwork</code> parameter is not specified, the default is <code>ClusterFirstWithHostNet</code>.
     *         <code>ClusterFirst</code> indicates that any DNS query that does not match the configured cluster domain
     *         suffix is forwarded to the upstream nameserver inherited from the node. If no value was specified for
     *         <code>dnsPolicy</code> in the <a
     *         href="https://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html"
     *         >RegisterJobDefinition</a> API operation, then no value will be returned for <code>dnsPolicy</code> by
     *         either of <a
     *         href="https://docs.aws.amazon.com/batch/latest/APIReference/API_DescribeJobDefinitions.html">
     *         DescribeJobDefinitions</a> or <a
     *         href="https://docs.aws.amazon.com/batch/latest/APIReference/API_DescribeJobs.html">DescribeJobs</a> API
     *         operations. The pod spec setting will contain either <code>ClusterFirst</code> or
     *         <code>ClusterFirstWithHostNet</code>, depending on the value of the <code>hostNetwork</code> parameter.
     *         For more information, see <a
     *         href="https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy">Pod's
     *         DNS policy</a> in the <i>Kubernetes documentation</i>.</p>
     *         <p>
     *         Valid values: <code>Default</code> | <code>ClusterFirst</code> | <code>ClusterFirstWithHostNet</code>
     */

    public String getDnsPolicy() {
        return this.dnsPolicy;
    }

    /**
     * <p>
     * The DNS policy for the pod. The default value is <code>ClusterFirst</code>. If the <code>hostNetwork</code>
     * parameter is not specified, the default is <code>ClusterFirstWithHostNet</code>. <code>ClusterFirst</code>
     * indicates that any DNS query that does not match the configured cluster domain suffix is forwarded to the
     * upstream nameserver inherited from the node. If no value was specified for <code>dnsPolicy</code> in the <a
     * href="https://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html"
     * >RegisterJobDefinition</a> API operation, then no value will be returned for <code>dnsPolicy</code> by either of
     * <a href="https://docs.aws.amazon.com/batch/latest/APIReference/API_DescribeJobDefinitions.html">
     * DescribeJobDefinitions</a> or <a
     * href="https://docs.aws.amazon.com/batch/latest/APIReference/API_DescribeJobs.html">DescribeJobs</a> API
     * operations. The pod spec setting will contain either <code>ClusterFirst</code> or
     * <code>ClusterFirstWithHostNet</code>, depending on the value of the <code>hostNetwork</code> parameter. For more
     * information, see <a
     * href="https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy">Pod's DNS
     * policy</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * <p>
     * Valid values: <code>Default</code> | <code>ClusterFirst</code> | <code>ClusterFirstWithHostNet</code>
     * </p>
     * 
     * @param dnsPolicy
     *        The DNS policy for the pod. The default value is <code>ClusterFirst</code>. If the
     *        <code>hostNetwork</code> parameter is not specified, the default is <code>ClusterFirstWithHostNet</code>.
     *        <code>ClusterFirst</code> indicates that any DNS query that does not match the configured cluster domain
     *        suffix is forwarded to the upstream nameserver inherited from the node. If no value was specified for
     *        <code>dnsPolicy</code> in the <a
     *        href="https://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html"
     *        >RegisterJobDefinition</a> API operation, then no value will be returned for <code>dnsPolicy</code> by
     *        either of <a href="https://docs.aws.amazon.com/batch/latest/APIReference/API_DescribeJobDefinitions.html">
     *        DescribeJobDefinitions</a> or <a
     *        href="https://docs.aws.amazon.com/batch/latest/APIReference/API_DescribeJobs.html">DescribeJobs</a> API
     *        operations. The pod spec setting will contain either <code>ClusterFirst</code> or
     *        <code>ClusterFirstWithHostNet</code>, depending on the value of the <code>hostNetwork</code> parameter.
     *        For more information, see <a
     *        href="https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy">Pod's DNS
     *        policy</a> in the <i>Kubernetes documentation</i>.</p>
     *        <p>
     *        Valid values: <code>Default</code> | <code>ClusterFirst</code> | <code>ClusterFirstWithHostNet</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksPodPropertiesDetail withDnsPolicy(String dnsPolicy) {
        setDnsPolicy(dnsPolicy);
        return this;
    }

    /**
     * <p>
     * The properties of the container that's used on the Amazon EKS pod.
     * </p>
     * 
     * @return The properties of the container that's used on the Amazon EKS pod.
     */

    public java.util.List<EksContainerDetail> getContainers() {
        return containers;
    }

    /**
     * <p>
     * The properties of the container that's used on the Amazon EKS pod.
     * </p>
     * 
     * @param containers
     *        The properties of the container that's used on the Amazon EKS pod.
     */

    public void setContainers(java.util.Collection<EksContainerDetail> containers) {
        if (containers == null) {
            this.containers = null;
            return;
        }

        this.containers = new java.util.ArrayList<EksContainerDetail>(containers);
    }

    /**
     * <p>
     * The properties of the container that's used on the Amazon EKS pod.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainers(java.util.Collection)} or {@link #withContainers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param containers
     *        The properties of the container that's used on the Amazon EKS pod.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksPodPropertiesDetail withContainers(EksContainerDetail... containers) {
        if (this.containers == null) {
            setContainers(new java.util.ArrayList<EksContainerDetail>(containers.length));
        }
        for (EksContainerDetail ele : containers) {
            this.containers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The properties of the container that's used on the Amazon EKS pod.
     * </p>
     * 
     * @param containers
     *        The properties of the container that's used on the Amazon EKS pod.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksPodPropertiesDetail withContainers(java.util.Collection<EksContainerDetail> containers) {
        setContainers(containers);
        return this;
    }

    /**
     * <p>
     * Specifies the volumes for a job definition using Amazon EKS resources.
     * </p>
     * 
     * @return Specifies the volumes for a job definition using Amazon EKS resources.
     */

    public java.util.List<EksVolume> getVolumes() {
        return volumes;
    }

    /**
     * <p>
     * Specifies the volumes for a job definition using Amazon EKS resources.
     * </p>
     * 
     * @param volumes
     *        Specifies the volumes for a job definition using Amazon EKS resources.
     */

    public void setVolumes(java.util.Collection<EksVolume> volumes) {
        if (volumes == null) {
            this.volumes = null;
            return;
        }

        this.volumes = new java.util.ArrayList<EksVolume>(volumes);
    }

    /**
     * <p>
     * Specifies the volumes for a job definition using Amazon EKS resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumes(java.util.Collection)} or {@link #withVolumes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param volumes
     *        Specifies the volumes for a job definition using Amazon EKS resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksPodPropertiesDetail withVolumes(EksVolume... volumes) {
        if (this.volumes == null) {
            setVolumes(new java.util.ArrayList<EksVolume>(volumes.length));
        }
        for (EksVolume ele : volumes) {
            this.volumes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the volumes for a job definition using Amazon EKS resources.
     * </p>
     * 
     * @param volumes
     *        Specifies the volumes for a job definition using Amazon EKS resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksPodPropertiesDetail withVolumes(java.util.Collection<EksVolume> volumes) {
        setVolumes(volumes);
        return this;
    }

    /**
     * <p>
     * The name of the pod for this job.
     * </p>
     * 
     * @param podName
     *        The name of the pod for this job.
     */

    public void setPodName(String podName) {
        this.podName = podName;
    }

    /**
     * <p>
     * The name of the pod for this job.
     * </p>
     * 
     * @return The name of the pod for this job.
     */

    public String getPodName() {
        return this.podName;
    }

    /**
     * <p>
     * The name of the pod for this job.
     * </p>
     * 
     * @param podName
     *        The name of the pod for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksPodPropertiesDetail withPodName(String podName) {
        setPodName(podName);
        return this;
    }

    /**
     * <p>
     * The name of the node for this job.
     * </p>
     * 
     * @param nodeName
     *        The name of the node for this job.
     */

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * <p>
     * The name of the node for this job.
     * </p>
     * 
     * @return The name of the node for this job.
     */

    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * <p>
     * The name of the node for this job.
     * </p>
     * 
     * @param nodeName
     *        The name of the node for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksPodPropertiesDetail withNodeName(String nodeName) {
        setNodeName(nodeName);
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
        if (getServiceAccountName() != null)
            sb.append("ServiceAccountName: ").append(getServiceAccountName()).append(",");
        if (getHostNetwork() != null)
            sb.append("HostNetwork: ").append(getHostNetwork()).append(",");
        if (getDnsPolicy() != null)
            sb.append("DnsPolicy: ").append(getDnsPolicy()).append(",");
        if (getContainers() != null)
            sb.append("Containers: ").append(getContainers()).append(",");
        if (getVolumes() != null)
            sb.append("Volumes: ").append(getVolumes()).append(",");
        if (getPodName() != null)
            sb.append("PodName: ").append(getPodName()).append(",");
        if (getNodeName() != null)
            sb.append("NodeName: ").append(getNodeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EksPodPropertiesDetail == false)
            return false;
        EksPodPropertiesDetail other = (EksPodPropertiesDetail) obj;
        if (other.getServiceAccountName() == null ^ this.getServiceAccountName() == null)
            return false;
        if (other.getServiceAccountName() != null && other.getServiceAccountName().equals(this.getServiceAccountName()) == false)
            return false;
        if (other.getHostNetwork() == null ^ this.getHostNetwork() == null)
            return false;
        if (other.getHostNetwork() != null && other.getHostNetwork().equals(this.getHostNetwork()) == false)
            return false;
        if (other.getDnsPolicy() == null ^ this.getDnsPolicy() == null)
            return false;
        if (other.getDnsPolicy() != null && other.getDnsPolicy().equals(this.getDnsPolicy()) == false)
            return false;
        if (other.getContainers() == null ^ this.getContainers() == null)
            return false;
        if (other.getContainers() != null && other.getContainers().equals(this.getContainers()) == false)
            return false;
        if (other.getVolumes() == null ^ this.getVolumes() == null)
            return false;
        if (other.getVolumes() != null && other.getVolumes().equals(this.getVolumes()) == false)
            return false;
        if (other.getPodName() == null ^ this.getPodName() == null)
            return false;
        if (other.getPodName() != null && other.getPodName().equals(this.getPodName()) == false)
            return false;
        if (other.getNodeName() == null ^ this.getNodeName() == null)
            return false;
        if (other.getNodeName() != null && other.getNodeName().equals(this.getNodeName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceAccountName() == null) ? 0 : getServiceAccountName().hashCode());
        hashCode = prime * hashCode + ((getHostNetwork() == null) ? 0 : getHostNetwork().hashCode());
        hashCode = prime * hashCode + ((getDnsPolicy() == null) ? 0 : getDnsPolicy().hashCode());
        hashCode = prime * hashCode + ((getContainers() == null) ? 0 : getContainers().hashCode());
        hashCode = prime * hashCode + ((getVolumes() == null) ? 0 : getVolumes().hashCode());
        hashCode = prime * hashCode + ((getPodName() == null) ? 0 : getPodName().hashCode());
        hashCode = prime * hashCode + ((getNodeName() == null) ? 0 : getNodeName().hashCode());
        return hashCode;
    }

    @Override
    public EksPodPropertiesDetail clone() {
        try {
            return (EksPodPropertiesDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.EksPodPropertiesDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
