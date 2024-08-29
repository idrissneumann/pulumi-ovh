# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['FirewallArgs', 'Firewall']

@pulumi.input_type
class FirewallArgs:
    def __init__(__self__, *,
                 ip: pulumi.Input[str],
                 ip_on_firewall: pulumi.Input[str],
                 enabled: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a Firewall resource.
        :param pulumi.Input[str] ip: The IP or the CIDR
        :param pulumi.Input[str] ip_on_firewall: IPv4 address
               * `enabled ` - Whether firewall should be enabled
        """
        pulumi.set(__self__, "ip", ip)
        pulumi.set(__self__, "ip_on_firewall", ip_on_firewall)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)

    @property
    @pulumi.getter
    def ip(self) -> pulumi.Input[str]:
        """
        The IP or the CIDR
        """
        return pulumi.get(self, "ip")

    @ip.setter
    def ip(self, value: pulumi.Input[str]):
        pulumi.set(self, "ip", value)

    @property
    @pulumi.getter(name="ipOnFirewall")
    def ip_on_firewall(self) -> pulumi.Input[str]:
        """
        IPv4 address
        * `enabled ` - Whether firewall should be enabled
        """
        return pulumi.get(self, "ip_on_firewall")

    @ip_on_firewall.setter
    def ip_on_firewall(self, value: pulumi.Input[str]):
        pulumi.set(self, "ip_on_firewall", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)


@pulumi.input_type
class _FirewallState:
    def __init__(__self__, *,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 ip_on_firewall: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Firewall resources.
        :param pulumi.Input[str] ip: The IP or the CIDR
        :param pulumi.Input[str] ip_on_firewall: IPv4 address
               * `enabled ` - Whether firewall should be enabled
        :param pulumi.Input[str] state: Current state of your ip on firewall
        """
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if ip is not None:
            pulumi.set(__self__, "ip", ip)
        if ip_on_firewall is not None:
            pulumi.set(__self__, "ip_on_firewall", ip_on_firewall)
        if state is not None:
            pulumi.set(__self__, "state", state)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def ip(self) -> Optional[pulumi.Input[str]]:
        """
        The IP or the CIDR
        """
        return pulumi.get(self, "ip")

    @ip.setter
    def ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip", value)

    @property
    @pulumi.getter(name="ipOnFirewall")
    def ip_on_firewall(self) -> Optional[pulumi.Input[str]]:
        """
        IPv4 address
        * `enabled ` - Whether firewall should be enabled
        """
        return pulumi.get(self, "ip_on_firewall")

    @ip_on_firewall.setter
    def ip_on_firewall(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_on_firewall", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        Current state of your ip on firewall
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)


class Firewall(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 ip_on_firewall: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Use this resource to manage an IP firewall.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_ovh as ovh

        myfirewall = ovh.ip.Firewall("myfirewall",
            ip="XXXXXX",
            ip_on_firewall="XXXXXX")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] ip: The IP or the CIDR
        :param pulumi.Input[str] ip_on_firewall: IPv4 address
               * `enabled ` - Whether firewall should be enabled
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FirewallArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Use this resource to manage an IP firewall.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_ovh as ovh

        myfirewall = ovh.ip.Firewall("myfirewall",
            ip="XXXXXX",
            ip_on_firewall="XXXXXX")
        ```

        :param str resource_name: The name of the resource.
        :param FirewallArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FirewallArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 ip_on_firewall: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FirewallArgs.__new__(FirewallArgs)

            __props__.__dict__["enabled"] = enabled
            if ip is None and not opts.urn:
                raise TypeError("Missing required property 'ip'")
            __props__.__dict__["ip"] = ip
            if ip_on_firewall is None and not opts.urn:
                raise TypeError("Missing required property 'ip_on_firewall'")
            __props__.__dict__["ip_on_firewall"] = ip_on_firewall
            __props__.__dict__["state"] = None
        super(Firewall, __self__).__init__(
            'ovh:Ip/firewall:Firewall',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            ip: Optional[pulumi.Input[str]] = None,
            ip_on_firewall: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None) -> 'Firewall':
        """
        Get an existing Firewall resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] ip: The IP or the CIDR
        :param pulumi.Input[str] ip_on_firewall: IPv4 address
               * `enabled ` - Whether firewall should be enabled
        :param pulumi.Input[str] state: Current state of your ip on firewall
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FirewallState.__new__(_FirewallState)

        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["ip"] = ip
        __props__.__dict__["ip_on_firewall"] = ip_on_firewall
        __props__.__dict__["state"] = state
        return Firewall(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def ip(self) -> pulumi.Output[str]:
        """
        The IP or the CIDR
        """
        return pulumi.get(self, "ip")

    @property
    @pulumi.getter(name="ipOnFirewall")
    def ip_on_firewall(self) -> pulumi.Output[str]:
        """
        IPv4 address
        * `enabled ` - Whether firewall should be enabled
        """
        return pulumi.get(self, "ip_on_firewall")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        Current state of your ip on firewall
        """
        return pulumi.get(self, "state")
