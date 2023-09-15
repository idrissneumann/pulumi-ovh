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

__all__ = ['ServerNetworkingArgs', 'ServerNetworking']

@pulumi.input_type
class ServerNetworkingArgs:
    def __init__(__self__, *,
                 interfaces: pulumi.Input[Sequence[pulumi.Input['ServerNetworkingInterfaceArgs']]],
                 service_name: pulumi.Input[str]):
        """
        The set of arguments for constructing a ServerNetworking resource.
        :param pulumi.Input[Sequence[pulumi.Input['ServerNetworkingInterfaceArgs']]] interfaces: Interface or interfaces aggregation.
        :param pulumi.Input[str] service_name: The service_name of your dedicated server. The full list of available dedicated servers can be found using the `get_servers` datasource.
        """
        pulumi.set(__self__, "interfaces", interfaces)
        pulumi.set(__self__, "service_name", service_name)

    @property
    @pulumi.getter
    def interfaces(self) -> pulumi.Input[Sequence[pulumi.Input['ServerNetworkingInterfaceArgs']]]:
        """
        Interface or interfaces aggregation.
        """
        return pulumi.get(self, "interfaces")

    @interfaces.setter
    def interfaces(self, value: pulumi.Input[Sequence[pulumi.Input['ServerNetworkingInterfaceArgs']]]):
        pulumi.set(self, "interfaces", value)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Input[str]:
        """
        The service_name of your dedicated server. The full list of available dedicated servers can be found using the `get_servers` datasource.
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_name", value)


@pulumi.input_type
class _ServerNetworkingState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 interfaces: Optional[pulumi.Input[Sequence[pulumi.Input['ServerNetworkingInterfaceArgs']]]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ServerNetworking resources.
        :param pulumi.Input[str] description: Operation description.
        :param pulumi.Input[Sequence[pulumi.Input['ServerNetworkingInterfaceArgs']]] interfaces: Interface or interfaces aggregation.
        :param pulumi.Input[str] service_name: The service_name of your dedicated server. The full list of available dedicated servers can be found using the `get_servers` datasource.
        :param pulumi.Input[str] status: status of the networking configuration (should be `active`).
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if interfaces is not None:
            pulumi.set(__self__, "interfaces", interfaces)
        if service_name is not None:
            pulumi.set(__self__, "service_name", service_name)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Operation description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def interfaces(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ServerNetworkingInterfaceArgs']]]]:
        """
        Interface or interfaces aggregation.
        """
        return pulumi.get(self, "interfaces")

    @interfaces.setter
    def interfaces(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ServerNetworkingInterfaceArgs']]]]):
        pulumi.set(self, "interfaces", value)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> Optional[pulumi.Input[str]]:
        """
        The service_name of your dedicated server. The full list of available dedicated servers can be found using the `get_servers` datasource.
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        status of the networking configuration (should be `active`).
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class ServerNetworking(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 interfaces: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServerNetworkingInterfaceArgs']]]]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manage dedicated server networking interface on SCALE and HIGH-GRADE range.

        !> The API route targeted by this resource are restricted to OVHCloud users (`Internal API`) with additional restrictions.

        ## Import

        A dedicated server networking configuration can be imported using the `service_name`. bash

        ```sh
         $ pulumi import ovh:Dedicated/serverNetworking:ServerNetworking server service_name
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServerNetworkingInterfaceArgs']]]] interfaces: Interface or interfaces aggregation.
        :param pulumi.Input[str] service_name: The service_name of your dedicated server. The full list of available dedicated servers can be found using the `get_servers` datasource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServerNetworkingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manage dedicated server networking interface on SCALE and HIGH-GRADE range.

        !> The API route targeted by this resource are restricted to OVHCloud users (`Internal API`) with additional restrictions.

        ## Import

        A dedicated server networking configuration can be imported using the `service_name`. bash

        ```sh
         $ pulumi import ovh:Dedicated/serverNetworking:ServerNetworking server service_name
        ```

        :param str resource_name: The name of the resource.
        :param ServerNetworkingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServerNetworkingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 interfaces: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServerNetworkingInterfaceArgs']]]]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServerNetworkingArgs.__new__(ServerNetworkingArgs)

            if interfaces is None and not opts.urn:
                raise TypeError("Missing required property 'interfaces'")
            __props__.__dict__["interfaces"] = interfaces
            if service_name is None and not opts.urn:
                raise TypeError("Missing required property 'service_name'")
            __props__.__dict__["service_name"] = service_name
            __props__.__dict__["description"] = None
            __props__.__dict__["status"] = None
        super(ServerNetworking, __self__).__init__(
            'ovh:Dedicated/serverNetworking:ServerNetworking',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            interfaces: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServerNetworkingInterfaceArgs']]]]] = None,
            service_name: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'ServerNetworking':
        """
        Get an existing ServerNetworking resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Operation description.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServerNetworkingInterfaceArgs']]]] interfaces: Interface or interfaces aggregation.
        :param pulumi.Input[str] service_name: The service_name of your dedicated server. The full list of available dedicated servers can be found using the `get_servers` datasource.
        :param pulumi.Input[str] status: status of the networking configuration (should be `active`).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServerNetworkingState.__new__(_ServerNetworkingState)

        __props__.__dict__["description"] = description
        __props__.__dict__["interfaces"] = interfaces
        __props__.__dict__["service_name"] = service_name
        __props__.__dict__["status"] = status
        return ServerNetworking(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        Operation description.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def interfaces(self) -> pulumi.Output[Sequence['outputs.ServerNetworkingInterface']]:
        """
        Interface or interfaces aggregation.
        """
        return pulumi.get(self, "interfaces")

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Output[str]:
        """
        The service_name of your dedicated server. The full list of available dedicated servers can be found using the `get_servers` datasource.
        """
        return pulumi.get(self, "service_name")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        status of the networking configuration (should be `active`).
        """
        return pulumi.get(self, "status")

