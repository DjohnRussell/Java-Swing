#!/bin/bash
DONE="File is sent:) you rock mr man!"
scp -r BestillingsAppV2 remoteserver@172.16.47.135:Desktop/Auto_Mat

echo "${DONE}"
