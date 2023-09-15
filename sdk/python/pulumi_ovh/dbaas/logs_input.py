# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['LogsInputArgs', 'LogsInput']

@pulumi.input_type
class LogsInputArgs:
    def __init__(__self__, *,
                 configuration: pulumi.Input['LogsInputConfigurationArgs'],
                 description: pulumi.Input[str],
                 engine_id: pulumi.Input[str],
                 service_name: pulumi.Input[str],
                 stream_id: pulumi.Input[str],
                 title: pulumi.Input[str],
                 allowed_networks: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 exposed_port: Optional[pulumi.Input[str]] = None,
                 nb_instance: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a LogsInput resource.
        :param pulumi.Input['LogsInputConfigurationArgs'] configuration: Input configuration
        :param pulumi.Input[str] description: Input description
        :param pulumi.Input[str] engine_id: Input engine ID
        :param pulumi.Input[str] service_name: service name
        :param pulumi.Input[str] stream_id: Associated Graylog stream
        :param pulumi.Input[str] title: Input title
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_networks: List of IP blocks
        :param pulumi.Input[str] exposed_port: Port
        :param pulumi.Input[int] nb_instance: Number of instance running
        """
        pulumi.set(__self__, "configuration", configuration)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "engine_id", engine_id)
        pulumi.set(__self__, "service_name", service_name)
        pulumi.set(__self__, "stream_id", stream_id)
        pulumi.set(__self__, "title", title)
        if allowed_networks is not None:
            pulumi.set(__self__, "allowed_networks", allowed_networks)
        if exposed_port is not None:
            pulumi.set(__self__, "exposed_port", exposed_port)
        if nb_instance is not None:
            pulumi.set(__self__, "nb_instance", nb_instance)

    @property
    @pulumi.getter
    def configuration(self) -> pulumi.Input['LogsInputConfigurationArgs']:
        """
        Input configuration
        """
        return pulumi.get(self, "configuration")

    @configuration.setter
    def configuration(self, value: pulumi.Input['LogsInputConfigurationArgs']):
        pulumi.set(self, "configuration", value)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[str]:
        """
        Input description
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="engineId")
    def engine_id(self) -> pulumi.Input[str]:
        """
        Input engine ID
        """
        return pulumi.get(self, "engine_id")

    @engine_id.setter
    def engine_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "engine_id", value)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Input[str]:
        """
        service name
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_name", value)

    @property
    @pulumi.getter(name="streamId")
    def stream_id(self) -> pulumi.Input[str]:
        """
        Associated Graylog stream
        """
        return pulumi.get(self, "stream_id")

    @stream_id.setter
    def stream_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "stream_id", value)

    @property
    @pulumi.getter
    def title(self) -> pulumi.Input[str]:
        """
        Input title
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: pulumi.Input[str]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter(name="allowedNetworks")
    def allowed_networks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of IP blocks
        """
        return pulumi.get(self, "allowed_networks")

    @allowed_networks.setter
    def allowed_networks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "allowed_networks", value)

    @property
    @pulumi.getter(name="exposedPort")
    def exposed_port(self) -> Optional[pulumi.Input[str]]:
        """
        Port
        """
        return pulumi.get(self, "exposed_port")

    @exposed_port.setter
    def exposed_port(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "exposed_port", value)

    @property
    @pulumi.getter(name="nbInstance")
    def nb_instance(self) -> Optional[pulumi.Input[int]]:
        """
        Number of instance running
        """
        return pulumi.get(self, "nb_instance")

    @nb_instance.setter
    def nb_instance(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "nb_instance", value)


@pulumi.input_type
class _LogsInputState:
    def __init__(__self__, *,
                 allowed_networks: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 configuration: Optional[pulumi.Input['LogsInputConfigurationArgs']] = None,
                 created_at: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 engine_id: Optional[pulumi.Input[str]] = None,
                 exposed_port: Optional[pulumi.Input[str]] = None,
                 hostname: Optional[pulumi.Input[str]] = None,
                 input_id: Optional[pulumi.Input[str]] = None,
                 is_restart_required: Optional[pulumi.Input[bool]] = None,
                 nb_instance: Optional[pulumi.Input[int]] = None,
                 public_address: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 ssl_certificate: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 stream_id: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 updated_at: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering LogsInput resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_networks: List of IP blocks
        :param pulumi.Input['LogsInputConfigurationArgs'] configuration: Input configuration
        :param pulumi.Input[str] created_at: Input creation
        :param pulumi.Input[str] description: Input description
        :param pulumi.Input[str] engine_id: Input engine ID
        :param pulumi.Input[str] exposed_port: Port
        :param pulumi.Input[str] hostname: Hostname
        :param pulumi.Input[str] input_id: Input ID
        :param pulumi.Input[bool] is_restart_required: Indicate if input need to be restarted
        :param pulumi.Input[int] nb_instance: Number of instance running
        :param pulumi.Input[str] public_address: Input IP address
        :param pulumi.Input[str] service_name: service name
        :param pulumi.Input[str] ssl_certificate: Input SSL certificate
        :param pulumi.Input[str] status: init: configuration required, pending: ready to start, running: available
        :param pulumi.Input[str] stream_id: Associated Graylog stream
        :param pulumi.Input[str] title: Input title
        :param pulumi.Input[str] updated_at: Input last update
        """
        if allowed_networks is not None:
            pulumi.set(__self__, "allowed_networks", allowed_networks)
        if configuration is not None:
            pulumi.set(__self__, "configuration", configuration)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if engine_id is not None:
            pulumi.set(__self__, "engine_id", engine_id)
        if exposed_port is not None:
            pulumi.set(__self__, "exposed_port", exposed_port)
        if hostname is not None:
            pulumi.set(__self__, "hostname", hostname)
        if input_id is not None:
            pulumi.set(__self__, "input_id", input_id)
        if is_restart_required is not None:
            pulumi.set(__self__, "is_restart_required", is_restart_required)
        if nb_instance is not None:
            pulumi.set(__self__, "nb_instance", nb_instance)
        if public_address is not None:
            pulumi.set(__self__, "public_address", public_address)
        if service_name is not None:
            pulumi.set(__self__, "service_name", service_name)
        if ssl_certificate is not None:
            pulumi.set(__self__, "ssl_certificate", ssl_certificate)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if stream_id is not None:
            pulumi.set(__self__, "stream_id", stream_id)
        if title is not None:
            pulumi.set(__self__, "title", title)
        if updated_at is not None:
            pulumi.set(__self__, "updated_at", updated_at)

    @property
    @pulumi.getter(name="allowedNetworks")
    def allowed_networks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of IP blocks
        """
        return pulumi.get(self, "allowed_networks")

    @allowed_networks.setter
    def allowed_networks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "allowed_networks", value)

    @property
    @pulumi.getter
    def configuration(self) -> Optional[pulumi.Input['LogsInputConfigurationArgs']]:
        """
        Input configuration
        """
        return pulumi.get(self, "configuration")

    @configuration.setter
    def configuration(self, value: Optional[pulumi.Input['LogsInputConfigurationArgs']]):
        pulumi.set(self, "configuration", value)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        Input creation
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Input description
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="engineId")
    def engine_id(self) -> Optional[pulumi.Input[str]]:
        """
        Input engine ID
        """
        return pulumi.get(self, "engine_id")

    @engine_id.setter
    def engine_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "engine_id", value)

    @property
    @pulumi.getter(name="exposedPort")
    def exposed_port(self) -> Optional[pulumi.Input[str]]:
        """
        Port
        """
        return pulumi.get(self, "exposed_port")

    @exposed_port.setter
    def exposed_port(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "exposed_port", value)

    @property
    @pulumi.getter
    def hostname(self) -> Optional[pulumi.Input[str]]:
        """
        Hostname
        """
        return pulumi.get(self, "hostname")

    @hostname.setter
    def hostname(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "hostname", value)

    @property
    @pulumi.getter(name="inputId")
    def input_id(self) -> Optional[pulumi.Input[str]]:
        """
        Input ID
        """
        return pulumi.get(self, "input_id")

    @input_id.setter
    def input_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "input_id", value)

    @property
    @pulumi.getter(name="isRestartRequired")
    def is_restart_required(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicate if input need to be restarted
        """
        return pulumi.get(self, "is_restart_required")

    @is_restart_required.setter
    def is_restart_required(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_restart_required", value)

    @property
    @pulumi.getter(name="nbInstance")
    def nb_instance(self) -> Optional[pulumi.Input[int]]:
        """
        Number of instance running
        """
        return pulumi.get(self, "nb_instance")

    @nb_instance.setter
    def nb_instance(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "nb_instance", value)

    @property
    @pulumi.getter(name="publicAddress")
    def public_address(self) -> Optional[pulumi.Input[str]]:
        """
        Input IP address
        """
        return pulumi.get(self, "public_address")

    @public_address.setter
    def public_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "public_address", value)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> Optional[pulumi.Input[str]]:
        """
        service name
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_name", value)

    @property
    @pulumi.getter(name="sslCertificate")
    def ssl_certificate(self) -> Optional[pulumi.Input[str]]:
        """
        Input SSL certificate
        """
        return pulumi.get(self, "ssl_certificate")

    @ssl_certificate.setter
    def ssl_certificate(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ssl_certificate", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        init: configuration required, pending: ready to start, running: available
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="streamId")
    def stream_id(self) -> Optional[pulumi.Input[str]]:
        """
        Associated Graylog stream
        """
        return pulumi.get(self, "stream_id")

    @stream_id.setter
    def stream_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "stream_id", value)

    @property
    @pulumi.getter
    def title(self) -> Optional[pulumi.Input[str]]:
        """
        Input title
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> Optional[pulumi.Input[str]]:
        """
        Input last update
        """
        return pulumi.get(self, "updated_at")

    @updated_at.setter
    def updated_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated_at", value)


class LogsInput(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allowed_networks: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 configuration: Optional[pulumi.Input[pulumi.InputType['LogsInputConfigurationArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 engine_id: Optional[pulumi.Input[str]] = None,
                 exposed_port: Optional[pulumi.Input[str]] = None,
                 nb_instance: Optional[pulumi.Input[int]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 stream_id: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates a dbaas logs input.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_ovh as ovh

        logstash = ovh.Dbaas.get_logs_input_engine(name="logstash",
            version="7.x")
        stream = ovh.dbaas.LogsOutputGraylogStream("stream",
            service_name="....",
            title="my stream",
            description="my graylog stream")
        input = ovh.dbaas.LogsInput("input",
            service_name=stream.service_name,
            description=stream.description,
            title=stream.title,
            engine_id=logstash.id,
            stream_id=stream.id,
            allowed_networks=["10.0.0.0/16"],
            exposed_port="6154",
            nb_instance=2,
            configuration=ovh.dbaas.LogsInputConfigurationArgs(
                logstash=ovh.dbaas.LogsInputConfigurationLogstashArgs(
                    input_section=\"\"\"  beats {
            port => 6514
            ssl => true
            ssl_certificate => "/etc/ssl/private/server.crt"
            ssl_key => "/etc/ssl/private/server.key"
          }
        \"\"\",
                ),
            ))
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_networks: List of IP blocks
        :param pulumi.Input[pulumi.InputType['LogsInputConfigurationArgs']] configuration: Input configuration
        :param pulumi.Input[str] description: Input description
        :param pulumi.Input[str] engine_id: Input engine ID
        :param pulumi.Input[str] exposed_port: Port
        :param pulumi.Input[int] nb_instance: Number of instance running
        :param pulumi.Input[str] service_name: service name
        :param pulumi.Input[str] stream_id: Associated Graylog stream
        :param pulumi.Input[str] title: Input title
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LogsInputArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates a dbaas logs input.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_ovh as ovh

        logstash = ovh.Dbaas.get_logs_input_engine(name="logstash",
            version="7.x")
        stream = ovh.dbaas.LogsOutputGraylogStream("stream",
            service_name="....",
            title="my stream",
            description="my graylog stream")
        input = ovh.dbaas.LogsInput("input",
            service_name=stream.service_name,
            description=stream.description,
            title=stream.title,
            engine_id=logstash.id,
            stream_id=stream.id,
            allowed_networks=["10.0.0.0/16"],
            exposed_port="6154",
            nb_instance=2,
            configuration=ovh.dbaas.LogsInputConfigurationArgs(
                logstash=ovh.dbaas.LogsInputConfigurationLogstashArgs(
                    input_section=\"\"\"  beats {
            port => 6514
            ssl => true
            ssl_certificate => "/etc/ssl/private/server.crt"
            ssl_key => "/etc/ssl/private/server.key"
          }
        \"\"\",
                ),
            ))
        ```

        :param str resource_name: The name of the resource.
        :param LogsInputArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LogsInputArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allowed_networks: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 configuration: Optional[pulumi.Input[pulumi.InputType['LogsInputConfigurationArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 engine_id: Optional[pulumi.Input[str]] = None,
                 exposed_port: Optional[pulumi.Input[str]] = None,
                 nb_instance: Optional[pulumi.Input[int]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 stream_id: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LogsInputArgs.__new__(LogsInputArgs)

            __props__.__dict__["allowed_networks"] = allowed_networks
            if configuration is None and not opts.urn:
                raise TypeError("Missing required property 'configuration'")
            __props__.__dict__["configuration"] = configuration
            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            if engine_id is None and not opts.urn:
                raise TypeError("Missing required property 'engine_id'")
            __props__.__dict__["engine_id"] = engine_id
            __props__.__dict__["exposed_port"] = exposed_port
            __props__.__dict__["nb_instance"] = nb_instance
            if service_name is None and not opts.urn:
                raise TypeError("Missing required property 'service_name'")
            __props__.__dict__["service_name"] = service_name
            if stream_id is None and not opts.urn:
                raise TypeError("Missing required property 'stream_id'")
            __props__.__dict__["stream_id"] = stream_id
            if title is None and not opts.urn:
                raise TypeError("Missing required property 'title'")
            __props__.__dict__["title"] = title
            __props__.__dict__["created_at"] = None
            __props__.__dict__["hostname"] = None
            __props__.__dict__["input_id"] = None
            __props__.__dict__["is_restart_required"] = None
            __props__.__dict__["public_address"] = None
            __props__.__dict__["ssl_certificate"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["updated_at"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["sslCertificate"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(LogsInput, __self__).__init__(
            'ovh:Dbaas/logsInput:LogsInput',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allowed_networks: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            configuration: Optional[pulumi.Input[pulumi.InputType['LogsInputConfigurationArgs']]] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            engine_id: Optional[pulumi.Input[str]] = None,
            exposed_port: Optional[pulumi.Input[str]] = None,
            hostname: Optional[pulumi.Input[str]] = None,
            input_id: Optional[pulumi.Input[str]] = None,
            is_restart_required: Optional[pulumi.Input[bool]] = None,
            nb_instance: Optional[pulumi.Input[int]] = None,
            public_address: Optional[pulumi.Input[str]] = None,
            service_name: Optional[pulumi.Input[str]] = None,
            ssl_certificate: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            stream_id: Optional[pulumi.Input[str]] = None,
            title: Optional[pulumi.Input[str]] = None,
            updated_at: Optional[pulumi.Input[str]] = None) -> 'LogsInput':
        """
        Get an existing LogsInput resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_networks: List of IP blocks
        :param pulumi.Input[pulumi.InputType['LogsInputConfigurationArgs']] configuration: Input configuration
        :param pulumi.Input[str] created_at: Input creation
        :param pulumi.Input[str] description: Input description
        :param pulumi.Input[str] engine_id: Input engine ID
        :param pulumi.Input[str] exposed_port: Port
        :param pulumi.Input[str] hostname: Hostname
        :param pulumi.Input[str] input_id: Input ID
        :param pulumi.Input[bool] is_restart_required: Indicate if input need to be restarted
        :param pulumi.Input[int] nb_instance: Number of instance running
        :param pulumi.Input[str] public_address: Input IP address
        :param pulumi.Input[str] service_name: service name
        :param pulumi.Input[str] ssl_certificate: Input SSL certificate
        :param pulumi.Input[str] status: init: configuration required, pending: ready to start, running: available
        :param pulumi.Input[str] stream_id: Associated Graylog stream
        :param pulumi.Input[str] title: Input title
        :param pulumi.Input[str] updated_at: Input last update
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LogsInputState.__new__(_LogsInputState)

        __props__.__dict__["allowed_networks"] = allowed_networks
        __props__.__dict__["configuration"] = configuration
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["description"] = description
        __props__.__dict__["engine_id"] = engine_id
        __props__.__dict__["exposed_port"] = exposed_port
        __props__.__dict__["hostname"] = hostname
        __props__.__dict__["input_id"] = input_id
        __props__.__dict__["is_restart_required"] = is_restart_required
        __props__.__dict__["nb_instance"] = nb_instance
        __props__.__dict__["public_address"] = public_address
        __props__.__dict__["service_name"] = service_name
        __props__.__dict__["ssl_certificate"] = ssl_certificate
        __props__.__dict__["status"] = status
        __props__.__dict__["stream_id"] = stream_id
        __props__.__dict__["title"] = title
        __props__.__dict__["updated_at"] = updated_at
        return LogsInput(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allowedNetworks")
    def allowed_networks(self) -> pulumi.Output[Sequence[str]]:
        """
        List of IP blocks
        """
        return pulumi.get(self, "allowed_networks")

    @property
    @pulumi.getter
    def configuration(self) -> pulumi.Output['outputs.LogsInputConfiguration']:
        """
        Input configuration
        """
        return pulumi.get(self, "configuration")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        Input creation
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        Input description
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="engineId")
    def engine_id(self) -> pulumi.Output[str]:
        """
        Input engine ID
        """
        return pulumi.get(self, "engine_id")

    @property
    @pulumi.getter(name="exposedPort")
    def exposed_port(self) -> pulumi.Output[str]:
        """
        Port
        """
        return pulumi.get(self, "exposed_port")

    @property
    @pulumi.getter
    def hostname(self) -> pulumi.Output[str]:
        """
        Hostname
        """
        return pulumi.get(self, "hostname")

    @property
    @pulumi.getter(name="inputId")
    def input_id(self) -> pulumi.Output[str]:
        """
        Input ID
        """
        return pulumi.get(self, "input_id")

    @property
    @pulumi.getter(name="isRestartRequired")
    def is_restart_required(self) -> pulumi.Output[bool]:
        """
        Indicate if input need to be restarted
        """
        return pulumi.get(self, "is_restart_required")

    @property
    @pulumi.getter(name="nbInstance")
    def nb_instance(self) -> pulumi.Output[int]:
        """
        Number of instance running
        """
        return pulumi.get(self, "nb_instance")

    @property
    @pulumi.getter(name="publicAddress")
    def public_address(self) -> pulumi.Output[str]:
        """
        Input IP address
        """
        return pulumi.get(self, "public_address")

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Output[str]:
        """
        service name
        """
        return pulumi.get(self, "service_name")

    @property
    @pulumi.getter(name="sslCertificate")
    def ssl_certificate(self) -> pulumi.Output[str]:
        """
        Input SSL certificate
        """
        return pulumi.get(self, "ssl_certificate")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        init: configuration required, pending: ready to start, running: available
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="streamId")
    def stream_id(self) -> pulumi.Output[str]:
        """
        Associated Graylog stream
        """
        return pulumi.get(self, "stream_id")

    @property
    @pulumi.getter
    def title(self) -> pulumi.Output[str]:
        """
        Input title
        """
        return pulumi.get(self, "title")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[str]:
        """
        Input last update
        """
        return pulumi.get(self, "updated_at")

