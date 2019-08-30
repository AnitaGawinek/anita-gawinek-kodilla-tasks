#!/usr/bin/env bash

run_crud()
{
    if ./runcrud.sh; then
        echo "runcrud.sh opened succesfully"
    else
        echo "Cannot open runcrud.sh"
    fi
}

success()
{
    echo "Success"
}

fail()
{
    echo "Fail"
}

run_opera()
{
    open -a /Applications/Opera.app http://localhost:8080/crud/v1/task/getTasks
}

if run_crud; then
    run_opera
    success
else
    fail
fi
