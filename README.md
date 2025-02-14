# The Picnic Vulnerable Web Application

Hello Hello

This image contains multiple vulnerabilities and must only be used to simulate a vulnerability assessment exercise.


## Building the image

1. Clone the repository locally
2. Run the following command in the local repository directory to allow execution of the `build` script:
```bash
chmod a+x build.sh
```
3. Run the `build` script
```bash
./build.sh
```

## Running the image locally

1. Run the following command in the local repository directory to allow execution of the `run` script:
```bash
chmod a+x run.sh
```
2. Execute the `run` script
```bash
./run.sh
```

### Ports used by this image

Make sure the following ports are available, otherwise modify the port mapping in the `run` script.

```
WebApp
Port 8080/tcp

FTP
Port 20/tcp
Port 21/tcp

SMB
Port 137/udp
Port 138/udp
Port 139/tcp
Port 445/tcp

Other
Port 6200/tcp

Hello Prismaaaaa
```
